package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
//        Account jungsAccount = new Account();
//        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "email", "1234567890");
//        System.out.println(jungsAccount.getBalance());
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(50.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100);
//
//        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getNumber() + timsAccount.getC(););

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 20500.00);
        System.out.println(person2.getName());
    }
}
