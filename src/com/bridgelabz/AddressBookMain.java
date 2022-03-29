package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    String firstName, lastName, address, city, state, zip, phoneNo, email;
    public void createContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        firstName = sc.nextLine();
        System.out.println("Enter last name");
        lastName = sc.nextLine();
        System.out.println("Enter address");
        address = sc.nextLine();
        System.out.println("Enter city");
        city = sc.next();
        System.out.println("Enter state");
        state = sc.next();
        System.out.println("Enter zip code");
        zip = sc.next();
        System.out.println("Enter phone number");
        phoneNo = sc.next();
        System.out.println("Enter email");
        email = sc.next();
    }
    public void display() {
        System.out.print("Name : "+firstName+" "+lastName+"\nAddress : "+address+"\nCity : "+city+
                "\nState : "+state+"\nZip code : "+zip+"\nPhone no : "+phoneNo+"\nEmail : "+email);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookMain contact1 = new AddressBookMain();
        contact1.createContact();
        contact1.display();
    }
}
