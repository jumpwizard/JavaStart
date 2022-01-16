package com.hspedu.tankgame5;

/**
 * @author 赵好运
 * @version 1.0
 **/
public class Hero extends Tank {

    public Hero(int x, int y) {
        super(x, y);
        setDirect(0);
    }

    @Override
    public void shotEnemyTank() {
        //if (getShot() == null || !getShot().getLive()) {
        super.shotEnemyTank();
        //}
    }
}
