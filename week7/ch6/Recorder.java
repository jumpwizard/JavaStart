package com.hspedu.tankgame5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 * @author 赵好运
 * @version 1.0
 * 该类用于记录相关信息和文件交互
 **/
public class Recorder {
    private static int destroyNum = 0;
    //定义IO对象
    private static BufferedWriter bufferedWriter = null;
    private static String recordFile = "src\\myRecord.txt";
    //定义Vector，存放还存活的坦克的信息
    private static Vector<Tank> tanks = null;

    //每当击毁一个坦克后，destroyNum++
    public static void addDestroyNum() {
        Recorder.destroyNum++;
    }

    //将上局游戏进度保存到文件
    public static void keepRecordFile() {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(recordFile));
            //保存分数
            bufferedWriter.write(destroyNum + "\r\n");
            //保存还存活的敌方坦克（坐标与方向）

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static int getDestroyNum() {
        return destroyNum;
    }

    public static void setDestroyNum(int destroyNum) {
        Recorder.destroyNum = destroyNum;
    }
}
