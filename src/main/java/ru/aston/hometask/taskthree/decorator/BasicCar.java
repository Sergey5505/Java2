package ru.aston.hometask.taskthree.decorator;

class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Собран базовый автомобиль.");
    }
}
