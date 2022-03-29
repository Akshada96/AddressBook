package com.bridgelabz;

import java.util.Scanner;

public class CreateContact {
    ContactPerson person1 = new ContactPerson(null, null, null, null, null, null, null, null);
    public void createNew(){
        String firstName, lastName, address, city, state, zip, phoneNo, email;
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
        person1 = new ContactPerson(firstName,lastName,address,city,state,zip,phoneNo,email);
    }
    public void display() {
        System.out.print("Contact details are\nName : "+person1.getFirstName()+" "+person1.getLastName()+
                "\nAddress : "+person1.getAddress()+"\nCity : "+person1.getCity()+
                "\nState : "+person1.getState()+"\nZip code : "+person1.getZip()+
                "\nPhone no : "+person1.getPhoneNo()+"\nEmail : "+person1.getEmail()+"\n");
    }
}
