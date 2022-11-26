drop table t_zero_solver_info;
CREATE TABLE t_zero_solver_info(
    id INT NOT NULL  auto_increment  COMMENT '解决者ID' ,
    tenant_id INT    COMMENT '租户 ID' ,
    product_id int COMMENT '产品ID' ,
    business_type VARCHAR(32)  COMMENT '业务类型' ,
    solver_name VARCHAR(128)    COMMENT '解决者名称' ,
    group_id INT    COMMENT '群组 ID' ,
    administrator INT    COMMENT '负责人' ,
    solver_desc json    COMMENT '解决者描述' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1)  default 0  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '解决者定义 ';	

drop table t_zero_channel_defined;
CREATE TABLE t_zero_channel_defined(
    id INT NOT NULL  auto_increment COMMENT '渠道ID' ,
    tenant_id INT    COMMENT '租户编码' ,
    channel_code VARCHAR(32)   DEFAULT 1 COMMENT '渠道编码' ,
    channel_type VARCHAR(32)   DEFAULT 0 COMMENT '渠道类型' ,
    channel_name VARCHAR(128)    COMMENT '渠道名称 地库或者总图' ,
    channel_desc json  COMMENT '渠道描述' ,
    channel_default tinyint default 0  comment '是否默认发送',
    channel_status tinyint  default 0  COMMENT '渠道状态 参数设置中10;执行计算中11;运行结果修复阶段12;订单结果确认中13;订单实例完成0;订单实例关闭1' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1)  default '0'  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '消息渠道定义 ';






drop table t_zero_channel_instance;
CREATE TABLE t_zero_channel_instance(
    id INT NOT NULL  auto_increment COMMENT '渠道实例ID' ,
    user_id INT    COMMENT '用户 ID' ,
    channel_id int COMMENT '渠道ID' ,
    channel_code VARCHAR(32)   DEFAULT 1 COMMENT '渠道编码' ,
    channel_type VARCHAR(32)   DEFAULT 0 COMMENT '渠道类型' ,
    channel_default tinyint default 0  comment '是否默认发送',
    channel_status tinyint default 0   COMMENT '渠道实例状态 参数设置中10;执行计算中11;运行结果修复阶段12;订单结果确认中13;订单实例完成0;订单实例关闭1' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1)  default 0  COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '渠道实例 ';


drop table t_zero_message_template;
CREATE TABLE t_zero_message_template(
    id INT NOT NULL auto_increment  COMMENT '模版ID' ,
    tenant_id INT    COMMENT '租户 ID' ,
    channel_id INT    COMMENT '渠道ID' ,
    template_code VARCHAR(32)  COMMENT '模版编码' ,
    template_type VARCHAR(32)  COMMENT '模版类型' ,
    template_name VARCHAR(128)    COMMENT '模版名称 地库或者总图' ,
    template_content text    COMMENT '模版内容' ,
    template_variable json    COMMENT '变量定义 参数设置中10;执行计算中11;运行结果修复阶段12;订单结果确认中13;订单实例完成0;订单实例关闭1' ,
    template_desc json    COMMENT '模版描述' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1) default '0'   COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '消息模版 ';


drop table t_zero_message_instance;
CREATE TABLE t_zero_message_instance(
    id INT NOT NULL  auto_increment COMMENT '消息实例ID' ,
    user_id INT   DEFAULT 1 COMMENT '用户ID' ,
    product_id INT   DEFAULT 0 COMMENT '产品ID' ,
    business_type VARCHAR(32)    COMMENT '业务类型 地库或者总图' ,
    template_code VARCHAR(32)   DEFAULT 0 COMMENT '消息模版编码' ,
    template_type VARCHAR(32)    COMMENT '消息模版类型' ,
	channel_code VARCHAR(32)   DEFAULT 1 COMMENT '渠道编码' ,
    channel_desc json    COMMENT '消息渠道描述' ,
    template_content json    COMMENT '模版内容' ,
    template_variable json    COMMENT '变量定义 参数设置中10;执行计算中11;运行结果修复阶段12;订单结果确认中13;订单实例完成0;订单实例关闭1' ,
    message_content json    COMMENT '消息内容' ,
    send_status tinyint default 1    COMMENT '发送状态' ,
    created_user_id VARCHAR(32)    COMMENT '创建人' ,
    created_time DATETIME    COMMENT '创建时间' ,
    updated_user_id VARCHAR(32)    COMMENT '更新人' ,
    updated_time DATETIME    COMMENT '更新时间' ,
    is_deleted VARCHAR(1) default '0'   COMMENT '是否删除 标记文件是否删除' ,
    PRIMARY KEY (id)
) COMMENT = '消息实例 ';