package ru.aston.hometask.taskfourone;

public class DeadlockExample {
    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("Поток #1 захватил LockA");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (lockB) {
                    System.out.println("Поток #1 хочет захватить LockB");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("Поток #2 захватил LockB");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (lockA) {
                    System.out.println("Поток #2 хочет захватить LockA");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
