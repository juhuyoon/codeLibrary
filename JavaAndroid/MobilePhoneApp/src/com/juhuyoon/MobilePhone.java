package com.juhuyoon;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact) {
        if(findContact(contact.getName()) >= 0 ) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0 ) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " , was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    public int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i = 0; i < myContacts.size(); i++ ){
            Contacts contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contact) {
        if(findContact(contact) >= 0 ) {
            return contact.getName();
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        System.out.println("Contact List");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + " . " +
                                this.myContacts.get(i).getName() + "-> "
                                + this.myContacts.get(i).getPhoneNumber());
        }

    }
}
