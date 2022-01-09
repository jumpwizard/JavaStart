package com.hspedu.tankgame3;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class EnemyTank extends Tank{
    private static int initSize = 3;
    public EnemyTank(int x, int y) {
        super(x, y);
        setDirect(1);
    }

    public static int getSize() {
        return initSize;
    }

    public static void setSize(int size) {
        EnemyTank.initSize = size;
    }
}
