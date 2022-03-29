package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        CreateContact contact1 = new CreateContact();
        contact1.createNew();
        contact1.display();
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Do you want to add new ? 1.Yes 2.No");
            int i = sc.nextInt();
            switch (i) {
                case 1 :
                    contact1.createNew();
                    contact1.display();
                    break;
                case 2 :
                    System.out.println("Thank You !");
                    isContinue = false;
                    break;
                default:
                    System.out.println("Enter eiter 1 or 2 only");
                    break;
            }
        }

    }
}
