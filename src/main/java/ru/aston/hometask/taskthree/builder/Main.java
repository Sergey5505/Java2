package ru.aston.hometask.taskthree.builder;

class Main {
    public static void main(String[] args) {
        Car myCar = new Car.CarBuilder()
                .brand("Москвич")
                .horsepower(75)
                .build();
        System.out.println(myCar);
    }
}
