package ru.aston.hometask.tasktwoone;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileProcessingTest {

    private static final String TEST_FILE_PATH = "./src/main/resources./test_data.txt";

    @Test
    public void testReadingFromFile() throws IOException {
        Files.write(Paths.get(TEST_FILE_PATH), "Тестовая строка".getBytes());

        FileController controller = new FileController();
        controller.process(OperationEnum.READ, TEST_FILE_PATH);

        new File(TEST_FILE_PATH).delete();
    }

    @Test
    public void testWritingToFile() throws IOException {
        boolean existsBefore = Files.exists(Paths.get(TEST_FILE_PATH));

        FileController controller = new FileController();
        controller.process(OperationEnum.WRITE, TEST_FILE_PATH);

        assert Files.exists(Paths.get(TEST_FILE_PATH));

        List<String> lines = Files.readAllLines(Paths.get(TEST_FILE_PATH));
        assert !lines.isEmpty();

        new File(TEST_FILE_PATH).delete();
    }
}