package ru.aston.hometask.tasktwotwo;

import java.io.IOException;

class FileHandler {

    public void readFile(String filePath) throws CustomFileException {
        try {
            throw new IOException("Ошибка при чтении файла");
        } catch (IOException e) {
            throw new CustomFileException("Ошибка при попытке прочитать файл: " + filePath, e);
        }
    }
}