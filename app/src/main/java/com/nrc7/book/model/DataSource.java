package com.nrc7.book.model;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public DataSource() {
    }

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Book book = new Book();
            book.setName("Libro " + i);
            book.setAuthor("Autor " + i);
            books.add(book);
        }
        return books;
    }
}
