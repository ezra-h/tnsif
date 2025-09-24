package com.tnsif.ThreadJoin;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadJoin {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("All threads have finished, main thread ends.");
    }
}
