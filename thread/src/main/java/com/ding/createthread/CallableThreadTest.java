package com.ding.createthread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by ding on 2016/10/13.
 * 线和池的测试
 */
public class CallableThreadTest {
    public static void main(String... args) throws ExecutionException, InterruptedException {
        Date begin = new Date();

        int taskSize = 5;
        // 创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
        // 创建多个有返回值的任务
        List<Future> list = new ArrayList();
        for (int i = 0; i < 6; i++) {
            Callable c = new CallableThread(i + " ");
            // 执行任务并获取Future对象
            Future f = pool.submit(c);
            // System.out.println(">>>" + f.get().toString());
            list.add(f);
        }

        // 获取所有并发任务的运行结果
        for (Future f : list) {
        // 从Future对象上获取任务的返回值，并输出到控制台
            System.out.println(">>>" + f.get().toString());
        }
        Date end = new Date();
        System.out.println("----程序结束运行----，程序运行时间【"+ (end.getTime() - begin.getTime()) + "毫秒】");
        // 关闭线程池,如果线程池不关关则mail方法所在的线程不会结束
        pool.shutdown();
    }
}
