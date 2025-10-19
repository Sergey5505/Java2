package ru.aston.hometask.taskthree.chainofResponsibility;

class StopCommand extends CommandHandler {
    @Override
    public void handle(String command) {
        if ("stop".equals(command)) {
            System.out.println("Автомобиль остановлен");
        } else if (nextHandler != null) {
            nextHandler.handle(command);
        }
    }
}
