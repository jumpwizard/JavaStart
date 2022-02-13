#练习数据库的备份与恢复

#1.备份数据库，备份指令要在dos下执行
#这个备份的文件，就是对应的sql语句（创建并操作过的所有sql语句）
mysqldump -u root -p -B hsp_db02 hsp_db03 > d:\\bak.sql
#备份表（不加B，否则会把所有的表当成数据库）
mysqldump -u 用户名 -p 数据库 表一 表二 表n > 保存的文件目录

#删除数据库
DROP DATABASE hsp_db02;
DROP DATABASE hsp_db03;

#恢复数据库(注意：进入mysql命令行执行)
source d:\\bak.sql
#恢复表同恢复数据库
#第二个恢复方法，直接将bak.sql中的内容放到查询编辑器中执行
