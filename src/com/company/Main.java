package com.company;

public class Main {

    public static void main(String[] args) {

        KidUsers k=new KidUsers();
        k.setAge(10);
        k.setBookType("kids");
        k.registerAccount();
        k.requestBook();
        k.setAge(18);
        k.setBookType("Fiction");
        k.registerAccount();
        k.requestBook();
        System.out.println("----------------------------");
        AdultUser a=new AdultUser();
        a.setAge(5);
        a.setBookType("kids");
        a.registerAccount();
        a.requestBook();
        a.setAge(23);
        a.setBookType("Fiction");
        a.registerAccount();
        a.requestBook();

    }
}
