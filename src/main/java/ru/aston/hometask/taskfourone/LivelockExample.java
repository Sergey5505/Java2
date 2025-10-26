package ru.aston.hometask.taskfourone;

import java.util.concurrent.atomic.AtomicBoolean;

class LivelockExample {
    private AtomicBoolean flag = new AtomicBoolean(false);

    public void methodOne() {
        while (true) {
            if (!flag.get()) {
                boolean expectedFalse = false;
                if (flag.compareAndSet(expectedFalse, true)) {
                    System.out.println("Метод One завершил работу");
                    break;
                } else {
                    System.out.println("Метод One снова попробует");
                }
            }
        }
    }

    public void methodTwo() {
        while (true) {
            if (flag.get()) {
                boolean expectedTrue = true;
                if (flag.compareAndSet(expectedTrue, false)) {
                    System.out.println("Метод Two завершил работу");
                    break;
                } else {
                    System.out.println("Метод Two снова попробует");
                }
            }
        }
    }

    public static void main(String[] args) {
        LivelockExample example = new LivelockExample();

        Thread t1 = new Thread(example::methodOne);
        Thread t2 = new Thread(example::methodTwo);

        t1.start();
        t2.start();
    }
}

