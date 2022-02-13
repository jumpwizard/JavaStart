# 演示日期时间相关函数
-- 当前日期
SELECT CURRENT_DATE FROM DUAL;
-- 当前时间
SELECT CURRENT_TIME FROM DUAL;
-- 当前时间戳
SELECT CURRENT_TIMESTAMP FROM DUAL;

-- 创建测试表 信息表
CREATE TABLE mes(
	id INT , 
	content VARCHAR(30), 
	send_time DATETIME);
	
-- 添加一条记录
INSERT INTO mes 
	VALUES(1, '北京新闻', CURRENT_TIMESTAMP()); 
INSERT INTO mes VALUES(2, '上海新闻', NOW());
INSERT INTO mes VALUES(3, '广州新闻', NOW());

SELECT * FROM mes;
SELECT NOW() FROM DUAL;

-- 显示所有新闻信息，发布日期只显示日期，不用显示时间
SELECT id, content, DATE(send_time) FROM mes;
-- 查询在10分钟内发布的新闻
SELECT * FROM mes
	WHERE DATE_ADD(send_time, INTERVAL 10 MINUTE) >= NOW();
SELECT * FROM mes
	WHERE DATE_SUB(NOW(), INTERVAL 10 MINUTE) <= send_time;	
-- 求出2011-11-11 和 1990-1-1相差多少天
SELECT DATEDIFF('2011-11-11', '1990-1-1') FROM DUAL;	
-- 求相差多少具体时间(时分秒)
SELECT TIMEDIFF('10:11:11', '5:04:02') FROM DUAL;
-- 假如你活到75岁，算一算你还能活多少天
SELECT DATEDIFF('2081-08-26', NOW()) FROM DUAL;
SELECT DATEDIFF(DATE_ADD('2001-08-26', INTERVAL 80 YEAR), 
		NOW()) FROM DUAL;	
-- 缩小范围（包起来）
SELECT YEAR(NOW()) FROM DUAL;
-- 返回1970-1-1到现在的秒数
SELECT UNIX_TIMESTAMP() FROM DUAL;
-- 把一个秒数转成指定格式的日期(1970 + 该秒数的时间点)
-- 实际意义：在开发中可以存放一个整数表示时间，并以此进行转换
SELECT FROM_UNIXTIME(1644679058, '%Y-%m-%d') FROM DUAL;		