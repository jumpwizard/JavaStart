#演示时间相关的类型
 CREATE TABLE t9 (
  #记录年月日
   birthday DATE,
  #记录年月日时分秒
   job_time DATETIME,
  #登陆时间,如果希望login_time自动更新，需要配置
   login_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
SELECT * FROM t9;

INSERT INTO t9(birthday, job_time)  #若不指定时间戳，则会自动载入当前时间
VALUES('2022-11-11', '2022-11-11 10:10:10');
