package com.workintech.library.members;

import com.workintech.library.enums.User;

import javax.management.relation.Role;
import java.util.Objects;

public abstract class Person {

    private String fullName;
    private String password;
    private User user;

    public Person(String fullName, String password, User user) {
        this.fullName = fullName;
        this.password = password;
        this.user = user;
    }

    abstract Role whoareyou();
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getFullName(), person.getFullName()) && Objects.equals(getPassword(), person.getPassword()) && getUser() == person.getUser();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getPassword(), getUser());
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", user=" + user +
                '}';
    }
}
