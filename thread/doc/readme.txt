本模块用于线程的测试，包括多线有哪几中实现方式，线程同步有几种实现方式

一、线程的实现方式
    Java多线程实现方式主要有三种：
    继承Thread类、实现Runnable接口、使用ExecutorService、Callable、Future实现有返回结果的多线程。
    其中前两种方式线程执行完后都没有返回值，只有最后一种是带返回值的。

    1、继承Thread类实现多线程
    继承Thread类的方法尽管被我列为一种多线程实现方式，但Thread本质上也是实现了Runnable接口的一个实例，它代表一个线程的实例，并且，启动线程的唯一方法就是通过Thread类的start()实例方法。
    start()方法是一个native方法，它将启动一个新线程，并执行run()方法。
    这种方式实现多线程很简单，通过自己的类直接extend Thread，并复写run()方法，就可以启动新线程并执行自己定义的run()方法。
    详见ExtendsThread类

    2、实现Runnable接口方式实现多线程
    如果自己的类已经extends另一个类，就无法直接extends Thread，此时，必须实现一个Runnable接口。
    详见ImplementsRunableThread类


