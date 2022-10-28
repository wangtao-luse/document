package com.explore.common;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.junit.jupiter.api.Test;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.ConstVal;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


public class TestCodeGenerator {
	@Test
public void test() {
		TestCodeGenerator code = new TestCodeGenerator();
		String mod = "explore-member-service";
		String packagePrefix = "member";
		String [] tables = {"t_m_member","t_m_oauth","t_m_login_list","t_m_ip_address"};
		String [] tablePrefix= {"t_m_"};
		code.mybatisPlusHelper1(mod, packagePrefix, tables, tablePrefix);
}

private Properties GeneratorConfig(String mod,String packagePrefix) {
	File file = new File(System.getProperty("user.dir"));
	String domain = mod.substring(0, mod.indexOf("-"));
	String module = mod.substring(0, mod.lastIndexOf("-"));
	String parent = "com." + domain;
	String entity = "model." + packagePrefix;
	String mapper = packagePrefix + ".persist";
	String serviceImpl = packagePrefix + ".service";
	String service = "";
	String controller = "";
	String entity_path = file.getParent()+"/"+domain+"-model/src/main/java/com/"+domain+"/model/"+packagePrefix;
	String mapper_path = file.getParent()+"/"+module+"-persist/src/main/java/com/"+domain+"/"+packagePrefix+"/persist";
	String xml_path = file.getParent()+"/"+module+"-persist/src/main/resources/mapping";
	String serviceImpl_path = file.getParent()+"/"+module+"-service/src/main/java/com/"+domain+"/"+packagePrefix+"/service";
	String service_path = "";
	String controller_path = "";
	String author ="wangtao";
	Properties  p = new Properties();
	//设置包名
	p.put("parent", parent);// 指定父包名;如com.baidu
	p.put("entity", entity);//com.baidu.model.member
	p.put("mapper", mapper);//com.baidu.member.persist
	p.put("serviceImpl", serviceImpl);//com.baidu.member.service
	p.put("service", service);	
	p.put("controller", controller);//
	//设置文件位置
	p.put("entity_path", entity_path);// /baidu-model/src/main/java/com.baidu.model.member
	p.put("mapper_path", mapper_path);// /baidu-member-persist/src/main/java/com.baidu.member.persist
	p.put("xml_path", xml_path);      // /baidu-member-persist/src/main/resources/mapping/
	p.put("serviceImp_path", serviceImpl_path);// /baidu-member-service/src/main/java/com.baidu.member.service
	p.put("service_path", service_path);
	p.put("controller_path", controller_path);
	
    p.put("author", author);
    p.put("enableSwagger", "0");//1:开启;
    p.put("fileOverride", "1");//1:覆盖文件
    
    p.put("serviceImplName", "%sService");//设置serviceImpl 命名,默认ServiceImpl
    p.put("baseColumnList", "1");//开启baseColumnList,默认关闭
    p.put("baseResultMap", "1");//开启baseResultMap,默认关闭
    
	return p;
}
/**
 * 3.4.1	
 * @param mod
 * @param packagePrefix
 * @param tables
 * @param tablePrefix
 */
private  void mybatisPlusHelper1(String mod,String packagePrefix,String[] tables,String[] tablePrefix) {
		Properties propertie = GeneratorConfig(mod, packagePrefix); // 全局配置
		GlobalConfig  globalConfig = new GlobalConfig();
		globalConfig.setAuthor(propertie.getProperty("author"));
		if ("1".equals(propertie.getProperty("enableSwagger"))) {
			globalConfig.setSwagger2(true);
		}
		if ("1".equals(propertie.getProperty("fileOverride"))) {
			globalConfig.setFileOverride(true);
		}
		if ("1".equals(propertie.getProperty("baseColumnList"))) {
			globalConfig.setBaseColumnList(true);
		}
		if ("1".equals(propertie.getProperty("baseResultMap"))) {
			globalConfig.setBaseResultMap(true);
		}
		globalConfig.setOpen(true);		
		globalConfig.setServiceImplName(propertie.getProperty("serviceImplName"));
		// 包名策略配置
		PackageConfig packageConfig = new PackageConfig();
		Map<String, String> pathInfo = new HashMap<String, String>();
		pathInfo.put(ConstVal.ENTITY_PATH, propertie.getProperty("entity_path"));
		pathInfo.put(ConstVal.SERVICE_PATH, "");
		pathInfo.put(ConstVal.CONTROLLER_PATH, "");
		pathInfo.put(ConstVal.SERVICE_IMPL_PATH, propertie.getProperty("serviceImp_path"));
		pathInfo.put(ConstVal.MAPPER_PATH, propertie.getProperty("mapper_path"));
		pathInfo.put(ConstVal.XML_PATH, propertie.getProperty("xml_path"));
		packageConfig.setPathInfo(pathInfo);
		packageConfig.setParent(propertie.getProperty("parent"));
		packageConfig.setEntity(propertie.getProperty("entity"));
		packageConfig.setMapper(propertie.getProperty("mapper"));
		packageConfig.setServiceImpl(propertie.getProperty("serviceImpl"));
		packageConfig.setService("");
		packageConfig.setController("");
		// 策略配置 
		StrategyConfig strategyConfig = new StrategyConfig();
		strategyConfig.setInclude(tables);
		strategyConfig.setTablePrefix(tablePrefix);
		strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
		strategyConfig.setNaming(NamingStrategy.underline_to_camel);
		HashMap<String, String> dataSource = getDataSource(mod); 
		
		// 数据源配置https://blog.csdn.net/chyo098/article/details/118994991
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setUrl(dataSource.get("url"));
		dataSourceConfig.setUsername(dataSource.get("username"));
		dataSourceConfig.setPassword(dataSource.get("password"));
		dataSourceConfig.setDriverName(dataSource.get("driverName"));
		
		//模板配置
		//TemplateConfig templateConfig = new TemplateConfig();
       // templateConfig.disable(TemplateType.CONTROLLER, TemplateType.SERVICE);
		// 创建代码生成器对象，加载配置 
		AutoGenerator autoGenerator = new AutoGenerator();
		autoGenerator.setDataSource(dataSourceConfig);
		autoGenerator.setGlobalConfig(globalConfig);
		autoGenerator.setPackageInfo(packageConfig);
		autoGenerator.setStrategy(strategyConfig);
		autoGenerator.execute();
	 
	
}
/**
 * 数据库信息配置
 * @param mod
 * @return
 */
private  HashMap<String, String>getDataSource(String mod){
	HashMap<String, String> result = new HashMap<String, String>();
	if("explore-member-service".equals(mod)) {
		result.put("url", "jdbc:mysql://1.116.226.147:3306/member?serverTimezone=UTC");
		result.put("username", "root");
		result.put("password", "mysql@958958");
		result.put("driverName", "com.mysql.cj.jdbc.Driver");//3.4.1
		
	}
	return result;
}
/**
 * 
 * @param mod 模块名称
 * @param packagePrex 包名的前缀 com.explore.XXX.service
 * @param tables 表名
 * @param tablePrefix 忽略表前缀
 */
private  void mybatisPlusHelp(String mod,String packagePrefix,String[] tables,String[] tablePrefix) {
		//3.5.1
		/*
		 * Properties propertie = GeneratorConfig(mod, packagePrefix); HashMap<String,
		 * String> dataSource = getDataSource(mod);
		 * FastAutoGenerator.create(dataSource.get("url"), dataSource.get("username"),
		 * dataSource.get("password")) .globalConfig(builder -> {
		 * builder.author(propertie.getProperty("author")); if
		 * ("1".equals(propertie.getProperty("enableSwagger"))) {
		 * builder.enableSwagger(); } if
		 * ("1".equals(propertie.getProperty("fileOverride"))) { builder.fileOverride();
		 * } builder.disableOpenDir();
		 * 
		 * }).packageConfig(builder -> {
		 * 
		 * @NotNull Map<OutputFile, String> pathInfo = new HashMap<OutputFile,
		 * String>(); pathInfo.put(OutputFile.entity,
		 * propertie.getProperty("entity_path")); pathInfo.put(OutputFile.service, "");
		 * pathInfo.put(OutputFile.controller, ""); pathInfo.put(OutputFile.serviceImpl,
		 * propertie.getProperty("serviceImp_path")); pathInfo.put(OutputFile.mapper,
		 * propertie.getProperty("mapper_path")); pathInfo.put(OutputFile.mapperXml,
		 * propertie.getProperty("xml_path"));
		 * builder.pathInfo(pathInfo).parent(propertie.getProperty("parent"))
		 * .entity(propertie.getProperty("entity")).mapper(propertie.getProperty(
		 * "mapper"))
		 * .serviceImpl(propertie.getProperty("serviceImpl")).service("").controller("")
		 * ;
		 * 
		 * }).strategyConfig(builder -> {
		 * builder.addInclude(Arrays.stream(tables).collect(Collectors.toList())).
		 * addTablePrefix(tablePrefix); }).execute();
		 */

}
private  void mybatisPlusHelper(String mod,String packagePrefix,String[] tables,String[] tablePrefix) {
//3.5.0	
	/*
		 * Properties propertie = GeneratorConfig(mod, packagePrefix); //全局配置
		 * GlobalConfig.Builder globalConfig = new GlobalConfig.Builder();
		 * globalConfig.author(propertie.getProperty("author")); if
		 * ("1".equals(propertie.getProperty("enableSwagger"))) {
		 * globalConfig.enableSwagger(); } if
		 * ("1".equals(propertie.getProperty("fileOverride"))) {
		 * globalConfig.fileOverride(); } globalConfig.openDir(false); //包名策略配置
		 * PackageConfig.Builder packageConfig = new PackageConfig.Builder();
		 * Map<String, String> pathInfo = new HashMap<String, String>();
		 * pathInfo.put(ConstVal.ENTITY, propertie.getProperty("entity_path"));
		 * pathInfo.put(ConstVal.SERVICE, ""); pathInfo.put(ConstVal.CONTROLLER, "");
		 * pathInfo.put(ConstVal.SERVICE_IMPL,
		 * propertie.getProperty("serviceImp_path")); pathInfo.put(ConstVal.MAPPER,
		 * propertie.getProperty("mapper_path")); pathInfo.put(ConstVal.XML,
		 * propertie.getProperty("xml_path")); packageConfig.pathInfo(pathInfo)
		 * .parent(propertie.getProperty("parent"))
		 * .entity(propertie.getProperty("entity"))
		 * .mapper(propertie.getProperty("mapper"))
		 * .serviceImpl(propertie.getProperty("serviceImpl")) .service("")
		 * .controller("");
		 * 
		 * //策略配置 StrategyConfig.Builder strategyConfig = new StrategyConfig.Builder();
		 * strategyConfig.addExclude(tables) .addTablePrefix(tablePrefix);
		 * HashMap<String, String> dataSource = getDataSource(mod); //数据源配置
		 * DataSourceConfig.Builder dataSourceConfigBuilder = new
		 * DataSourceConfig.Builder(dataSource.get("url"), dataSource.get("username"),
		 * dataSource.get("password")); // 创建代码生成器对象，加载配置 AutoGenerator autoGenerator =
		 * new AutoGenerator(dataSourceConfigBuilder.build());
		 * autoGenerator.global(globalConfig.build());
		 * autoGenerator.packageInfo(packageConfig.build());
		 * autoGenerator.strategy(strategyConfig.build()); autoGenerator.execute();
		 */

}

}