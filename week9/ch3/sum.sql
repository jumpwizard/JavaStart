# 演示sum函数的使用 （只能对数字使用）
DESC student;
-- 统计一个班数学总成绩
SELECT SUM(math) FROM student;
-- 统计一个班语文，数学，英语各科的总成绩
SELECT SUM(chinese) AS chinese_total, SUM(math), SUM(english)FROM student;
-- 统计一个班语文，数学，英语的成绩总和
SELECT SUM(math + english + chinese) FROM student;
-- 统计一个班级的平均分
SELECT SUM(math + english + chinese) / COUNT(*) FROM student;