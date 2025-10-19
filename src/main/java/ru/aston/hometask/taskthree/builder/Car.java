package ru.aston.hometask.taskthree.builder;

class Car {
    private String brand;
    private int horsepower;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.horsepower = builder.horsepower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }

    static class CarBuilder {
        private String brand;
        private int horsepower;

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder horsepower(int hp) {
            this.horsepower = hp;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}