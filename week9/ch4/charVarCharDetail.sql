#1. char(4) 和 varchar(4) 这个4表示的是字符，而不是字节。
#（这四个字符用多少字节根据编码不同）
CREATE TABLE t7 (
			`name` CHAR(4));
INSERT INTO t7 VALUES('abcd');#这四个字符不区分汉字和字母，是字符就行	

CREATE TABLE t8 (
			`name` VARCHAR(4));	
INSERT INTO t8 VALUES('赵好运好');	
#2.char(4)是定长（固定的大小），即使插入'aa'，也会占用分配的四个字符的空间（适用于定长数据，
#如身份证号，手机号等，这样查询速度更快一些）
#varchar(4)是变长（变化的大小），如果插入'aa'，会按照实际占用的空间来分配
#（varchar本身还需要占用1~3个字节来记录存放内容长度）	

#3.如果varchar不够用，可以使用mediumtext，或者longtext	