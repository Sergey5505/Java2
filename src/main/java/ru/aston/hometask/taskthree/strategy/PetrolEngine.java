package ru.aston.hometask.taskthree.strategy;

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Запуск бензинового двигателя");
    }
}
