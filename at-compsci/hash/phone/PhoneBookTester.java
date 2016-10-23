package phone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import numbers.HashTable;

public class PhoneBookTester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PhoneBook phoneBook=new PhoneBook(10);
	phoneBook.load();
		
	System.out.println(phoneBook.lookup("Park"));
	
	phoneBook.changeNumber("Park", "1234");
	
	System.out.println(phoneBook.lookup("Park"));
	System.out.println("");
	phoneBook.display();
	System.out.println("");
	System.out.println("size " + phoneBook.getSize());
	}
	}

