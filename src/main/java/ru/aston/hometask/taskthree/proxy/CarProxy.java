package ru.aston.hometask.taskthree.proxy;

class CarProxy {
    private RealCar realCar;

    public void drive() {
        if (realCar == null) {
            realCar = new RealCar();
        }
        realCar.drive();
    }
}
