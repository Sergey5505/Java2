package dzonetwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иван Иванов",
                        Arrays.asList(new Book("Book A", 200, 2001),
                                new Book("Book B", 150, 1995),
                                new Book("Book C", 140, 1998),
                                new Book("Book D", 90, 2025),
                                new Book("Book E", 300, 2005))),
                new Student("Петр Петров",
                        Arrays.asList(new Book("Book A", 250, 2003),
                                new Book("Book B", 180, 2011),
                                new Book("Book C", 80, 1999),
                                new Book("Book D", 180, 2002),
                                new Book("Book E", 220, 2004)))
        );

        Optional<Integer> result = students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYearPublished() > 2000)
                .limit(3)
                .map(Book::getYearPublished)
                .findFirst();

        System.out.println(result.isPresent() ? "Год выпуска первой подходящей книги: " + result.get() : "Подходящих книг не найдено");
    }
}
