package com.company;

import java.util.Objects;

public class KidUsers implements LibraryUser {
    int age;
    String bookType;

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("you have successfully registered under a kids account");
        } else {
            System.out.println("Sorry age must be less tha 12 to register as a kid");
        }

    }

    @Override
    public void requestBook() {
        if (Objects.equals(bookType, "kids")) {
            System.out.println("Book issued successfully,please return the book within 10 days");

        } else {
            System.out.println("OOPs,you are allowed to take only kids books");
        }
    }
}
