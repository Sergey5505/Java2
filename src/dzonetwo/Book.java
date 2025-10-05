package dzonetwo;

import java.util.Objects;


class Book {
    private final String title;
    private final int pages;
    private final int yearPublished;

    public Book(String title, int pages, int yearPublished) {
        this.title = title;
        this.pages = pages;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", yearPublished=" + yearPublished +
                '}';
    }
}
