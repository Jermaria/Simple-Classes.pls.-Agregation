package by.htp.homework.seventh.task08;


import java.util.ArrayList;

import by.htp.homework.seventh.task08.Customer;

public class ClientBase {
	
	private ArrayList <Customer> base = new ArrayList <Customer>(2);
	
	
	
	public ClientBase() {};

	public ClientBase(ArrayList<Customer> base) {
		this.base = base;
	}
	
	public ArrayList<Customer> getBase() {
		return base;
	}

	public void setBase(ArrayList<Customer> base) {
		this.base = base;
	}

	public void addCustomer(Customer client) {
		
		base.add(client);
	}
	
	public void sortAlphabetically() {
		
		sortBySurname();
		sortByName();
		sortByPatronimic();
	}
	
	public void sortBySurname() {
		
		for (int i = 0; i < base.size() - 1; i++) {
			for (int j = i + 1; j < base.size(); j++) {
				
				if(base.get(i).getSurname().compareTo(base.get(j).getSurname()) > 0) {
					
					Customer temp;
					
					temp = base.get(i);
					base.set(i, base.get(j));
					base.set(j, temp);
				}
			}
		}
	}
	
	public void sortByName() {
		
		for (int i = 0; i < base.size() - 1; i++) {
			
			if (base.get(i).getSurname().equals(base.get(i+1).getSurname())) {
				
				int start;
				start = i;
				
				int j;
				j = i + 1;
				
				while ((j < base.size()) && (base.get(i).getSurname().equals(base.get(j).getSurname()))) {
					j++;
				}
				
				if ( j - 1 > i) {
					
					int finish;
					finish = j - 1;
					
					sortNamesWithin(start, finish);
				}	
			}
		}
	}
	
	public void sortByPatronimic() {
		
		for (int i = 0; i < base.size() - 1; i++) {
			
			if ((base.get(i).getSurname().equals(base.get(i+1).getSurname())) && (base.get(i).getName().equals(base.get(i+1).getName()))) {
				
				int start;
				start = i;
				
				int j;
				j = i + 1;
				
				while ((j < base.size()) && (base.get(i).getSurname().equals(base.get(j).getSurname()))
							&& (base.get(i).getName().equals(base.get(i+1).getName()))) {
					j++;
				}
				
				if ( j - 1 > i) {
					
					int finish;
					finish = j - 1;
					
					sortPatronimicWithin(start, finish);
				}	
			}
		}
	}
	
	public void sortNamesWithin(int start, int finish) {
		
		for (int i = start; i < finish; i++) {
			
			for (int j = i + 1; j > i; j--) {
				
				if (base.get(i).getName().compareTo(base.get(j).getName()) > 0) {
				
				Customer temp;
				
				temp = base.get(i);
				base.set(i, base.get(j));
				base.set(j, temp);
				}
			}		
		}
	}
	
	public void sortPatronimicWithin(int start, int finish) {
		
		for (int i = start; i < finish; i++) {
			
			for (int j = i + 1; j > i; j--) {
				
				if (base.get(i).getPatronimic().compareTo(base.get(j).getPatronimic()) > 0) {
				
				Customer temp;
				
				temp = base.get(i);
				base.set(i, base.get(j));
				base.set(j, temp);
				}
			}		
		}
	}
	
	public ArrayList <Customer> findCardsLocatedWithin(String start, String finish) {
		
		ArrayList<Customer> found = new ArrayList <Customer>(1);
		
		for (int i = 0; i < base.size(); i++) {
			
			if (base.get(i).getCreditCardNum().compareTo(start) >= 0 && base.get(i).getCreditCardNum().compareTo(finish) <= 0) {
				found.add(base.get(i));
			}
		}
		
		return found;
	}
	
}
