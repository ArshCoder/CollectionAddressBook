package com.collectionPractice;

import java.awt.print.Book;
import java.util.*;

public class AddressBook {
    ArrayList<PersonInfo> contacts = new ArrayList<>();

    public void addContacts() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter FirstName: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter LastName: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter city: ");
        String city = scanner.nextLine();
        System.out.println("Enter state: ");
        String state = scanner.nextLine();
        System.out.println("Enter zip: ");
        String zip = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        PersonInfo addPerson = new PersonInfo(firstName, lastName, address, city, state, zip, phoneNumber, email);
        contacts.add(addPerson);

        System.out.println(addPerson);
        System.out.println(contacts);
    }

    public void editPerson(String editName) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < contacts.size(); i++) {
            PersonInfo addPerson = contacts.get(i);
            if (editName.equals(addPerson.firstName)) {
                System.out.println(
                        "Enter number to update \n 1:FirstName \n 2:Lastname \n 3:Address \n 4:City \n 5:State \n 6:Zip \n 7:PhoneNumber \n 8:Email ");
                int updateChoice = scanner.nextInt();
                scanner.nextLine();

                switch (updateChoice) {
                    case 1:
                        System.out.println("Enter FirstName to edit");
                        String firstName = scanner.nextLine();
                        contacts.get(i).setFirstName(firstName);
                        break;
                    case 2:
                        System.out.println("Enter LatName to edit");
                        String lastName = scanner.nextLine();
                        contacts.get(i).setLastName(lastName);
                        break;
                    case 3:
                        System.out.println("Enter Address to edit");
                        String address = scanner.nextLine();
                        contacts.get(i).setAddress(address);
                        break;
                    case 4:
                        System.out.println("Enter City to edit");
                        String city = scanner.nextLine();
                        contacts.get(i).setCity(city);
                        break;
                    case 5:
                        System.out.println("Enter  State to edit");
                        String state = scanner.nextLine();
                        contacts.get(i).setState(state);
                        break;
                    case 6:
                        System.out.println("Enter Zip to edit");
                        String zip = scanner.nextLine();
                        contacts.get(i).setZip(zip);
                        break;
                    case 7:
                        System.out.println("Enter PhoneNumber to edit");
                        String phoneNumber = scanner.nextLine();
                        contacts.get(i).setPhoneNumber(phoneNumber);
                        break;
                    case 8:
                        System.out.println("Enter Email to edit");
                        String email = scanner.nextLine();
                        contacts.get(i).setEmail(email);
                        break;
                }

            }
        }
        System.out.println(contacts);
    }

    public void remove(String removeName) {
        for (int i = 0; i < contacts.size(); i++) {
            PersonInfo addPerson = contacts.get(i);
            if (removeName.equals(addPerson.firstName)) {
                contacts.remove(i);
                System.out.println(contacts);
            }
        }

    }

    public void addNewAddressBook() {
        Scanner s = new Scanner(System.in);
        System.out.print("How many books do you want to create? ");
        int howManyBooks;
        int howManyEntries;

        NewAddressBook[] library = new NewAddressBook[0];

        while (true) {
            howManyBooks = s.nextInt();
            if (howManyBooks > 0) {
                library = new NewAddressBook[howManyBooks];
                break;
            } else
                System.out.print("You must create at least 1 book.");

        }
        for (int i = 0; i < library.length; i++) {

            library[i] = new NewAddressBook();
            while (true) {
                System.out.print("How many entries in book " + i + "? ");
                howManyEntries = s.nextInt();
                if (howManyEntries > 0) {
                    library[i].initEntries(howManyEntries);
                    break;
                } else
                    System.out.println("You must create at least 1 Entry.");

            }
        }

        boolean done = false;
        int selectedBook = 0;
        int option = 0;
        while (true) {
            System.out.println("Book " + selectedBook + " is currently selected.");


            for (int j = 0; j < library[selectedBook].getEntries(); j++) {
                System.out.println("===========Entry " + j + " ===========");
                library[selectedBook].contents[j].readEntry();
                System.out.println("================================");
            }
            System.out.println("Select an option!");
            System.out.println("1. Add an entry");
            System.out.println("2. Remove an entry");
            System.out.println("3. Edit an entry");
            System.out.println("4. Sort all entries in this book");
            System.out.println("5. Select another book");
            System.out.println("6. Move entry across books");
            System.out.println("7. Exit the menu");
            System.out.print("> ");
            int selection = s.nextInt();
            String firstName, lastName, address, city, state, zip, phoneNumber, email;
            switch (selection) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter FirstName: ");
                    firstName = scanner.nextLine();
                    System.out.println("Enter LastName: ");
                    lastName = scanner.nextLine();
                    System.out.println("Enter addres: ");
                    address = scanner.nextLine();
                    System.out.println("Enter city: ");
                    city = scanner.nextLine();
                    System.out.println("Enter state: ");
                    state = scanner.nextLine();
                    System.out.println("Enter zip: ");
                    zip = scanner.nextLine();
                    System.out.println("Enter phone number: ");
                    phoneNumber = scanner.nextLine();
                    System.out.println("Enter email: ");
                    email = scanner.nextLine();
                    library[selectedBook].add(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    break;
                case 2:
                    System.out.print("Remove which entry? ");
                    int entry = s.nextInt();
                    library[selectedBook].remove(entry);
                    break;
                case 3:
                    scanner = new Scanner(System.in);
                    System.out.print("Edit which entry?");
                    int whichEntry = s.nextInt();
                    System.out.println("Enter FirstName: ");
                    firstName = scanner.nextLine();
                    System.out.println("Enter LastName: ");
                    lastName = scanner.nextLine();
                    System.out.println("Enter addres: ");
                    address = scanner.nextLine();
                    System.out.println("Enter city: ");
                    city = scanner.nextLine();
                    System.out.println("Enter state: ");
                    state = scanner.nextLine();
                    System.out.println("Enter zip: ");
                    zip = scanner.nextLine();
                    System.out.println("Enter phone number: ");
                    phoneNumber = scanner.nextLine();
                    System.out.println("Enter email: ");
                    email = scanner.nextLine();
                    library[selectedBook].edit(firstName, lastName, address, city, state, zip, phoneNumber, email, whichEntry);
                    break;
                case 4:
                    System.out.println("Sort alphabetically by which field?");
                    System.out.println("1. Sort by first name");
                    System.out.println("2. Sort by last name");
                    System.out.println("3. Sort by address");
                    System.out.println("4. Sort by email");
                    library[selectedBook].sort(s.nextInt());
                    break;
                case 5:
                    System.out.print("Select which book?");
                    selectedBook = s.nextInt();
                    break;
                case 6:
                    System.out.print("Move which entry? ");
                    int entryNo = s.nextInt();
                    NewAddressBook.Entry entryToMove = library[selectedBook].contents[entryNo];
                    library[selectedBook].remove(entryNo);
                    System.out.print("To which book? ");
                    int whichBook = s.nextInt();
                    library[whichBook].addFromCopy(entryToMove);
                    break;
                case 7:
                    done = true;
                    break;
                default:
                    System.out.print("Please choose a valid menu number");

            }

        }

    }
}





