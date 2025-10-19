package ru.aston.hometask.taskthree.strategy;

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Запуск электрического двигателя");
    }
}
