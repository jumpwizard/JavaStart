-- 1.查询姓名为赵云的学生成绩
SELECT * FROM student 
			WHERE 	`name` = '赵云';
-- 2.查询英语成绩大于70分的所有同学
SELECT * FROM student
			WHERE english > 70;
-- 3.查询总分大于两百分的所有同学
SELECT * FROM student
			WHERE (chinese + math + english) > 200;
 -- 4.查询math大于60并且id大于4的同学成绩	
 SELECT * FROM student
			WHERE math > 60 AND id >4;
-- 5. 查询英语成绩大于语文成绩的同学
SELECT * FROM student 
			WHERE english > chinese;
-- 5. 查询总分大于200且数学成绩大于语文成绩且姓赵的学生
SELECT * FROM student
			WHERE (chinese + math + english) > 200 AND math > chinese 
			AND `name` LIKE '赵%'; -- 以'赵'为开头的筛选
-- 6.查询英语成绩在80~90之间的同学
SELECT * FROM student
			WHERE english BETWEEN 80 AND 90; -- 闭区间
SELECT * FROM student
			WHERE english >= 80 AND english =< 90;			
-- 7.查询数学成绩为89，90，91的同学	
SELECT * FROM student
			WHERE math = 89 OR math = 90 OR math = 91;	
SELECT * FROM student
			WHERE math IN (89, 90, 91);	
-- 8. 查询数学成绩比语文成绩多一分的同学
SELECT * FROM student
			WHERE (math - chinese) = 1;