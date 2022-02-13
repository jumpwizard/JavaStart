#演示统计函数的使用
-- 1.统计一个班级共有多少学生
SELECT COUNT(*) FROM student;
-- 2.统计数学成绩大于80的学生有多少个
SELECT COUNT(*) FROM student
			WHERE math > 80;
-- 3.统计总分大于250的学生有多少
SELECT COUNT(*) FROM student
			WHERE (chinese + english + math) > 250;
-- count(*) 和 count(列)的区别：
-- count(*) 返回满足条件的记录的行数
-- count(列) 统计满足条件的某列有多少个，但是 会排除为空的情况
SELECT * FROM t10;	
SELECT COUNT(*) FROM t10;
SELECT COUNT(`name`) FROM t10;							