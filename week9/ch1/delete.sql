# delete 语句演示
#delete语句仅能删除表中数据，而不能删除表本身，使用drop可以删除表本身内容
0
+0.
SELECT * FROM employee
-- 删除表中名称为'老妖怪'的记录
DELETE FROM employee
		WHERE user_name = '老妖怪';
-- 删除表中所有记录
DELETE FROM employee;