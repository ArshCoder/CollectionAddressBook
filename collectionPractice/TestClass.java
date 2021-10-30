package com.collectionPractice;

import java.util.Scanner;

public class TestClass {
    final static int exit = 10;

    public static void main(String[] args) {
        int option = 0;
        AddressBook add = new AddressBook();
        while (option != exit) {
            System.out.println("Choice one from given below");
            Scanner name = new Scanner(System.in);
            System.out.println("1. Add a Person to the address book.\n 2. Edit Person Info. \n 3. Delete person Info. \n 10.Exit\n");
            option = name.nextInt();

            switch (option) {
                case 1:
                    add.addContacts();
                    break;
                case 2:
                    break;
                case exit:
                    break;


            }
        }
    }
}
