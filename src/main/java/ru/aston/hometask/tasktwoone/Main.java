package ru.aston.hometask.tasktwoone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = System.getenv().getOrDefault("FILE_PATH", "./src/main/resources/data.txt");

        FileController controller = new FileController();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите операцию:\n"
                    + "1. Прочитать\n"
                    + "2. Записать\n"
                    + "3. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    controller.process(OperationEnum.READ, filePath);
                    break;
                case 2:
                    controller.process(OperationEnum.WRITE, filePath);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }
}