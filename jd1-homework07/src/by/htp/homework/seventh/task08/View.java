package by.htp.homework.seventh.task08;

import by.htp.homework.seventh.task08.Customer;

public class View {
	
	public void printBase(Shop mila) {
		
		for (Customer client : mila.getBase()) {
			printCustomer(client);
		}
		
		System.out.println();
	}
	
	public void printCustomer(Customer client) {
	    
	    System.out.println("ID: " + client.getId() + " " + client.getName() + " " + client.getSurname() + " " + client.getPatronimic()
	                                + " address: " + client.getAddress() + " card: " + client.getCreditCardNum() 
	                                + " account: " + client.getAccountNum());
	}

}
