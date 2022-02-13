# 演示字符串类型使用 char varchar
#CHAR(SIZE)
#固定长度字符串，最大255字符
#VARCHAR(SIZE)  0~65535字节
#可变长度字符串，最大65532字节（utf8编码最大21844字符， 1~3个字节用于记录大小）
#utf8:(65535 - 3) / 3 = 21844个字符
#
CREATE TABLE t5 (
			`name` CHAR(255));
CREATE TABLE t6 (
			job VARCHAR(21844));			