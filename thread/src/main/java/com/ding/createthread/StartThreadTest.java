package com.ding.createthread;

/**
 * Created by ding on 2016/10/13.
 * 创建线程的测试main类
 */
public class StartThreadTest {
    public static void main(String... args){
        //创建通过继承实现的线程
        ExtendsThread extendsThread1 = new ExtendsThread();
        //启动线程
        extendsThread1.start();

        ImplementsRunableThread implementsRunableThread1 = new ImplementsRunableThread();
        //创建通过接口实现的线程
        Thread thread1 = new Thread(implementsRunableThread1);
        //启动线程
        thread1.start();


        System.out.println("finished...");
    }
}
