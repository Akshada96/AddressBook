package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        CreateContact contact1 = new CreateContact();
        //contact1.createNew();
        //contact1.display();
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Enter\n1.To add new contact\n2.To edit existing contact\n3.End");
            int i = sc.nextInt();
            switch (i) {
                case 1 :
                    contact1.createNew();
                    contact1.display();
                    break;
                case 2 :
                    contact1.editContact();
                    break;
                case 3 :
                    System.out.println("Thank You !");
                    isContinue = false;
                    break;
                default:
                    System.out.println("Enter eiter 1,2 or 3 only");
                    break;
            }
            if (isContinue == true) {
                System.out.println("Do you want to continue ?\n1.Yes 2.No");
                int c = sc.nextInt();
                if (c == 2) {
                    isContinue = false;
                    System.out.println("Thank You!");
                }
            }
        }
    }
}
