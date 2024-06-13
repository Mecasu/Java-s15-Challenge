package com.workintech.library.bookcase;

import com.workintech.library.enums.Genre;
import com.workintech.library.enums.Status;

public class Tragedies extends Book{
    public Tragedies(long id, String author, String name, double price, Status status, int edition, Genre genre) {
        super(id, author, name, price, status, edition, genre);
    }
}
