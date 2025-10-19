package ru.aston.hometask.taskthree.adapter;

class Main {
    public static void main(String[] args) {
        OldMotorInterface oldMotor = () -> System.out.println("Старое действие запуска мотора");
        NewCarInterface adaptedMotor = new MotorAdapter(oldMotor);
        adaptedMotor.start();
    }
}
