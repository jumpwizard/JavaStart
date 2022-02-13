#创建表的课堂练习
-- 字段   		属性
-- id  	  	整形
-- name 		字符型
-- sex 		字符型
-- brithday	日期型（date）
-- entry_date  	日期型（datetime）
-- job 		字符型
-- salary 		小数型
-- resume 	文本型
CREATE TABLE `emp` (
		id INT,
		`name` VARCHAR (32),
		sex CHAR (1),
		brithday DATE,
		entry_date DATETIME,
		job VARCHAR(32),
		salary DOUBLE,
		`resume` TEXT #也可以用varchar
) CHARSET utf8 COLLATE utf8_bin ENGINE INNODB;

INSERT INTO `emp` 
		VALUES (1, 'zhy', '男', '2001-08-26', '2022-11-11 11:11:11', 'java工程师', '50000', '架构师');
SELECT * FROM `emp`;		
		