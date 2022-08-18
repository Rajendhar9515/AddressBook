package com.bridgelabz.addressbook;

import java.util.Comparator;

public class Person {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;


	public Person(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLirstName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	 public static Comparator<Person> firstNameSorting = new Comparator<Person>() {
	        public int compare(Person p1, Person p2)
	        {
	            String fname1 = p1.getFirstName();
	            String fname2 = p2.getFirstName();
	            // ascending order
	            return fname1.compareTo(fname2);
	        }
	    };
	    // Sort By City
	    public static Comparator<Person> citySorting = new Comparator<Person>() {
	        @Override
	        public int compare(Person p1, Person p2)
	        {
	            String city1 = p1.getCity();
	            String city2 = p2.getCity();
	            // ascending order
	            return city1.compareToIgnoreCase(city2);
	        }
	    };
	    // Sort By State
	    public static Comparator<Person> stateSorting = new Comparator<Person>() {
	        @Override
	        public int compare(Person p1, Person p2)
	        {
	            String state1 = p1.getState();
	            String state2 = p2.getState();
	            // ascending order
	            return state1.compareToIgnoreCase(state2);
	        }
	    };
	    // Sort By Zip
	    public static Comparator<Person> zipSorting = new Comparator<Person>() {
	        @Override
	        public int compare(Person p1, Person p2)
	        {
	            String zip1 = p1.getZip();
	            String zip2 = p2.getZip();
	            // ascending order
	            return zip1.compareToIgnoreCase(zip2);
	        }
	    };


	public String toString() {
		return "Contact{" + "FirstName = " + firstName + "; , Lastname = " + lastName + "; , Addrss = " + address
				+ "; , City = " + city + "; , State =" + state + "; , zip=" + zip + "; , PhoneNumber=" + phoneNumber
				+ "; , Email=" + email + '}';

	}

}
