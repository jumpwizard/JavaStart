package com.hspedu.writer;

import java.io.*;

/**
 * @author 赵好运
 * @version 1.0
 * 不要用Reader和Writer操作二进制文件（音频，图片，doc，pdf等等），只能用于文本文件
 **/
public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "d:\\Game\\test.txt";
        String destFilePath = "d:\\Game\\test\\test.txt";
        String line = " ";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));
        //需要手动添加换行符
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }

    }
}
