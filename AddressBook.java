package com.bridgelabz.addressbook;

import java.util.Hashtable;

public class AddressBook {
    public static void main(String[] args) throws AddressBookException {
        int choice,i=0;
        Hashtable<String,String> my_dict =new  Hashtable<String,String>();
        final AddressBooKService help = new AddressBooKService();
        while(i==0)
        {
            System.out.println("--- Address Book Management ---\n");
            System.out.println("\t--MENU--");
            System.out.println("1: Add New Person      ");
            System.out.println("2: Display Records     ");
            System.out.println("3: Edit Contact		   ");
            System.out.println("4: Delete Contact	   ");
            System.out.println("5: Sort	   ");
            System.out.println("6: Search	   ");
            System.out.println("7: Exit		       \n");
            System.out.println("--- Enter Your Choice ---");
            choice = InputUtil.getIntValue();
            switch(choice)
            {
                case 1 :
                    help.addRecord();
                    break;
                case 2 :
                    help.displayRecord();
                    break;
                case 3 :
    				help.editRecord();
    				break;
                case 4:
    				help.deleteRecord();
    				break;
                case 5 :
                    help.sortRecords();
                    break;
                case 6:
                    help.searchInRecords();
                    break;
                case 7 :
                    i=1;
                    break;
                default :
                    System.out.println("Please Enter Valid Option!!!");
            }
        }
    }
}
