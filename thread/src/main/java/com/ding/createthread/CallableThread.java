package com.ding.createthread;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * Created by ding on 2016/10/13.
 * 通过实现callable接口实现线程（通过线程池来执行线程并获取返回值时会用到该类）
 */
public class CallableThread implements Callable{
    private String taskNum;

    CallableThread(String taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(">>>" + taskNum + "任务启动");
        Date dateTmp1 = new Date();
        Thread.sleep(10000);
        Date dateTmp2 = new Date();
        long time = dateTmp2.getTime() - dateTmp1.getTime();
        System.out.println(">>>" + taskNum + "任务终止");
        return taskNum + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
    }
}
