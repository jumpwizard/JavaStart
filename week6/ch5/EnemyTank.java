package com.hspedu.tankgame4;

import java.awt.event.KeyEvent;
import java.util.Vector;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class EnemyTank extends Tank {
    private static int initSize = 3;
    public EnemyTank(int x, int y) {
        super(x, y);
        setDirect(1);
    }

    @Override
    public void run() {
        while (true) {
            if (getLive() && getShots().size() < 1) {
                shotEnemyTank();
            }
            switch (getDirect()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        moveUp();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        moveDown();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        moveLeft();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        moveRight();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                default:
                    break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //随机改变方向
            setDirect((int)(Math.random() * 4));
            //结束线程条件
            if (!getLive()) {
                break;
            }
        }
    }

    public static int getSize() {
        return initSize;
    }

    public static void setSize(int size) {
        EnemyTank.initSize = size;
    }
}
