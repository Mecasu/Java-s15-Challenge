package com.workintech.library.members;

import com.workintech.library.enums.User;

public class Librarian extends Person {


    public Librarian(String fullName, String password, User user) {
        super(fullName, password, user);
    }

    @Override
    public boolean whoAreYou(String fullName, String password) {
        return this.getFullName().equals(fullName) && this.getPassword().equals(password);
    }
}
