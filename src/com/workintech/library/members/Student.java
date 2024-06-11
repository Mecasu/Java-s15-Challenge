package com.workintech.library.members;

import com.workintech.library.enums.User;

import javax.management.relation.Role;

public class Student extends Person{
    public Student(String fullName, String password, User user) {
        super(fullName, password, user);
    }

    @Override
    Role whoareyou() {
        return null;
    }
}
