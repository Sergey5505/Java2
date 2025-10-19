package ru.aston.hometask.taskthree.chainofResponsibility;

class StartCommand extends CommandHandler {
    @Override
    public void handle(String command) {
        if ("start".equals(command)) {
            System.out.println("Автомобиль запущен");
        } else if (nextHandler != null) {
            nextHandler.handle(command);
        }
    }
}
