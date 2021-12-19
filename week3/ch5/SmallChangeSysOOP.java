package com.student.smallchangeoop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类用于完成零钱通的各个功能*/
public class SmallChangeSysOOP {
    //界面系统循环判断条件
    private Boolean loop = true;
    //接收器
    private Scanner scanner = new Scanner(System.in);
    //明细条目
    private String details = "------------零钱通明细------------";
    //余额
    private double balance;
    //日期
    private Date date = null;//定义日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//日期格式化

    //菜单界面
    public void mainMenu() {
        //界面分支选择
        String key;
        do{
            System.out.println("============零钱通菜单============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退\t出");
            System.out.println("请选择(1-4)");

            key = scanner.next();
            switch (key) {
                case "1":
                    detail();
                    break;
                case "2":
                    income();
                    break;
                case "3":
                    pay();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("输入不合法");
            }
        }while(loop);
    }

    //明细
    public void detail() {
        System.out.println(details);
    }

    //入账
    public void income() {
        System.out.println("收益入账金额：");
        double money = scanner.nextDouble();
        //校验差错
        if (money <= 0) {
            System.out.println("收入金额应该大于0");
            return;
        }
        balance = balance + money;
        date = new Date();
        details = details + "\n收益入账\t+" + money + "\t" + sdf.format(date)
                + "\t" + balance;
    }

    //消费
    public void pay() {
        System.out.println("请输入消费金额：");
        double money = scanner.nextDouble();
        //差错检验
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应该大于0且小于余额：" + balance);
            return;
        }
        System.out.println("请输入消费项目：");
        String note = scanner.next();
        //余额
        balance = balance - money;
        //消费时间
        date = new Date();
        details = details + "\n" + note + "\t-" + money + "\t" + sdf.format(date)
                + "\t" + balance;
    }

    //退出
    public void exit() {
        String choice;
        while (true) {
            System.out.println("你确定要退出吗？ y/n");
            choice = scanner.next();
            if (choice.equals("y") || choice.equals("n")) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
