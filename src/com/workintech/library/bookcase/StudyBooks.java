package com.workintech.library.bookcase;

import com.workintech.library.enums.Genre;
import com.workintech.library.enums.Status;

import java.util.Date;

public class StudyBooks extends Book{

    public StudyBooks(long id, String author, String name, double price, Status status, int edition, Date dateOfPurchase, Genre genre) {
        super(id, author, name, price, status, edition, dateOfPurchase, genre);
    }
}
