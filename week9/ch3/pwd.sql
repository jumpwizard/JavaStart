#演示加密函数和系统函数
-- 查询用户
SELECT USER() FROM DUAL;
-- 查询当前使用数据库名称
SELECT DATABASE() FROM DUAL;
-- 为字符串算出一个md5 32的字符串，常用于密码加密
-- 密码：hsp。在数据库中存放的是加密后的密码，而非明文
SELECT MD5('hsp') FROM DUAL;
-- 加密函数 （当前版本的mysql加密账户密码的方法）
SELECT PASSWORD('hsp') FROM DUAL;
#查询数据库表(可看到加密后的用户密码)
SELECT * FROM mysql.`user`;