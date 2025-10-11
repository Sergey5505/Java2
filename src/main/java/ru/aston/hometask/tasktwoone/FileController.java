package ru.aston.hometask.tasktwoone;

import java.util.HashMap;
import java.util.Map;

public class FileController {
    private final Map<OperationEnum, FileHandler> strategies;

    public FileController() {
        strategies = new HashMap<>();
        strategies.put(OperationEnum.READ, new ReadStrategy());
        strategies.put(OperationEnum.WRITE, new WriteStrategy("Пример текста"));
    }

    public void process(OperationEnum operation, String filePath) {
        if (!strategies.containsKey(operation)) {
            throw new IllegalArgumentException("Неподдерживаемая операция");
        }
        strategies.get(operation).handle(filePath);
    }
}
