# 建表以演示count
CREATE TABLE t10 (
			`name` VARCHAR(20)
);
INSERT INTO t10 VALUES('tom');
INSERT INTO t10 VALUES('jack');	
INSERT INTO t10 VALUES('marry');
INSERT INTO t10 VALUES(NULL);	

SELECT * FROM t10;					