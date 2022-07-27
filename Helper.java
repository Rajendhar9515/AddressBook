package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;

public class Helper {
	List<Person> list = new ArrayList<Person>();

	// ADD METHOD
	public void addRecord() {
		final String firstName, lastName, address, city, state, phoneNumber, zip, email;

		System.out.println("Enter the First Name:- ");
		firstName = InputUtil.getStringValue();
		System.out.println("Enter the Last Name:- ");
		lastName = InputUtil.getStringValue();
		System.out.println("Enter the Address:- ");
		address = InputUtil.getStringValue();
		System.out.println("Enter the Name of City :- ");
		city = InputUtil.getStringValue();
		System.out.println("Enter the Name of state:- ");
		state = InputUtil.getStringValue();
		System.out.println("Enter the Pin Code:- ");
		zip = InputUtil.getStringValue();
		System.out.println("Enter the Phone Number:- ");
		phoneNumber = InputUtil.getStringValue();
		System.out.println("Enter the Email:- ");
		email = InputUtil.getStringValue();
		Person contact = new Person(firstName, lastName, address, city, state, zip, phoneNumber, email);
		list.add(contact);
	}

   // DISPLAY METHOD
	public void displayRecord() {
		for (Person p1 : list) {
			System.out.println(p1);
		}

	}
}