package com.example.boot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



@Component
public class BookService {
    private  static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(12,"Josh","abc@gmail.com"));
        list.add(new Book(34,"Alex","def@gmail.com"));
        list.add(new Book(56,"Max","ghi@gmail.com"));

    }

    private Book book;

    public List<Book> getAllBooks()
    {
        return list;
    }

    public Book getBookById(int id)
    {
        list.stream().filter(e->e.getId() == id).findFirst().get();
        return book;
    }

    public Book addBook(Book b)
    {
        list.add(b);
        return book;
    }



}
