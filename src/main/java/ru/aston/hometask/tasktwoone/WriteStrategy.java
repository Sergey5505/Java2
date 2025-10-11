package ru.aston.hometask.tasktwoone;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteStrategy implements FileHandler {
    private final String dataToWrite;

    public WriteStrategy(String dataToWrite) {
        this.dataToWrite = dataToWrite;
    }

    @Override
    public void handle(String filePath) {
        try {
            Files.write(Paths.get(filePath), dataToWrite.getBytes());
            System.out.println("Запись успешно выполнена.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл.");
        }
    }
}
