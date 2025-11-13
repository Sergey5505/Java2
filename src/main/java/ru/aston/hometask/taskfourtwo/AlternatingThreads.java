package ru.aston.hometask.taskfourtwo;

public class AlternatingThreads {

    private static final Object lock = new Object();
    private static boolean firstTurn = true;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (!firstTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    System.out.print("1");
                    firstTurn = false;
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (firstTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    System.out.print("2");
                    firstTurn = true;
                    lock.notify();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
