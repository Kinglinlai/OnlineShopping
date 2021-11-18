CREATE TABLE 'login' {
	'username' varchar(30) NOT NULL,
	'password' varchar(30) DEFAULT NULL,
	PRIMARY KEY ('username')
}	ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

create table user_info(
first_name VARCHAR(30),
last_name VARCHAR(30),
phone_number VARCHAR(30),
account_name VARCHAR(30),
`password` VARCHAR(30),
`confirm_password` VARCHAR(30)
)
-- 商品数据库
create table goods_info
(
 user_name VARCHAR(30),
 commodity_name VARCHAR(100)
)