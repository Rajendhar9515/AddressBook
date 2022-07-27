package com.bridgelabz.addressbook;

public class AddressBook {
	public static void main(String[] args) {
		String firstName, lastName, address, city, state, zip, phone, email;
		System.out.println("Welcome To Address Book");
		System.out.println("Enter First Name");
		firstName = InputUtil.getStringValue();
		System.out.println("Enter Last Name");
		lastName = InputUtil.getStringValue();
		System.out.println("Enter Address");
		address = InputUtil.getStringValue();
		System.out.println("Enter City");
		city = InputUtil.getStringValue();
		System.out.println("Enter State");
		state = InputUtil.getStringValue();
		System.out.println("Enter Zip");
		zip = InputUtil.getStringValue();
		System.out.println("Enter phone number");
		phone = InputUtil.getStringValue();
		System.out.println("Enter the Email:- ");
		email = InputUtil.getStringValue();
	}
}