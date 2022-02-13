# select基本语法：
-- SELECT [DISTINCT] * | {column1,column2...} FROM table_name
-- DISTINCT可选，指显示结果时，是否去掉重复数据
-- * 表示查询所有列， column指定列名
-- from指定查询哪张表

#创建表...

-- 查询表中所有学生的信息
SELECT * FROM student;
-- 查询表中所有学生的姓名和对应的英语成绩
SELECT `name`,english FROM student;
-- 查询时过滤表中的重复数据
SELECT DISTINCT id FROM student;
