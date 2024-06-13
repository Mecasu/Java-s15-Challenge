package com.workintech.library.members;

import com.workintech.library.bookcase.Book;
import com.workintech.library.enums.Status;
import com.workintech.library.enums.User;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Student extends Person {
    private final int MAX_BOOK = 5;
    private Set<Book> bookSet = new HashSet<>();

    public Student(String fullName, String password, User user) {
        super(fullName, password, user);
    }

    public void borrowBook(Book book) {
        if (bookSet.size() < MAX_BOOK && book.getStatus() == Status.AVAILABLE) {
            bookSet.add(book);
            // System.out.println(bookSet.size());
            book.setStatus(Status.NOT_AVAILABLE);
            System.out.println(book.getName()+ " succesfully borrowed. You have to return it in 15 days!");
            invoice(book);
        } else if (!(bookSet.size() < MAX_BOOK)){
            System.out.println("Unfortunately, you can't borrow more than 5 books");
        } else {
            System.out.println("Book is not available at this moment.");
        }
    }
    public void returnBook(Book book) {
        if (bookSet.remove(book)) {
            book.setStatus(Status.AVAILABLE);
            System.out.println(book.getName()+ " returned, money refunded.");

        } else {
            System.out.println("You tried to give us another book. Wait, you can't.");
        }
    }

    public void invoice(Book book){
        System.out.println("Invoice: " + book.getPrice() + "$");
    }


    @Override
    public boolean whoAreYou(String fullName, String password) {
        return this.getFullName().equals(fullName) && this.getPassword().equals(password);
    }
}
