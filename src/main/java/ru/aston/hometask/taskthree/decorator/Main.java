package ru.aston.hometask.taskthree.decorator;

class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        Car climateControlCar = new ClimateControlDecorator(basicCar);
        Car navigationCar = new NavigationSystemDecorator(climateControlCar);

        navigationCar.assemble();
    }
}
