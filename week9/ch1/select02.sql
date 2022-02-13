-- 1.统计每个学生的总分
SELECT `name`, (chinese + english + math) FROM student;
-- 2.统计所有学生的总分加10分
SELECT `name`, (chinese + english + math + 10) FROM student;
-- 3.使用别名表示学生总分
SELECT `name` AS '名字', (chinese + english + math) AS total_score FROM student;