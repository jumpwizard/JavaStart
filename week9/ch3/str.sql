# 演示字符串相关函数的使用
-- 返回字串字符集
SELECT CHARSET(ename) FROM emp;
-- 连接字符串
SELECT * FROM emp;
SELECT CONCAT(ename, 'job is', job) FROM emp;
-- 返回substring在string中出现的位置，没有返回0
SELECT INSTR('hanshunping', 'ping') FROM DUAL;#dual是亚元表，系统表，可以作为测试表使用
-- 转成大写
SELECT UCASE(ename) FROM emp;
-- 转成小写
SELECT LCASE(ename) FROM emp;
-- 从string中的左边起取n个字符
SELECT LEFT(ename, 2) FROM emp;
-- 从string中的右边起取n个字符
SELECT RIGHT(ename, 2) FROM emp;
-- 返回长度[按照字节]
SELECT LENGTH(ename) FROM emp;
-- 替换 （把manager替换成经理）
SELECT ename, REPLACE(job, 'MANAGER', '经理') FROM emp;
-- 逐字符比较两字串大小
SELECT STRCMP('hsp', 'jsp') FROM DUAL;
-- 截取(从ename中第一个位置开始【从1开始计算】，取出两个字符)
SELECT SUBSTRING(ename, 1, 2) FROM emp;
-- 去除左右两端空格
SELECT  LTRIM(' z h y ') FROM DUAL;
-- 练习：将所有员工姓名首字母改为小写
SELECT CONCAT(
		LCASE(SUBSTRING(ename, 1,1)), 
		SUBSTRING(ename,2)) FROM emp;
SELECT CONCAT(
		LCASE(SUBSTRING(ename, 1,1)), 
		RIGHT(ename,LENGTH(ename) - 1)) FROM emp;
SELECT CONCAT(
		LCASE(LEFT(ename,1)), 
		RIGHT(ename,LENGTH(ename) - 1)) FROM emp;		