# 演示数据库的操作
#1.创建一个名为hsp_db01的数据库
CREATE DATABASE hsp_db01
#删除数据库
DROP DATABASE hsp_db01
#创建一个使用utf8字符集的hsp_db02数据库
CREATE DATABASE hsp_db02 CHARACTER SET utf8
#创建一个使用utf8字符集，并带校对规则的hsp_db03数据库
CREATE DATABASE hsp_db03 CHARACTER SET utf8 COLLATE utf8_bin
#校对规则utf8_bin区分大小写，默认utf8_general_ci 不区分大小写

#查询语句, * 表示所有字段
SELECT * 
		FROM t1 
		WHERE NAME = 'tom'