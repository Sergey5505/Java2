package ru.aston.hometask.taskthree.strategy;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();
        car.setEngine(new ElectricEngine());
        car.start();
    }
}
