package ru.aston.hometask.taskthree.chainofResponsibility;

class Main {
    public static void main(String[] args) {
        CommandHandler startCmd = new StartCommand();
        CommandHandler stopCmd = new StopCommand();

        startCmd.setNext(stopCmd);

        startCmd.handle("start");
        startCmd.handle("stop");
    }
}