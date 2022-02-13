#指令创建表（在实际开发中，指令要用的更多）
CREATE TABLE `user` (
			id INT,
			`name` VARCHAR(255),
			`password` VARCHAR(255),
			`birthday` DATE)
			CHARACTER SET utf8 COLLATE utf8_bin ENGINE INNODB;
