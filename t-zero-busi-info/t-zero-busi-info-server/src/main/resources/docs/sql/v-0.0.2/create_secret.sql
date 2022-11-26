
CREATE TABLE `t_zero_consuming_secret_defined` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '消费密钥记录ID',
  `tenant_id` int DEFAULT NULL COMMENT '租户 ID',
  `group_id` int DEFAULT NULL,
  `secret_code` varchar(32) DEFAULT NULL COMMENT '消费密钥编码',
  `secret_type` varchar(32) DEFAULT NULL COMMENT '消费密钥类型 forever 永久密钥 Temporary 临时密钥',
  `generated_user_id` int DEFAULT '1' COMMENT '消费密钥生成人',
  `business_code` varchar(32) DEFAULT NULL COMMENT '业务编码',
  `started_time` tinyint DEFAULT NULL COMMENT '消费生效时间',
  `expired_time` tinyint DEFAULT NULL COMMENT '消费失效时间',
  `actual_usage_times` tinyint DEFAULT NULL COMMENT '消费实际使用次数',
  `plan_usage_times` tinyint DEFAULT NULL COMMENT '消费计划使用次数',
  `secret_status` tinyint DEFAULT NULL COMMENT '消费状态',
  `secret_source` varchar(32) DEFAULT NULL COMMENT '密钥来源',
  `created_user_id` varchar(32) DEFAULT NULL COMMENT '创建人',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_user_id` varchar(32) DEFAULT NULL COMMENT '更新人',
  `updated_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_deleted` varchar(1) DEFAULT NULL COMMENT '是否删除 标记文件是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT='密钥定义';

drop table t_zero_business_account_definition;
CREATE TABLE `t_zero_business_account_definition` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '账号 ID',
  `tenant_id` int DEFAULT NULL COMMENT '租户 ID',
  `account_code` varchar(128) DEFAULT NULL COMMENT '账号code',
  `business_code` varchar(32) DEFAULT NULL COMMENT '服务code',
  `account_type` varchar(32) DEFAULT NULL COMMENT '账号类型',
  `available_quantity` int DEFAULT '0' COMMENT '未分配数量',
  `total_quantity` int DEFAULT '0' COMMENT '总数量',
  `account_unit` varchar(32) DEFAULT 'TIMES' COMMENT '账号单位',
  `related_id` int DEFAULT NULL COMMENT '关联对象_id',
  `related_type` varchar(32) DEFAULT NULL COMMENT '关联类型',
  `created_user_id` varchar(32) DEFAULT NULL COMMENT '创建人',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_user_id` varchar(32) DEFAULT NULL COMMENT '更新人',
  `updated_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_deleted` varchar(1) DEFAULT '0' COMMENT '是否删除 标记文件是否删除',
  PRIMARY KEY (`id`)
)  COMMENT='业务账务 ';

drop table t_zero_business_account_changed_record;
CREATE TABLE `t_zero_business_account_changed_record` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '历史记录ID',
  `tenant_id` int DEFAULT NULL COMMENT '租户 ID',
  `account_id` int DEFAULT NULL COMMENT '账号ID',
  `account_code` varchar(128) DEFAULT NULL COMMENT '账号code',
  `business_code` varchar(32) DEFAULT NULL COMMENT '服务code',
  `action_type` varchar(32) DEFAULT NULL COMMENT '动作类型',
  `quantity` int DEFAULT '0' COMMENT '数量',
  `current_quantity` int DEFAULT '0' COMMENT '数量',
  `account_unit` varchar(32) DEFAULT 'TIMES' COMMENT '账号单位',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `created_user_id` varchar(32) DEFAULT NULL COMMENT '创建人',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `is_deleted` varchar(1) DEFAULT '0' COMMENT '是否删除 标记文件是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  COMMENT='业务账务变更记录 ';


CREATE TABLE `t_zero_consuming_secret_change_record` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '消费密钥记录ID',
  `tenant_id` int DEFAULT NULL COMMENT '租户 ID',
  `account_code` varchar(128) DEFAULT NULL,
  `secret_code` varchar(64) DEFAULT NULL COMMENT '消费密钥编码',
  `secret_type` varchar(32) DEFAULT NULL COMMENT '消费密钥类型 forever 永久密钥 Temporary 临时密钥',
  `business_code` varchar(32) DEFAULT NULL COMMENT '业务编码',
  `action_type` varchar(32) DEFAULT NULL COMMENT '动作类型',
  `quantity` int DEFAULT '0' COMMENT '数量',
  `current_quantity` int DEFAULT '0' COMMENT '数量',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `secret_source` varchar(32) DEFAULT NULL COMMENT '密钥来源',
  `created_user_id` varchar(32) DEFAULT NULL COMMENT '创建人',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `is_deleted` varchar(1) DEFAULT NULL COMMENT '是否删除 标记文件是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  COMMENT='密钥定义';


ALTER TABLE `t_zero_group_defined` 
ADD COLUMN `maintain_group_id` INT NULL AFTER `group_status`,
ADD COLUMN `region_group_id` INT NULL AFTER `maintain_group_id`;



CREATE TABLE `t_zero_construction_project_defined` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '建设项目ID',
  `tenant_id` int DEFAULT '1' COMMENT '租户ID',
  `project_code` varchar(32) DEFAULT NULL  COMMENT '项目编码',
  `secret_code` varchar(32) DEFAULT NULL COMMENT '消费密钥',
  `project_name` varchar(128) DEFAULT NULL COMMENT '需求方项目名称',
  `project_type` varchar(32) DEFAULT NULL COMMENT '业务类型 地库或者总图 basement 地库\ngeneralLayout 总图',
  `project_remark` varchar(255) DEFAULT NULL COMMENT '项目备注',
  `project_desc` json DEFAULT NULL COMMENT '项目描述',
  `project_status` tinyint DEFAULT '0' COMMENT '需求状态 参数设置中10;执行计算中11;运行结果修复阶段12;订单结果确认中13;订单实例完成0;订单实例关闭1',
  `custom_groud_id` int DEFAULT NULL COMMENT '客户所在的组',
  `customer_code` varchar(32) DEFAULT NULL,
  `country_code` varchar(32) DEFAULT NULL,
  `created_user_id` varchar(32) DEFAULT NULL COMMENT '创建人',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_user_id` varchar(32) DEFAULT NULL COMMENT '更新人',
  `updated_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_deleted` varchar(1) DEFAULT '0' COMMENT '是否删除 标记文件是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  COMMENT='建设项目定义';