# 演示decimal，float，double类型的使用

#创建表
CREATE TABLE t4 (
			num1 FLOAT,
			num2 DOUBLE,
			num3 DECIMAL(30,20)); #如果不指定大小，默认为10位整数
#decimal可以存放很大的数			
			
INSERT INTO t4 VALUES(88.12345678912345, 88.12345678912345, 88.12345678912345);		

SELECT * FROM t4;