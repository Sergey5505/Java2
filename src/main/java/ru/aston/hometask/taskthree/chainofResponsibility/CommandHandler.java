package ru.aston.hometask.taskthree.chainofResponsibility;

abstract class CommandHandler {
    protected CommandHandler nextHandler;

    public void setNext(CommandHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handle(String command);
}
