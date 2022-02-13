#演示update语句
DESC employee;
SELECT * FROM employee;
-- 要求：在上面创建的employee表中修改表中的记录
INSERT INTO employee (id, user_name, salary)
			VALUES(2, '老妖怪',50000);
-- 1.将所有员工薪水修改为5000元
UPDATE employee SET salary = 3000;
-- 2.将姓名为zhy的员工的薪水改为55000元
UPDATE employee 
			SET salary = 55000
			WHERE user_name = 'zhy' 
-- 3.将老妖怪的薪水在原有基础上增加1000元，更换job
UPDATE employee
			SET salary = salary + 1000, job = '扫地的'
			WHERE user_name = '老妖怪'