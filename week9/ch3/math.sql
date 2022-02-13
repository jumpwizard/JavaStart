#演示数学相关函数
-- 绝对值
SELECT ABS(-10) FROM DUAL;
-- 十进制转二进制
SELECT BIN(10) FROM DUAL;
-- 向上取整
SELECT CEILING(1.1) FROM DUAL;
-- 进制转换(将十进制的9转换成二进制)
SELECT CONV(9, 10, 2) FROM DUAL;
-- 向下取整
SELECT FLOOR(1.1) FROM DUAL;
-- 保留小数位数(将78.12345保留两位小数【四舍五入】)
SELECT FORMAT(78.12345, 2) FROM DUAL;
-- 转16进制
-- 求最小值
SELECT LEAST(0, 1, -10, 4) FROM DUAL;
-- 求余
SELECT MOD(10, 3) FROM DUAL;
-- 返回一个随机数，其范围是0~1.0
SELECT RAND() FROM DUAL;-- 每次运行结果随机，因为没有固定种子值
SELECT RAND(3) FROM DUAL;-- 设置种子值，每次运行结果相同