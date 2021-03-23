package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) {
        Process proc;
        try {
            //大括号中，第一个双引号里是python解释器的路径，第二个双引号里是要执行的python文件的路径
            String[] a = new String[]{"D:\\LJC\\anaconda3\\envs\\ten1\\python.exe", "C:\\Users\\16203\\Desktop\\java_python\\src\\python.py"};
            proc = Runtime.getRuntime().exec(a);
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream(), "GBK"));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            proc.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
