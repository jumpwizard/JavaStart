#insert语句的细节
DESC `goods`;
SELECT * FROM `goods`
-- 1.插入的数据应与字段的数据类型相同
INSERT INTO `goods` (id, goods_name, price)
		VALUES('30', '小米手机', 3000)
-- 2. 数据的长度应在列的规定范围内，如不能将长度为80的字符串加入到长度为40的列中
INSERT INTO `goods` (id, goods_name, price) 
		VALUES(40, 'vivovivovvvvvvvvvvvvvvvvvvvv手机', 4000)		
-- 3.在values中列出的数据位置必须与被加入的列的排列位置相对应
INSERT INTO `goods` (goods_name, id, price) 
		VALUES('vivo手机', 40, 4000)
-- 4.字符和日期型数据应包含在单引号中。
INSERT INTO `goods` (id, goods_name, price)
		VALUES(30, 小米手机, 3000)
-- 5.列可以插入空值(前提是该字段允许为空)
INSERT INTO `goods` (id, goods_name, price)
		VALUES(NULL, '小米手机', 3000)
-- 6.添加多条记录
INSERT INTO `goods` (id, goods_name, price)
		VALUES(50, '小米手机', 3000),
			      (60, '小米手机', 3000),
			      (70, '小米手机', 3000)
-- 7.如果是给表中所有的字段添加数据，可以不写前面的字段名称
INSERT INTO `goods`
		VALUES(30, '小米手机', 3000)		
-- 8.默认值的使用，当不给某个字段值时，如果有默认值就会自动添加，否则报错
INSERT INTO `goods` (goods_name, price)
		VALUES('小米手机', 3000)			      						