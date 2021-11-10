package com.collectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TestClass {
    final static int exit = 10;

    public static void main(String[] args) {

        int option = 0;

        while (option != exit) {
            AddressBook add = new AddressBook();

            System.out.println("Choice one from given below");
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add a Person to the address book.\n 2. Edit Person Info. \n 3. Delete person Info. \n 4.Select Another Book \n 5.Duplicate check \n 6. Search Person by city \n 7. View person by city and state\n 10.Exit\n");
            option = scanner.nextInt();


            switch (option) {
                case 1:
                    add.setContacts();

                    System.out.println("Enter your contact's first name:n");
                    String name = scanner.next();
                    add.addContacts(new PersonInfo(name));
                    break;
                case 2:
                    System.out.println("Enter a name you want to edit :");
                    Scanner edit = new Scanner(System.in);
                    String editName = edit.nextLine();
                    add.editPerson(editName);
                    break;
                case 3:
                    System.out.println("Enter a name you want to remove :");
                    Scanner remove = new Scanner(System.in);
                    String removeName = remove.nextLine();
                    add.remove(removeName);
                    break;
                case 4:
                    add.addNewAddressBook();
                    break;
                case 5:
                    System.out.println("Enter your first name :");
                    Scanner s = new Scanner(System.in);
                    String duplicateName = s.nextLine();
                    add.duplicateCheck(duplicateName);
                case 6:
                    Scanner search = new Scanner(System.in);
                    System.out.println("Enter city name");
                    String city = search.nextLine();
                    add.searchCity(city);
                    break;
                case 7:
                    Scanner view = new Scanner(System.in);
                    System.out.println("Enter city name");
                    String cityName = view.nextLine();
                    System.out.println("Enter state name");
                    String state = view.nextLine();
                    add.view(cityName, state);
                    break;
                case exit:
                    break;
            }
        }
    }
}

