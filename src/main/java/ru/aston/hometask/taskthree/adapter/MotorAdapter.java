package ru.aston.hometask.taskthree.adapter;

class MotorAdapter implements NewCarInterface {
    private OldMotorInterface motor;

    public MotorAdapter(OldMotorInterface motor) {
        this.motor = motor;
    }

    @Override
    public void start() {
        motor.oldStartMethod();
    }
}
