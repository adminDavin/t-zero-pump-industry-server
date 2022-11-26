drop table t_zero_user_info;
CREATE TABLE t_zero_user_info(
    id INT NOT NULL auto_increment  COMMENT '用户ID' ,
    user_code varchar(32) NOT NULL COMMENT '用户编码' ,
    identify_id INT NOT NULL   COMMENT '身份ID' ,
    identify_code varchar(32) NOT NULL COMMENT '身份编码' ,
    tenant_id INT   DEFAULT 0 COMMENT '租户ID' ,
    username VARCHAR(63)    COMMENT '用户名' ,
    nick_name VARCHAR(127)    COMMENT '用户昵称' ,
    phone_number VARCHAR(15)    COMMENT '手机号' ,
    email_address VARCHAR(31)    COMMENT '邮箱地址' ,
    gender tinyint COMMENT '性别0:男,1女' ,
    birthday DATE  COMMENT '生日' ,
    user_desc json COMMENT '用户描述' ,
    user_status tinyint default 0 COMMENT '用户状态 启用中0;禁用中1' ,
    source_code varchar(63)   COMMENT '来源编码' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1)   default 0 COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '用户基本信息 ';

drop table t_zero_identify_info;
CREATE TABLE t_zero_identify_info(
    id INT NOT NULL auto_increment  COMMENT '身份ID' ,
    identify_code varchar(32) NOT NULL COMMENT '身份编码' ,
    username VARCHAR(63)    COMMENT '用户名' ,
    nick_name VARCHAR(127)    COMMENT '用户昵称' ,
    phone_number VARCHAR(15)    COMMENT '手机号' ,
    email_address VARCHAR(31)    COMMENT '邮箱地址' ,
    gender tinyint COMMENT '性别0:男,1女' ,
    birthday DATE  COMMENT '生日' ,
    user_desc json COMMENT '用户描述' ,
    user_status tinyint default 0 COMMENT '用户状态 启用中0;禁用中1' ,
    source_code varchar(63)   COMMENT '来源编码' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1)   default 0 COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '用户身份信息 ';

select * from t_zero_user_info;

select * from t_zero_login_auth;

drop table t_zero_login_auth;
CREATE TABLE t_zero_login_auth(
    id INT NOT NULL  auto_increment COMMENT '登陆验证ID' ,
    identity_id INT    COMMENT '用户 ID' ,
    auth_type VARCHAR(32)   DEFAULT 1 COMMENT '登陆验证类型' ,
    auth_key VARCHAR(32)    COMMENT '验证的关键字' ,
    auth_value VARCHAR(128)    COMMENT '验证信息' ,
    auth_encrypt_type VARCHAR(32)    COMMENT '加密姿势' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1)  default 0  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '用户鉴权 ';

alter table t_zero_login_auth add index i_login_auth_auth_type_auth_key(auth_type, auth_key);

drop table t_zero_basic_configuration;
CREATE TABLE t_zero_basic_configuration(
    id INT NOT NULL auto_increment COMMENT '基础配置ID' ,
    tenant_id INT   DEFAULT 0 COMMENT '租户ID' ,
    config_code varchar(32)    COMMENT '基础配置编码' ,
    config_key VARCHAR(32)    COMMENT '基础配置关键字' ,
    config_value JSON   COMMENT '基础配置值' ,
    config_status tinyint(3) default 0   COMMENT '配置状态 启用中0;禁用中1' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    PRIMARY KEY (id)
) COMMENT = '基础配置信息 ';

INSERT INTO `t_zero_user_info` ( `username`, `nick_name`, `phone_number`, `email_address`, `gender`, `birthday`, `user_desc`, `source_code`, `created_user_id`, `created_time`, `updated_user_id`, `updated_time`) 
VALUES ('admin', 'admin', '18758268513', '18758268513@163.com', '0', now(), '{"remark": "我是无敌账号"}', 'addedByBackground', '1', now(), '1', now());

select * from t_zero_login_auth;
insert into t_zero_login_auth (userId, auth_type, auth_key, auth_value, auth_encrypt_type, created_user_id, created_time, updated_user_id, updated_time)
values(1, "SIMPLE_LOGIN", 'admin', '', '', '1', now(), '1', now());
    
INSERT INTO t_zero_basic_configuration( config_code, config_key, config_value, created_user_id, created_time, updated_user_id, updated_time) 
VALUE('LOGIN_AUTH', "authedDesc", '[{"authType":"WACHAT","authName":"微信登陆"},{"authType":"SIMPLE","authName":"简单登陆"},{"authType":"PHONE","authName":"手机验证码"},{"authType":"EMAIL","authName":"邮箱验证码"},{"authType":"USERNAME","authName":"账号登录"}]', 1, now(), 1, now());



drop table t_zero_permission_defined;
CREATE TABLE t_zero_permission_defined(
    id INT NOT NULL auto_increment  COMMENT '权限ID' ,
    tenant_id INT   DEFAULT 0 COMMENT '租户ID' ,
    product_def_id INT     COMMENT '产品 ID： 地库或者总图' ,
    permission_code VARCHAR(32)     COMMENT '权限编码' ,
    permission_name VARCHAR(128)     COMMENT '权限名称' ,
    parent_permisson_id INT   COMMENT '父级权限ID' ,
    parent_permission_code VARCHAR(32)    COMMENT '父级权限编码' ,
    permission_desc json COMMENT '权限内容 启用中0;禁用中1' ,
    created_user_id VARCHAR(32) COMMENT '创建人' ,
    created_time DATETIME  COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)  COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1)   default '0'   COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '权限定义表 ';

select * from t_zero_permission_defined;
insert into t_zero_permission_defined(tenant_id, product_def_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time)
values (0, 1, ' createTanent', '创建租户权限', 0, 'root', '{"remark": "拥有创建租户的权限"}', 1, now(), 1, now());

drop table t_zero_role_defined;
CREATE TABLE t_zero_role_defined(
    id INT NOT NULL auto_increment  COMMENT '角色ID' ,
    tenant_id INT   DEFAULT 0 COMMENT '租户ID' ,
    role_code VARCHAR(32)    COMMENT '角色编码' ,
    role_name VARCHAR(128)    COMMENT '角色名称' ,
    parent_role_id INT    COMMENT '父级角色ID' ,
    parent_role_code VARCHAR(32)    COMMENT '父级角色编码' ,
    role_parants VARCHAR(32)    COMMENT '上级角色' ,
    role_desc json    COMMENT '角色内容' ,
    role_status tinyint(3)  default 0   COMMENT '角色状态 启用中0;禁用中1' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1)  default '0' COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '角色定义 ';


select * from t_zero_role_defined;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, created_user_id, created_time, updated_user_id, updated_time)
values (0, 'tanentManager', '租户管理员', 0, 'root', '', '{"remark": "租户管理员角色"}', 1, now(), 1, now());

drop table t_zero_company_organization;
CREATE TABLE t_zero_company_organization(
    id INT NOT NULL auto_increment  COMMENT '组织机构ID' ,
    tenant_id INT   DEFAULT 0 COMMENT '租户ID' ,
    organization_code VARCHAR(32)    COMMENT '组织机构编码' ,
    organization_name VARCHAR(128)    COMMENT '组织机构名称' ,
    parent_organization_id INT    COMMENT '父级组织机构ID' ,
    parent_organization_code VARCHAR(32)    COMMENT '父级组织机构编码' ,
    organization_parants VARCHAR(128)    COMMENT '上级组织机构' ,
    organization_desc json    COMMENT '组织机构描述' ,
    organization_status tinyint(3)  default 0  COMMENT '组织机构状态 启用中0;禁用中1' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1)  default 0    COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '公司组织机构 ';


select * from t_zero_company_organization;
insert into t_zero_company_organization(tenant_id, organization_code, organization_name, parent_organization_id, parent_organization_code, organization_parants, organization_desc, created_user_id, created_time, updated_user_id, updated_time)
values (0, 't-zero', '图零科技', 0, 'root', '', '{"remark": "图零简介"}', 1, now(), 1, now());


drop table t_zero_group_defined;
CREATE TABLE t_zero_group_defined(
    id INT NOT NULL auto_increment  COMMENT '群组ID' ,
    tenant_id INT   DEFAULT 1 COMMENT '租户ID' ,
    group_code VARCHAR(32)    COMMENT '群组编码' ,
    group_name VARCHAR(128)    COMMENT '群组名称' ,
    parent_group_id INT    COMMENT '父级群组ID' ,
    parent_group_code VARCHAR(32)    COMMENT '父级群组编码' ,
    group_parants VARCHAR(32)    COMMENT '上级群组' ,
    group_desc json    COMMENT '群组内容' ,
    group_status tinyint(3)  default 0  COMMENT '群组状态 启用中0;禁用中1' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1) default 0    COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '群组定义 ';


select * from t_zero_group_defined;
insert into t_zero_group_defined(tenant_id, group_code, group_name, parent_group_id, parent_group_code, group_parants, group_desc, created_user_id, created_time, updated_user_id, updated_time)
values (0, 'platformDevelopGroup', '平台研发组', 0, 'root', '', '{"remark": "平台研发团队"}', 1, now(), 1, now());


drop table t_zero_tanent_defined;
CREATE TABLE t_zero_tanent_defined(
    id INT NOT NULL auto_increment  COMMENT '租户ID' ,
    tanent_code VARCHAR(32)    COMMENT '租户编码' ,
    tanent_name VARCHAR(128)    COMMENT '租户名称' ,
    tanent_desc json    COMMENT '租户描述 启用中0;禁用中1' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1)  default 0  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '租户定义 ';

select * from t_zero_tanent_defined;
insert into t_zero_tanent_defined(tanent_code, tanent_name, tanent_desc, created_user_id, created_time, updated_user_id, updated_time)
values ('toZero', '图零', '{"remark": "平台研发团队"}', 1, now(), 1, now());

drop table t_zero_rel_user_group;
CREATE TABLE t_zero_rel_user_group(
    id INT NOT NULL  auto_increment COMMENT '关系ID' ,
    tanent_id INT default 0   COMMENT '租户ID' ,
    user_id INT    COMMENT '用户ID' ,
    group_id INT    COMMENT '群组ID' ,
    rel_status tinyint default 0 COMMENT '关系状态' ,
    rel_desc json    COMMENT '关系描述' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    is_deleted VARCHAR(1)  default 0   COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '用户组关系定义 ';


drop table t_zero_rel_user_role;
CREATE TABLE t_zero_rel_user_role(
    id INT NOT NULL auto_increment  COMMENT '关系ID' ,
    tanent_id INT  default 0  COMMENT '租户ID' ,
    user_id INT    COMMENT '用户ID' ,
    role_id INT    COMMENT '群组ID' ,
    rel_desc json   COMMENT '关系描述' ,
    rel_status tinyint default 0 COMMENT '关系状态' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    is_deleted VARCHAR(1)   default 0  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '用户角色关系 ';


drop table t_zero_rel_user_friend;
CREATE TABLE t_zero_rel_user_friend(
    id INT NOT NULL auto_increment  COMMENT '关系ID' ,
    tanent_id INT default 0    COMMENT '租户ID' ,
    user_id INT    COMMENT '用户ID' ,
    friend_id INT    COMMENT '朋友ID' ,
    rel_status tinyint default 0 COMMENT '关系状态' ,
    rel_desc  json   COMMENT '关系描述' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    is_deleted VARCHAR(1) default 0   COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '用户好友关系 ';

drop table t_zero_rel_group_role;
CREATE TABLE t_zero_rel_group_role(
    id INT NOT NULL auto_increment  COMMENT '关系ID' ,
    tanent_id INT    COMMENT '租户ID' ,
    group_id INT    COMMENT '群组ID' ,
    role_id INT    COMMENT '角色ID' ,
    rel_status tinyint default 0 COMMENT '关系状态' ,
    rel_desc json   COMMENT '关系描述' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    is_deleted VARCHAR(1)  default 0  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '群组角色关系 ';


select * from t_zero_rel_role_perimission;

drop table t_zero_rel_role_perimission;
CREATE TABLE t_zero_rel_role_perimission(
    id INT NOT NULL  auto_increment COMMENT '关系ID' ,
    tanent_id INT default 0  COMMENT '租户ID' ,
    role_id INT    COMMENT '角色ID' ,
    perimission_id INT    COMMENT '权限ID' ,
    rel_status tinyint default 0 COMMENT '关系状态' ,
    rel_desc json    COMMENT '关系描述' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    is_deleted VARCHAR(1) default 0  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '角色权限关系 ';


drop table t_zero_rel_user_organization;
CREATE TABLE t_zero_rel_user_organization(
    id INT NOT NULL auto_increment  COMMENT '关系ID' ,
    tanent_id INT    COMMENT '租户ID' ,
    user_id INT    COMMENT '用户ID' ,
    organization_id INT    COMMENT '组织机构ID' ,
    rel_status tinyint default 0 COMMENT '关系状态' ,
    rel_desc json   COMMENT '关系描述' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    is_deleted VARCHAR(1)  default 0  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '用户和组织机构关系 ';


drop table t_zero_rel_user_tanent;
CREATE TABLE t_zero_rel_user_tanent(
    id INT NOT NULL auto_increment  COMMENT '用户ID' ,
    tanent_id INT    COMMENT '租户ID' ,
    tanent_code VARCHAR(32) COMMENT '租户编码',
    identity_id INT    COMMENT '用户ID' ,
    identity_code VARCHAR(32) COMMENT '用户编码',
    username VARCHAR(32) comment '用户名',
    nick_name VARCHAR(128) comment '用户昵称',
    user_mood VARCHAR(128) comment '用户心情',
    rel_desc json comment '用户租户关系描述',
    rel_status tinyint default 0 COMMENT '关系状态' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    is_deleted VARCHAR(1)  default 0  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '用户和组织机构关系 ';


drop table t_zero_menu_info;
CREATE TABLE t_zero_menu_info(
    id INT NOT NULL auto_increment  COMMENT '菜单ID' ,
    tenant_id INT   DEFAULT 0 COMMENT '租户ID' ,
    product_id INT    COMMENT '产品ID' ,
    product_code VARCHAR(32)    COMMENT '产品编码' ,
    menu_code VARCHAR(32)    COMMENT '菜单编码' ,
    menu_name VARCHAR(128)    COMMENT '菜单名称' ,
    parent_menu_id INT    COMMENT '父级菜单ID' ,
    parent_menu_code VARCHAR(32)    COMMENT '父级菜单编码' ,
    menu_status tinyint  default 0  COMMENT '角色状态 启用中0;禁用中1' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1)  default 0  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '菜单管理 ';


drop table t_zero_rel_menu_permission;
CREATE TABLE t_zero_rel_menu_permission(
    id INT NOT NULL auto_increment  COMMENT '关系ID' ,
    tanent_id INT  default 0  COMMENT '租户ID' ,
    product_id  int   COMMENT '产品ID' ,
    product_code VARCHAR(32)    COMMENT '产品编码' ,
    menu_id INT    COMMENT '菜单ID' ,
    menu_code VARCHAR(32)    COMMENT '菜单编码' ,
    permission_id INT    COMMENT '权限ID' ,
    permission_code VARCHAR(32)    COMMENT '权限编码' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    is_deleted VARCHAR(1)  default 0  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '菜单权限关系 ';




