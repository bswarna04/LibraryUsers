package com.company;

import java.util.Objects;

public class AdultUser implements LibraryUser{
    int age ;
    String bookType;

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age > 12) {
            System.out.println("you have successfully registered under a Adult account");
        } else {
            System.out.println("Sorry age must be greater than 12 to register as an adult");
        }


    }

    @Override
    public void requestBook() {
        if (Objects.equals(bookType, "Fiction")) {
            System.out.println("Book issued successfully,please return the book within 7 days");

        } else {
            System.out.println("OOPs,you are allowed to take only adult Fiction books");
        }

    }
}
