# 演示avg的使用
-- 求一个班级数学平均分
SELECT AVG(math) FROM student;
-- 求一个班级的总平均分
SELECT AVG(chinese + math + english) FROM student;

# 演示max和min的使用
-- 求班级最高分和最低分
SELECT MAX(chinese + math + english), MIN(chinese + math + english)
		FROM student;