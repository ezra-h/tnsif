package com.tnsif.ThreadWait;

class Message {
    public synchronized void waitForSignal() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is waiting...");
        try {
            wait(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " got notified and resumed!");
    }

    public synchronized void sendSignal() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is notifying...");
        notify(); 
    }
}

public class ThreadWait {
    public static void main(String[] args) {
        Message message = new Message();
        Thread t1 = new Thread(() -> message.waitForSignal(), "T1");
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            message.sendSignal();
        }, "T2");

        t1.start();
        t2.start();
    }
}
