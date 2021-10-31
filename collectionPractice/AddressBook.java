package com.collectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    ArrayList<PersonInfo> contacts = new ArrayList<>();

    public void addContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter FirstName: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter LastName: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter addres: ");
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
            PersonInfo addPerson = (PersonInfo) contacts.get(i);
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
            PersonInfo addPerson = (PersonInfo) contacts.get(i);
            if (removeName.equals(addPerson.firstName)) {
                contacts.remove(i);
                System.out.println(contacts);
            }
        }

    }
}
