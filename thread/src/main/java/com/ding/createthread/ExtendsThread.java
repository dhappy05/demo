package com.ding.createthread;

/**
 * Created by ding on 2016/10/13.
 * 通过继承Thread类实现线程
 */
public class ExtendsThread extends Thread {
    @Override
    public void run() {
        System.out.println("my ExtendsThread start");
    }
}
