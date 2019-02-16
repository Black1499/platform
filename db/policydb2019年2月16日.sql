
drop database if exists policydb;

create database policydb;

use policydb;

create table ge_policy_raw(
  id int primary key auto_increment comment '编号',
  crawl_url varchar(128) comment '抓取路径', 	
  crawl_time datetime comment '抓取的时间',
  index_number varchar(32) comment '索引号',
  title varchar(64) comment '标题',
  release_office varchar(32) comment '发文机关',
  release_number varchar(32) comment '发文文号',
  policy_basis varchar(64) comment '依据',
  wiritten_time datetime comment '成文日期',
  release_time datetime comment '发布日期',
  effect_time datetime comment '有效日期',
  content  longtext comment '正文',
  image_url varchar(64) comment '图片路径',
  status varchar(8) comment '状态（是否处理)',
  html longtext comment '抓取的HTML源页面',
  remark varchar(255) comment '备注，比如这条数据是本地上传的'		
)comment = '原始政策表';

-- 政策结构表
create table ge_policy_detail(
  id int primary key auto_increment comment '编号',
  policy_raw_id int comment '原始政策表编号',
  index_number varchar(32) comment '索引号',
  title varchar(64) comment '标题',
  release_office varchar(32) comment '发文机关',
  release_number varchar(32) comment '发文文号',
  policy_basis varchar(64) comment '依据',
  wiritten_time datetime comment '成文日期',
  release_time datetime comment '发布日期',
  effect_time datetime comment '有效日期',
  key_word varchar(8) comment '关键字', 
  content  longtext comment '正文',
  impement_subject varchar(32) comment '实施主体',
  direct_impement_subject	varchar(32) comment '间接实施主体',
  image_url varchar(64) comment '图片路径',
  created_time datetime comment '创建时间',
  updated_time datetime comment '更新时间',
	`status` varchar(8) comment '状态，是否发布，是否推送'
)comment = '政策结构表';

-- 政策表
create table ge_policy(
  id int primary key auto_increment comment '编号',
  policy_detail_id int comment '结构表编号',
	key_word varchar(32) comment '关键字',
	declaration_url varchar(128) comment '申报链接',
	policy_type varchar(8) comment '政策类型（政策、申报政策）',
  area_id int comment '地区编号',
  comment_times int comment '评论数',
  shared_times int comment '分享数',
  upvote_times int comment '点赞数',
  favor_times int comment '收藏数',
  readed_times int comment '阅读数',
	created_time datetime comment '创建时间',
	updated_time datetime comment '更新时间'
) comment = '政策表';

create table ge_analyzing_raw(
  id int primary key auto_increment comment '编号',
  policy_raw_id int comment '临时政策表id',
  crawl_url varchar(128) comment '抓取的路径',			-- 建议加crawl
  local_path varchar(64) comment '本地路径',
  content longtext comment '内容',
  crawl_time datetime comment '抓取时间',
  status varchar(8) comment '状态'
) comment = '原始解读表';

-- 解读表
create table ge_analyzing(
  id int primary key auto_increment comment '编号',
  analyzing_raw_id int comment '临时解读表id',
  policy_id int comment '政策ID',
  title varchar(128) comment '标题',
  release_time datetime comment '发布时间',
  release_organization varchar(32) comment '发布机构',
  content	longtext comment '内容',
	`status` varchar(8) comment '状态',
  comment_times int comment '评论数',
  shared_times int comment '分享数',
  upvote_times int comment '点赞数',
  favor_times int comment '收藏数',
  readed_times int comment '阅读数',
	created_time datetime comment '创建时间',
	updated_time datetime comment '更新时间'
) comment = '解读表';
-- 附件表
create table ge_attachment(
  id int primary key auto_increment comment '编号',
  policy_id int comment '政策表编号',
  name varchar(64) comment '名称',
  created_time datetime comment '创建时间',
  updated_time datetime comment '更新时间',
  crawl_url varchar(128) comment '抓取路径', 				
  local_path varchar(64) comment '本地路径',
	description varchar(256) comment '描述',
	type varchar(8) comment '类型（word,excel）', 
  file_size int comment '文件大小（KB）',
	download_times int comment '下载数'
) comment = '附件表';


-- 公告表
create table ge_announcement(
  id int primary key auto_increment comment '编号',
  title varchar(64) comment '标题',
  subtitle varchar(64) comment '副标题',
  content text comment '内容',
  author varchar(32) comment '作者',
  editor varchar(32) comment '编辑者',
  release_time datetime comment '发布时间',
  release_organization varchar(32) comment '发布机构',
  readed_times int comment '阅读量',
	status varchar(8) comment '状态'
) comment = '公告表';

-- 企业表
create table ge_enterprise(
  id int primary key auto_increment comment '编号',
  registration_number varchar(20) comment '注册号(信用代码)',
  name varchar(32) comment '名称',
  address varchar(64) comment '地址',
  representative_people varchar(32) comment '法人',	
  registed_captital decimal(14,2) comment '注册基金',
  phone_number varchar(16) comment '联系方式',
  registed_office varchar(32) comment '登记机关',     
  registed_time datetime comment '注册时间',
  registed_status varchar(16) comment '登记状态',
  founded_time datetime comment '成立时间',			
  approved_time datetime comment '核准日期'
) comment = '企业基本信息表';

create table `ge_industry`
(
  `id` int primary key comment 'id',
  `name` varchar(50) comment '名称',
  `parent` int(11) comment '父级ID'
) comment '国民经济行业表';

create table `ge_area`
(
  `id` int primary key auto_increment comment '自动增长编号',
  `area_name` varchar(16) comment '地名',
  `code` varchar(16) comment '地区编号',
  `zipcode` varchar(16) comment '地区邮编',
  `parent_id` int comment '父id'
) comment '地区表';

create table `ge_policy_category`
(
  `id` int primary key auto_increment comment '自动增长编号',
  `name` varchar(16) comment '类型名称',
  `parent_id` int comment '父id'
) comment '政策类型表';

create table `ge_enterprise_category`
(
  `id` int primary key auto_increment comment '自动增长编号',
  `name` varchar(16) comment '类型名称',
  `parent_id` int comment '父id'
) comment '企业类型表';

create table `ge_enterprise_scale`
(
  `id`  int primary key auto_increment comment '自动增长编号',
  `name` varchar(16) comment '规模名称'
) comment '企业规模表';

create table `ge_enterprise_nature`
(
  `id`  int primary key auto_increment comment '自动增长编号',
  `name` varchar(16) comment '性质名称'        
) comment '企业性质表';

create table `ge_education_category`
(
  `id`  int primary key auto_increment comment '自动增长编号',
  `name` varchar(16) comment '学历名称'
) comment '学历类型表';


--  
create table `ge_institution`
(
  `id` int primary key auto_increment comment '自动增长编号',
  `name` varchar(32) comment '事业单位名称'    
) comment '政府事业单位表';

create table `ge_policy_category_relation`
(
  `id` int primary key auto_increment comment '自动增长编号',
  `policy_id` int comment '政策表id',
  `classify_id` int comment '政策类型表id'
) comment '政策类型关联表';

create table `ge_policy_industry_relation`
(
  `id` int primary key auto_increment comment '自动增长编号',
  `industry_id` int comment '国民经济行业分类id',
  `policy_id` int comment '政策表id'
) comment '政策行业关联表';

create table `policy_compliant_scale`
(
  `id` int primary key auto_increment comment '自动增长编号',
  `enterprise_scale_id` int comment '规模表id',
  `policy_id` int comment '政策表id'
) comment '政策适用规模表';

create table `ge_policy_compliant_nature`
(
  `id` int primary key auto_increment comment '自动增长编号',
  `enterprise_nature_id` int comment '企业性质表id',
  `policy_id` int comment '政策表id'
) comment '政策适用性质表';

create table `ge_enterprise_industry_relation`
(
  `id` int primary key auto_increment comment '自动增长编号',
  `industry_id` int comment '国民经济行业id',
  `enterprise_id` int comment '政策表id'
) comment '企业行业关联表';

create table `ge_enterprise_nature_relation`
(
  `id` int primary key auto_increment comment '自动增长编号',
  `enterprise_info_id` int comment '国民经济行业id',
  `enterprise_nature_id` int comment '企业性质表id'
) comment '企业性质关联表';


-- 分享表
create table ge_share(
  id int primary key auto_increment comment '编号',
  user_id int comment '用户 ID ',
  policy_id int comment '政策对象 ID ',
  shared_time datetime comment '分享时间',
  policy_type varchar(16) comment '政策对象类型',
  shared_type varchar(16) comment '分享类型(朋友圈，新浪微博)',
	operate_time datetime comment '操作时间'
)comment = '分享表';

-- 评议表
create table `ge_comment`(
  id int primary key auto_increment comment '编号',
  user_id int comment '用户 ID ',
  policy_id int comment '政策对象 ID ',
  comment_time datetime comment '评议时间',
  comment_content varchar(128) comment '评议内容',   -- 要不要改为255
  policy_type varchar(16) comment '政策对象类型',
  comment_type varchar(16) comment '评议类型',
	operate_time datetime comment '操作时间'
)comment = '评议表';

-- 阅读表
create table ge_read(
  id int primary key auto_increment comment '编号',
  user_id int comment '用户 ID ',
  policy_id int comment '政策对象 ID ',  -- 政策 、 解读、 申报
  readed_time datetime comment '阅读时间',			-- 上面的一些是8 
  readed_type varchar(16) comment '阅读类型',
  policy_type varchar(16) comment '政策对象类型',
	operate_time datetime comment '操作时间'
)comment = '阅读表';


-- 收藏表
create table ge_favor(
  id int primary key auto_increment comment '编号',
  user_id int comment '用户 ID ',
  policy_id int comment '政策对象 ID ',
  favor_time datetime comment '收藏时间',
  favor_type varchar(16) comment '收藏类型',
  policy_type varchar(16) comment '政策对象类型',
	operate_time datetime comment '操作时间'
) comment = '收藏表';

-- 订阅表
create table ge_subscription(
  id int primary key auto_increment comment '编号',
  user_id int comment '用户 ID ',
  policy_id int comment '政策对象 ID ',
  subs_time datetime comment '订阅时间',
  cancel_time datetime comment '取消时间',
  subs_type varchar(16) comment '订阅类型',
  policy_type varchar(16) comment '政策对象类型',
  subs_status varchar(8) comment '订阅状态'
)comment = '订阅表';

-- 点赞表
create table ge_upvote(
  id int primary key auto_increment comment '编号',
  user_id int comment '用户 ID ',
  policy_id int  comment '政策对象 ID ',
  upvote_time datetime comment '点赞时间',
  cancel_time datetime comment '取消时间',
  upvote_type varchar(16) comment '点赞类型',
	policy_type varchar(16) comment '政策对象类型',
	opearte_time datetime comment '操作时间'
)comment = '点赞表';

-- 用户表： 政府和企业
create table `ge_user`(
  id int primary key auto_increment comment '编号',
  enterprise_id int comment '企业信息表 ID ',
  institution_id int comment '政府事业单位表 ID ',	 	-- 政府事业单位表
  `number` varchar(32) comment '账号',
  password varchar(32) comment '密码',
  contact varchar(32) comment '联系人',
  email varchar(32) comment '邮箱',
  head_portrait varchar(64) comment '头像',
  phone varchar(16) comment '电话',
  remark varchar(256) comment '备注'	,
  id_card varchar(32) comment '身份证',
  birthday datetime comment '出生日期',
  parse_id int comment '父级id',
  `status` varchar(16) comment '状态，激活，未激活',
  `type` varchar(16) comment '企业用户或政府用户'
)comment = '用户表';


-- 角色表
/*CREATE TABLE `ge_roles` (
  `id` INT NULL DEFAULT auto_increment COMMENT '角色编号',
  `name` VARCHAR(45) NULL COMMENT '角色名称',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '角色表';


-- 权限表
CREATE TABLE `ge_root` (
  `id` INT NULL DEFAULT auto_increment,
  `name` VARCHAR(45) NULL COMMENT '权限名称',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '权限表';


-- 用户角色关联表
CREATE TABLE `ge_user_roles_asspcoate` (
  `id` INT NULL DEFAULT auto_increment COMMENT '编号',
  `user_id` INT NULL COMMENT '用户ID',
  `role_id` INT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '用户角色关联表';


-- 用户权限关联表
CREATE TABLE `ge_user_root_associate` (
  `id` INT NULL DEFAULT auto_increment COMMENT '编号',
  `user_id` INT NULL COMMENT '用户ID',
  `root_id` INT NULL COMMENT '权限ID',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '用户权限关联表';*/


-- 记录系统错误日志表
create table ge_log_system(
	id int primary key auto_increment comment '编号',
	type varchar(128) comment '报错类型',
	content longtext comment '报错内容',
	status varchar(16) comment '是否处理',
	error_time datetime comment '报错时间',
	process_time datetime comment '报错处理时间'
)comment = '系统错误日志表';

create table ge_log_operate(
	id int primary key auto_increment comment '编号',
	opearte_time datetime comment '操作时间',
	user_id int comment '用户ID',
	record varchar(32) comment '操作记录',
	user_type varchar(8) comment '用户类型（政府、企业）'
) comment '操作日志表';

create table ge_log_visit(
	id int primary key auto_increment comment '编号',
	user_id int comment '用户ID',
	ip varchar(16) comment 'IP地址',
	visit_url varchar(128) comment '访问url',
	visit_time datetime comment '访问时间',
	visit_times int comment '访问次数'
) comment '访问日志表';

create table ge_log_error(
	id int primary key auto_increment comment '编号',
	log_operate_id int comment '操作日志表ID',
	user_id int,
	err_time datetime comment '错误时间',
	err_info varchar(256) comment '错误信息',
  user_type varchar(8) comment '用户类型'
)comment '错误日志表';
