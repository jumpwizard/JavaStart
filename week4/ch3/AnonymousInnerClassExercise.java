package com.hspedu.innerclass;

public class AnonymousInnerClassExercise {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
class CellPhone {
    public void alarmClock(Bell bell) {
        bell.ring();
    }
}
interface Bell {
    void ring();
}