package ru.aston.hometask.tasktwotwo;

public class Main {
    public static void main(String[] args) {
        FileHandler handler = new FileHandler();

        try {
            handler.readFile("/path/to/file.txt");
        } catch (CustomFileException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
