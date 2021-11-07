package com.collectionPractice;

import java.util.Scanner;

class NewAddressBook {
    Scanner s = new Scanner(System.in);

    class Entry {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zip;
        private String phoneNumber;
        private String email;

        Entry(String firstName, String lastName, String address, String city, String state, String zip,
              String phoneNumber, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        Entry() {
            firstName = "";
            lastName = "";
            address = "";
            city = "";
            state = "";
            zip = "";
            phoneNumber = "";
            email = "";
        }

        public void readEntry() {
            System.out.println("First Name:" + firstName);
            System.out.println("Last Name:" + lastName);
            System.out.println("Address:" + address);
            System.out.println("City:" + city);
            System.out.println("State:" + state);
            System.out.println("Zip Code:" + zip);
            System.out.println("PhoneNumber:" + phoneNumber);
            System.out.println("Email:" + email);
        }
    }

    private int entries = 0;
    Entry[] contents;

    public void initEntries(int e) {
        contents = new Entry[e];
        for (int i = 0; i < contents.length; i++) {
            contents[i] = new Entry();
        }
    }

    public int getEntries() {
        return contents.length;
    }

    public void add(String firstName, String lastName, String address, String city, String state, String zip,
                    String phoneNumber, String email) {
        if (entries < contents.length) {
            contents[entries] = new Entry(firstName, lastName, address, city, state, zip, phoneNumber, email);
            entries++;
        } else System.out.println("Error: book is full");
    }


    public void remove(int entry) {
        if (entries > 0) {
            contents[entry] = new Entry();
            for (int i = 0; i < entries - entry; i++) {
                if (entry + 1 == entries) contents[entry] = new Entry();
                else {
                    Entry temp = contents[entry + i];
                    contents[entry + i] = contents[entry + i + 1];
                    contents[entry + i + 1] = temp;
                }
            }
            entries--;
        } else System.out.println("Error: book is empty.");
    }


    public void edit(String firstName, String lastName, String address, String city, String state, String zip,
                     String phoneNumber, String email, int selection) {
        contents[selection].firstName = firstName;
        contents[selection].lastName = lastName;
        contents[selection].address = address;
        contents[selection].city = city;
        contents[selection].state = state;
        contents[selection].zip = zip;
        contents[selection].phoneNumber = phoneNumber;
        contents[selection].email = email;
    }

    public void sort(int n) {
        for (int i = 0; i < contents.length; i++) {
            for (int j = 0; j < contents.length; j++) {
                switch (n) {
                    case 1:
                        if (contents[i].firstName.compareTo(contents[j].firstName) < 0) {
                            Entry temp = contents[i];
                            contents[i] = contents[j];
                            contents[j] = temp;
                        }
                        break;
                    case 2:
                        if (contents[i].lastName.compareTo(contents[j].lastName) < 0) {
                            Entry temp = contents[i];
                            contents[i] = contents[j];
                            contents[j] = temp;
                        }
                        break;
                    case 3:
                        if (contents[i].address.compareTo(contents[j].address) < 0) {
                            Entry temp = contents[i];
                            contents[i] = contents[j];
                            contents[j] = temp;
                        }
                        break;
                    case 4:
                        if (contents[i].email.compareTo(contents[j].email) < 0) {
                            Entry temp = contents[i];
                            contents[i] = contents[j];
                            contents[j] = temp;
                        }
                        break;
                    default:
                        System.out.println("Error: invalid field");
                        break;
                }
            }
        }
    }

    public void addFromCopy(Entry e) {
        if (entries < contents.length) {
            contents[entries] = e;
            entries++;
        } else System.out.println("Error: book is full");
    }
}











