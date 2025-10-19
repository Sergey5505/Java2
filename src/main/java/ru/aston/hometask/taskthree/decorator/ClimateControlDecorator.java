package ru.aston.hometask.taskthree.decorator;

class ClimateControlDecorator implements Car {
    private Car decoratedCar;

    public ClimateControlDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void assemble() {
        decoratedCar.assemble();
        addClimateControl();
    }

    private void addClimateControl() {
        System.out.println("Установлен климат-контроль");
    }
}
