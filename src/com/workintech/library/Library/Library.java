package com.workintech.library.Library;

import com.workintech.library.bookcase.Book;
import com.workintech.library.enums.Status;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Library {
    private LinkedList<Book> bookcase;

        public Library(){
            bookcase = new LinkedList<>();
        }
    public void addBook(Book book){
        if(bookcase.contains(book)){
            System.out.println("The book is already in database.");
        }else {
            bookcase.add(book);
        }
    }
    public Map<Long, Book> getBookcase(){
        Map<Long, Book> bookcaseMap = new HashMap<>();
        for (Book book : bookcase) {
            if(!book.getStatus().name().equals(Status.DELETED.name())){
                bookcaseMap.put(book.getId(), book);
            }
        }
        return bookcaseMap;
    }
    public Map<Long, Book> getBookById(Long id) {
        Map<Long, Book> bookId = new HashMap<>();
        for (Book book : bookcase) {
            if (book.getId() == (id)) {
                bookId.put(book.getId(), book);
            }
        }
        return bookId;
    }
    public Map<Long, Book> getBookByName(String name) {
        Map<Long, Book> availableBooks = getBookcase();
        Map<Long, Book> filteredBooks = new HashMap<>();
        for (Book book : availableBooks.values()) {
            if (book.getName().equals(name)) {
                filteredBooks.put(book.getId(), book);
            }
        }
        return filteredBooks;
    }
    public Map<Long, Book> getBookByAuthor(String author) {
        Map<Long, Book> availableBooks = getBookcase();
        Map<Long, Book> filteredBooks = new HashMap<>();
        for (Book book : availableBooks.values()) {
            if (book.getAuthor().equals(author)) {
                filteredBooks.put(book.getId(), book);
            }
        }
        return filteredBooks;
    }

    public Map<Long, Book> removeBookById(long id) {
        Map<Long, Book> bookcaseMap = new HashMap<>();
        Iterator iterator = bookcase.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            if (!book.getStatus().name().equals(Status.DELETED.name()) && book.getId() == (id)) {
                iterator.remove();
                book.setStatus(Status.DELETED);
            }
        }
        return bookcaseMap;
    }
}
