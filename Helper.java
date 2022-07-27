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
   // EDIT METHOD
	public void editRecord() {
		int id,choice = 0, i=0;
		String firstName, lastName, address, city, state, zip, phoneNumber, email;
		for(Person p1: list) {
			System.out.println("ID: #"+list.indexOf(p1)+" : "+p1);
		}
		System.out.println("\nEnter #ID to Edit Contact : ");
		id = InputUtil.getIntValue();
		System.out.println(list.get(id));
		while(i==0) {
			System.out.println("What You Want To Edit...\n"
					+"\t1: firstName\n"
					+"\t2: lastName\n"
					+"\t3: address\n"
					+"\t4: city\n"
					+"\t5: state\n"
					+"\t6: zip\n"
					+"\t7: phoneNumber\n"
					+"\t8: email\n"
					+"\t9: Save And Exit\n");
			choice = InputUtil.getIntValue();
			switch(choice) {
				case 1:
					System.out.println("Enter firstName : ");
					firstName = InputUtil.getStringValue();
					list.get(id).setFirstName(firstName);
					break;
				case 2:
					System.out.println("Enter lastName : ");
					lastName = InputUtil.getStringValue();
					list.get(id).setLastName(lastName);
					break;
				case 3:
					System.out.println("Enter address : ");
					address = InputUtil.getStringValue();
					list.get(id).setAddress(address);
					break;
				case 4:
					System.out.println("Enter city : ");
					city = InputUtil.getStringValue();
					list.get(id).setCity(city);
					break;
				case 5:
					System.out.println("Enter state : ");
					state = InputUtil.getStringValue();
					list.get(id).setState(state);
					break;
				case 6:
					System.out.println("Enter pin : ");
					zip = InputUtil.getStringValue();
					list.get(id).setZip(zip);
					break;
				case 7:
					System.out.println("Enter phoneNumber : ");
					phoneNumber = InputUtil.getStringValue();
					list.get(id).setPhoneNumber(phoneNumber);
					break;
				case 8:
					System.out.println("Enter email : ");
					email = InputUtil.getStringValue();
					list.get(id).setEmail(email);
					break;
				case 9:
					i=1;
					break;
					default:
						System.out.println("Please Enter Valid Option");
					
			}
			System.out.println(list.get(id));
		}
	}
	// DELETE METHOD
	public void deleteRecord()
	{
		int id;
		for(Person p1: list) {
			System.out.println("ID: #"+list.indexOf(p1)+" : "+p1);
			
		}
		System.out.println("\nEnter #ID to delete contact : ");
		id = InputUtil.getIntValue();
		list.remove(id);
	}
	public boolean checkExists(String firstName) {
		int flag = 0;
		for (Person p1 : list) {
			if (p1.getFirstName().equals(firstName)) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			return true;
		}
		return false;
	}
}