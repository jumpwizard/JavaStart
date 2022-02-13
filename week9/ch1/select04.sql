DESC student;
# 演示order by 使用
-- 对数学成绩排序后输入
SELECT * FROM student #默认是按照升序排序（ASC），降序是DESC
			ORDER BY math;
-- 对总分按从高到低的顺序输入
SELECT `name`, (chinese + english + math) AS total_score FROM student
			ORDER BY total_score DESC;
-- 对姓张的学生的成绩排序输出（升序）
SELECT `name`, (chinese + english + math) AS total_score FROM student
			WHERE `name` LIKE '张%'
			ORDER BY total_score ;