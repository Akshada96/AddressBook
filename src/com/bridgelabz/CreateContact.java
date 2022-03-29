package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateContact {
    ContactPerson person1 = new ContactPerson(null, null, null, null, null, null, null, null);
    Scanner sc = new Scanner(System.in);
    ArrayList<ContactPerson> list = new ArrayList<>();
    public void createNew(){
        String firstName, lastName, address, city, state, zip, phoneNo, email;
        System.out.println("Enter first name");
        firstName = sc.next();
        System.out.println("Enter last name");
        lastName = sc.next();
        System.out.println("Enter address");
        address = sc.next();
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
        list.add(person1);
    }
    public void editContact(){
        System.out.println("Enter first name ");
        String name = sc.next();
        int isMatch = 0;
        System.out.println(list.size());
        for (int i = 1; i <= list.size(); i++) {
            String fname = list.get(i).getFirstName();
            if (fname.equals(name)){
                isMatch = 1;
                createNew();
                display();
            }
        }
        if (isMatch == 0) {
            System.out.println("Entered name does not exist");
        }
    }
    public void display() {
        System.out.print("Contact details are\nName : "+person1.getFirstName()+" "+person1.getLastName()+
                "\nAddress : "+person1.getAddress()+"\nCity : "+person1.getCity()+
                "\nState : "+person1.getState()+"\nZip code : "+person1.getZip()+
                "\nPhone no : "+person1.getPhoneNo()+"\nEmail : "+person1.getEmail()+"\n");
    }
}
