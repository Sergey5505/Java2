package ru.aston.hometask.tasktwotwo;

import java.io.IOException;

public class CustomFileException extends IOException {

    public CustomFileException(String message, Throwable cause) {
        super(message, cause);
    }
}

