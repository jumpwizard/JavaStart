#演示整形数据类型

#以tinyint来演示范围： 有符号 -128~127     无符号 0~255
CREATE TABLE t2 (             #表的字符集，校验规则，存储引擎均使用默认。
			id TINYINT ) ;   #如果没用指定unsigned，则tinyint就是有符号的
			
CREATE TABLE t2 (             #表的字符集，校验规则，存储引擎均使用默认。
			id TINYINT UNSIGNED) ;  		
			
INSERT INTO t2 VALUES(-128);			