package com.juhuyoon;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("303 404 5055");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    queryContacts();
                    break;
                case 6:
                    printActions();
                    break;

            }

        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
    }

    private static void printActions() {
        System.out.println("\nAvailable Actions: \npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts \n" +
                           "2 - to add a new contact \n" +
                           "3 - to update an existing contact \n" +
                            "4 - to remove an existing contact \n" +
                           "5 - query if an existing contact exists \n" +
                           "6  - to print a list of available actions. "
        );
        System.out.println("Choose your actions");
    }
}
