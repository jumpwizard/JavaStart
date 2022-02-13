#演示删除和查询数据库
#查看当前数据库服务器中的所有数据库
SHOW DATABASES
#查看之前创建的数据库的定义信息
SHOW CREATE DATABASE `hsp_db02` #非关键字加不加反引号没区别，为了安全可以加上
#在创建数据库，表的时候，若用关键字会报错，可以使用反引号解决
CREATE DATABASE `database`#例如database是关键字，但用反引号可以创建关键字数据库，表
#删除之前创建的数据库
DROP DATABASE hsp_db01