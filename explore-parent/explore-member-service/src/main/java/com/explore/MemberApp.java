package com.explore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.explore.member.persist")//扫描指定的Mapper文件
public class MemberApp {
public static void main(String[] args) {
	SpringApplication.run(MemberApp.class, args);
}
}
