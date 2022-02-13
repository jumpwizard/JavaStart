# 演示bit类型使用（实际使用不多，但有时一个值只有0和1，可以分配1bit的空间，节省空间）
#1. bit(m) m 在1~64
#2. 添加数据 范围
#3. 显示按照bit(二进制位显示)
CREATE TABLE t3 (num BIT (8));
INSERT INTO t3 VALUES(3);
SELECT * FROM t3;