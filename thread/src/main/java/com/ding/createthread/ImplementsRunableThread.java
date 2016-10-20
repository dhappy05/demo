package com.ding.createthread;

/**
 * Created by ding on 2016/10/13.
 * 通过实现Runable接口实现线程
 */
public class ImplementsRunableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("my ImplementsRunableThread start");
    }
}
