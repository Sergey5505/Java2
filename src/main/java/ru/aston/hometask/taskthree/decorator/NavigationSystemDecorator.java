package ru.aston.hometask.taskthree.decorator;

class NavigationSystemDecorator implements Car {
    private Car decoratedCar;

    public NavigationSystemDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void assemble() {
        decoratedCar.assemble();
        addNavigationSystem();
    }

    private void addNavigationSystem() {
        System.out.println("Установлена навигационная система");
    }
}
