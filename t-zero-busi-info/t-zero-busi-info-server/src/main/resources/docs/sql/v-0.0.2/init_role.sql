set sql_safe_updates=0;
set @tenant_id=3;
set @role_code='platformSuperManagement';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '超级平台管理角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-role-1'), '超级平台管理员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);

set @role_code = 'platformManagement';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '平台管理角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-role-1'), '平台管理员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);

# ---------------------------------------客户相关
set @role_code = 'marketingSuperManagement';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '超级营销管理角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-role-1'), '超级营销管理员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);

set @role_code = 'customerManagement';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '客户管理员', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-custom-1'), '管理员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);

set @role_code = 'customerMember';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '会员角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-custom-1'), 'VIP会员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);

# ---------------------------------------营销相关
set @role_code = 'marketingAreaManagement';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '区域营销管理角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-managerArea-1'), '超级管理员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);


set @role_code = 'marketingManagement';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '营销管理角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-role-1'), '管理员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);


set @role_code = 'marketingMember';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '营销角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-saleParking-1'), '地库服务营销员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-saleTotalGraph-2'), '总图服务营销员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-saleProfit-3'), '投决服务营销员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);

# -----------------------------------------------------业务相关
set @role_code = 'businessManagement';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '业务管理角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-managerParking-1'), '地库业务管理员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-managerTotalGraph-2'), '总图业务管理员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-managerProfit-3'), '投决业务管理员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);


set @role_code = 'businessMember';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '业务员角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-designParking-1'), '地库设计师', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-designTotalGraph-2'), '总图设计师', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-designProfit-3'), '投决设计师', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);


set @role_code = 'businessAudit';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '业务审核角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-auditParking-1'), '地库审核设计师', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-auditTotalGraph-2'), '总图审核设计师', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-auditProfit-3'), '总图审核设计师', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);


# -----------------------------------------------------平台运营相关
set @role_code = 'operationManagement';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '平台运营管理角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-role-1'), '平台运营管理员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);


set @role_code = 'operationMember';
delete from t_zero_role_defined where parent_role_code=@role_code and tenant_id=@tenant_id;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @role_code, '平台运营角色', '0', @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_role_defined WHERE tenant_id = @tenant_id and role_code = @role_code;
insert into t_zero_role_defined(tenant_id, role_code, role_name, parent_role_id, parent_role_code, role_parants, role_desc, role_status, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, CONCAT(@role_code , '-waiter-1'), '平台服务员', @platformSuperManagement, @role_code, '0', '{}', '0', 1, now(), 1, now(), 0);


set sql_safe_updates=0;
set @tenant_id=3;
set @product_id=3;

select * from t_zero_permission_defined where  tenant_id=@tenant_id and product_id=@product_id;


set @role_code='permisionPlatformSuperManagement';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id, @role_code, '超级平台管理权限', '0', @role_code,  '{}', 1, now(), 1, now(), 0);

set @role_code = 'permisionPlatformManagement';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id, @role_code, '平台管理权限', '0', @role_code, '{}', 1, now(), 1, now(), 0);

# ---------------------------------------客户相关
set @role_code = 'permisionMarketingSuperManagement';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id, @role_code, '超级营销管理权限', '0', @role_code,  '{}',  1, now(), 1, now(), 0);

set @role_code = 'permisionCustomerManagement';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id, @role_code, '客户管理权限', '0', @role_code,  '{}', 1, now(), 1, now(), 0);

set @role_code = 'permisionCustomerMember';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id, @role_code, '会员权限', '0', @role_code, '{}', 1, now(), 1, now(), 0);

# ---------------------------------------营销相关
set @role_code = 'permisionMarketingAreaManagement';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id, @role_code, '区域营销管理权限', '0', @role_code,  '{}', 1, now(), 1, now(), 0);

set @role_code = 'permisionMarketingManagement';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id, @role_code, '营销管理权限', '0', @role_code, '{}',  1, now(), 1, now(), 0);


set @role_code = 'permisionMarketingMember';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id, @role_code, '营销权限', '0', @role_code,  '{}',  1, now(), 1, now(), 0);

# -----------------------------------------------------业务相关
set @role_code = 'permisionBusinessManagement';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id,  @role_code, '业务管理权限', '0', @role_code,  '{}', 1, now(), 1, now(), 0);

set @role_code = 'permisionBusinessMember';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id,  @role_code, '业务员权限', '0', @role_code,  '{}', 1, now(), 1, now(), 0);
set @platformSuperManagement=0;
SELECT @platformSuperManagement:=id FROM t_zero_permission_defined WHERE tenant_id = @tenant_id and permission_code = @role_code;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values  (@tenant_id, @product_id,  CONCAT(@role_code , '-operateParking-1'), '地库业务操作', @platformSuperManagement, @role_code,  '{}', 1, now(), 1, now(), 0);
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted)  
values (@tenant_id, @product_id,  CONCAT(@role_code , '-operateTotalGraph-2'), '总图业务操作', @platformSuperManagement, @role_code,  '{}', 1, now(), 1, now(), 0);
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id,  CONCAT(@role_code , '-operateProfit-3'), '投决业务操作',@platformSuperManagement, @role_code,  '{}', 1, now(), 1, now(), 0);

set @role_code = 'permisionBusinessAudit';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id, @product_id,  @role_code, '业务审核权限', '0', @role_code, '{}',  1, now(), 1, now(), 0);

# -----------------------------------------------------平台运营相关
set @role_code = 'permisionOperationManagement';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id,@product_id,  @role_code, '平台运营管理权限', '0', @role_code,  '{}', 1, now(), 1, now(), 0);

set @role_code = 'permisionOperationMember';
delete from t_zero_permission_defined where parent_permission_code=@role_code and tenant_id=@tenant_id and product_id=@product_id;
insert into t_zero_permission_defined(tenant_id, product_id, permission_code, permission_name, parent_permisson_id, parent_permission_code, permission_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted) 
values (@tenant_id,@product_id,  @role_code, '平台运营权限', '0', @role_code, '{}', 1, now(), 1, now(), 0);







# 初始化服务

update t_zero.t_zero_service_defined set is_deleted=1 where tenant_id=3 and service_code in ('UNDERGROUND_GARAGE', 'GENERAL_LAYOUT', 'PROFIT_CALCULATION');
insert into t_zero.t_zero_service_defined(tenant_id, service_code, service_name, service_type, service_status, service_desc, created_user_id, created_time, updated_user_id, updated_time, is_deleted)
values(3, 'UNDERGROUND_GARAGE', '地库排布', 'ai', 0, '{"baseEquip": ["基础配置", "设备用房"]}', 5, now(), 5, now(), 0),
(3, 'GENERAL_LAYOUT', '总图设计', 'ai', 0, '{"baseEquip": ["基础配置"]}', 5, now(), 5, now(), 0),
(3, 'PROFIT_CALCULATION', '智能投决', 'ai', 0, '{"baseEquip": ["基础配置""]}', 5, now(), 5, now(), 0);
