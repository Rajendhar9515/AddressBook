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
	public void editRecord() throws AddressBookException {
		int id, choice = 0, i = 0;
		String firstName, lastName, address, city, state, zip, phoneNumber, email;
		for (Person p1 : list) {
			System.out.println("ID: #" + list.indexOf(p1) + " : " + p1);
		}
		System.out.println("\nEnter #ID to Edit Contact : ");
		id = InputUtil.getIntValue();
		System.out.println(list.get(id));
		while (i == 0) {
			System.out.println("What You Want To Edit...\n" 
					+ "\t1: firstName\n" 
					+ "\t2: lastName\n" 
					+ "\t3: address\n"
					+ "\t4: city\n" 
					+ "\t5: state\n" 
					+ "\t6: zip\n" 
					+ "\t7: phoneNumber\n" 
					+ "\t8: email\n"
					+ "\t9: Save And Exit\n");
			choice = InputUtil.getIntValue();
			switch (choice) {
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
				i = 1;
				break;
			default:
				System.out.println("Please Enter Valid Option");

			}
			System.out.println(list.get(id));
		}
	}

	public void deleteRecord() throws AddressBookException {
		int id;
		for (Person p1 : list) {
			System.out.println("ID: #" + list.indexOf(p1) + " : " + p1);

		}
		System.out.println("\nEnter #ID to delete contact : ");
		id = InputUtil.getIntValue();
		list.remove(id);
	}

	public void sortRecords() {
		System.out.println("Sort By...\n" 
		+ "1: First Name\n" 
		+ "2: City\n" 
		+ "3: State\n" 
		+ "4: Zip Code\n" 
		+ "5: Back");
		int choice = InputUtil.getIntValue();
		switch (choice) {
		case 1:
			Sort.sortByName(list);
			break;
		case 2:
			Sort.sortByZip(list);
			break;
		case 3:
			Sort.sortByState(list);
			break;
		case 4:
			Sort.sortByZip(list);
			break;
		case 5:
			return;
		default:
			System.out.println("Please Enter Valid Option...");
		}
	}

	public boolean checkExists(String firstName) {
		int flag = list.stream().anyMatch(p -> p.getFirstName().equalsIgnoreCase(firstName)) ? 1 : 0;
		return flag == 1;
	}

	public void searchInRecords() {
		int i = 0;
		while (i == 0) {
			System.out.println("1. Search By City\n" + "2. Search By State\n" + "3. Back\n" + "Choose Your Option");
			int choice = InputUtil.getIntValue();
			switch (choice) {
			case 1:
				SearchSortService.searchByCity(list);
				break;
			case 2:
				SearchSortService.searchByState(list);
				break;
			case 3:
				i = 1;
				break;
			default:
				System.out.println("Please Enter Correct Option...");
			}
		}
	}
}
