create database IF NOT EXISTS member;
use member;
--1.用户表
CREATE TABLE IF NOT EXISTS t_m_member(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
uid	 VARCHAR(10)	COMMENT'用户唯一标识',	
create_date	BIGINT	COMMENT'创建日期',	
ip	 VARCHAR(15)	COMMENT'Ip地址',	
last_time	BIGINT	COMMENT'上次登录时间',	
status	VARCHAR(2)	COMMENT'用户状态(0:禁用；1:正常)'
)COMMENT '用户表';
--2.认证表
CREATE TABLE IF NOT EXISTS t_m_oauth(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
uid	VARCHAR(10)	COMMENT'用户唯一标识',
oauth_id	VARCHAR(120)	COMMENT'第三方登录唯一ID',
oauth_type	VARCHAR(18)	COMMENT'第三方登录平台标识',
credential	VARCHAR(32)	COMMENT'密码凭证',
nickname	VARCHAR(18)	COMMENT'昵称',
avatar	VARCHAR(150)	COMMENT'图像',
passwd	VARCHAR(36)	COMMENT'盐'
)COMMENT '认证表';
--3.登录记录表
CREATE TABLE IF NOT EXISTS t_m_login_list(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
oauth_id	VARCHAR(120)	COMMENT'用户唯一标识',
oauth_type			VARCHAR(18)	COMMENT'登录平台标识',
login_at	BIGINT	COMMENT'登录时间',
login_ip	VARCHAR(15)	COMMENT'登录ip',
login_addr	VARCHAR(18)	COMMENT'登录地'
)COMMENT'登录记录表';
--4.IP记录表
CREATE TABLE IF NOT EXISTS t_m_ip_address(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
ip	VARCHAR(15)	COMMENT'ip地址',
isp	VARCHAR(40)	COMMENT'网络服务供应商',
country_code	VARCHAR(18)	COMMENT'国家编号',
country	VARCHAR(18)	COMMENT'国家名称',
area	VARCHAR(18)	COMMENT'区名称',
latitude	FLOAT	COMMENT'纬度',
longitude	FLOAT	COMMENT'经度'
)COMMENT'ip记录表';


--1.组表
CREATE TABLE IF NOT EXISTS t_m_group(
gid	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
gname VARCHAR(30) COMMENT'组名称',
parent INT COMMENT'所属组编号',
create_at BIGINT COMMENT'创建日期',
des VARCHAR(50)COMMENT'组描述',
uid	VARCHAR(10)	COMMENT'用户唯一标识'
)COMMENT'用户组表';
--2.用户-组表
CREATE TABLE IF NOT EXISTS t_m_mem_group(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
uid	VARCHAR(10)	COMMENT'用户唯一标识',
gid	INT COMMENT'组编号'
)COMMENT'用户-组表';

--3.角色表
CREATE TABLE IF NOT EXISTS t_m_role(
rid	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
rname VARCHAR(30) COMMENT'角色名称',
create_at BIGINT COMMENT'创建日期',
des VARCHAR(50) COMMENT '角色描述',
uid	VARCHAR(10)	COMMENT'用户唯一标识'
)COMMENT'角色表';
--4.组-角色表
CREATE TABLE IF NOT EXISTS t_m_group_role(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
gid  INT COMMENT '组编号',
rid   INT COMMENT '角色编号'
)COMMENT'组-角色表';
--5.权限表
CREATE TABLE IF NOT EXISTS t_m_right(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
right_id VARCHAR(10) COMMENT'权限标识',
right_link VARCHAR(100) COMMENT'权限名称',
login VARCHAR(5)COMMENT'是否登录(anon 不需要登录 authc 需要登录)',
des VARCHAR(80) COMMENT'描述',
log VARCHAR(2) COMMENT'是否记日志(0:不需要;1:需要)'
)COMMENT'权限表';
--6.角色-权限表
CREATE TABLE IF NOT EXISTS t_m_role_right(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
role_id INT COMMENT '角色编号',
right_id INT COMMENT '权限编号'
)COMMENT'角色-权限表';

--7.菜单权限表
CREATE TABLE IF NOT EXISTS t_m_meun_right(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
right_id VARCHAR(10) COMMENT'权限标识',
menu_name VARCHAR(18) COMMENT'菜单名称',
parent_id VARCHAR(18) COMMENT'上级菜单编号(0:顶级菜单)',
menu_type VARCHAR(2) COMMENT'菜单类型(1:菜单;2:按钮)',
menu_url VARCHAR(60) COMMENT'菜单url',
level VARCHAR(18) COMMENT'菜单的层次'
)COMMENT'菜单权限表';




--1.用户表
CREATE TABLE IF NOT EXISTS t_sys_member(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
uid	 VARCHAR(10)	COMMENT'用户唯一标识',	
create_date	BIGINT	COMMENT'创建日期',	
ip	 VARCHAR(15)	COMMENT'Ip地址',	
last_time	BIGINT	COMMENT'上次登录时间',	
status	VARCHAR(2)	COMMENT'用户状态(0:禁用；1:正常)'
)COMMENT '用户表';
--2.认证表
CREATE TABLE IF NOT EXISTS t_sys_oauth(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
uid	VARCHAR(10)	COMMENT'用户唯一标识',
oauth_id	VARCHAR(120)	COMMENT'第三方登录唯一ID',
oauth_type	VARCHAR(18)	COMMENT'第三方登录平台标识',
credential	VARCHAR(32)	COMMENT'密码凭证',
nickname	VARCHAR(18)	COMMENT'昵称',
avatar	VARCHAR(150)	COMMENT'图像',
passwd	VARCHAR(36)	COMMENT'盐'
)COMMENT '认证表';
--3.登录记录表
CREATE TABLE IF NOT EXISTS t_sys_login_list(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
oauth_id	VARCHAR(120)	COMMENT'用户唯一标识',
oauth_type			VARCHAR(18)	COMMENT'登录平台标识',
login_at	BIGINT	COMMENT'登录时间',
login_ip	VARCHAR(15)	COMMENT'登录ip',
login_addr	VARCHAR(18)	COMMENT'登录地'
)COMMENT'登录记录表';
--4.IP记录表
CREATE TABLE IF NOT EXISTS t_sys_ip_address(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
ip	VARCHAR(15)	COMMENT'ip地址',
isp	VARCHAR(40)	COMMENT'网络服务供应商',
country_code	VARCHAR(18)	COMMENT'国家编号',
country	VARCHAR(18)	COMMENT'国家名称',
area	VARCHAR(18)	COMMENT'区名称',
latitude	FLOAT	COMMENT'纬度',
longitude	FLOAT	COMMENT'经度'
)COMMENT'ip记录表';


--1.组表
CREATE TABLE IF NOT EXISTS t_sys_group(
gid	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
gname VARCHAR(30) COMMENT'组名称',
parent INT COMMENT'所属组编号',
create_at BIGINT COMMENT'创建日期',
des VARCHAR(50)COMMENT'组描述',
uid	VARCHAR(10)	COMMENT'用户唯一标识'
)COMMENT'用户组表';
--2.用户-组表
CREATE TABLE IF NOT EXISTS t_sys_mem_group(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
uid	VARCHAR(10)	COMMENT'用户唯一标识',
gid	INT COMMENT'组编号'
)COMMENT'用户-组表';

--3.角色表
CREATE TABLE IF NOT EXISTS t_sys_role(
rid	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
rname VARCHAR(30) COMMENT'角色名称',
create_at BIGINT COMMENT'创建日期',
des VARCHAR(50) COMMENT '角色描述',
uid	VARCHAR(10)	COMMENT'用户唯一标识'
)COMMENT'角色表';
--4.组-角色表
CREATE TABLE IF NOT EXISTS t_sys_group_role(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
gid  INT COMMENT '组编号',
rid   INT COMMENT '角色编号'
)COMMENT'组-角色表';
--5.权限表
CREATE TABLE IF NOT EXISTS t_sys_right(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
right_id VARCHAR(10) COMMENT'权限标识',
right_link VARCHAR(100) COMMENT'权限名称',
login VARCHAR(5)COMMENT'是否登录(anon 不需要登录 authc 需要登录)',
des VARCHAR(80) COMMENT'描述',
log VARCHAR(2) COMMENT'是否记日志(0:不需要;1:需要)'
)COMMENT'权限表';
--6.角色-权限表
CREATE TABLE IF NOT EXISTS t_sys_role_right(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
role_id INT COMMENT '角色编号',
right_id INT COMMENT '权限编号'
)COMMENT'角色-权限表';

--7.菜单权限表
CREATE TABLE IF NOT EXISTS t_sys_meun_right(
id	 INT PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
right_id VARCHAR(10) COMMENT'权限标识',
menu_name VARCHAR(18) COMMENT'菜单名称',
parent_id VARCHAR(18) COMMENT'上级菜单编号(0:顶级菜单)',
menu_type VARCHAR(2) COMMENT'菜单类型(1:菜单;2:按钮)',
menu_url VARCHAR(60) COMMENT'菜单url',
level VARCHAR(18) COMMENT'菜单的层次'
)COMMENT'菜单权限表';



