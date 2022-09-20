package com.codekul.multithreading;

public class ThreadSleep extends Thread {

    @Override
    public void run(){
        System.out.println("in run method");
        for (int i=0;i<4;i++){
            try {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
    }
}

class SleepImpl{
    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();

        t1.start();
        t2.start();
    }
}
