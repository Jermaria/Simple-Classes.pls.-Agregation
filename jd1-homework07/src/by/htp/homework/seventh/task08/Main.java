package by.htp.homework.seventh.task08;

import by.htp.homework.seventh.task08.Shop;
import by.htp.homework.seventh.task08.Customer;
import by.htp.homework.seventh.task08.View;

public class Main {

	public static void main(String[] args) {
		
		Shop mila = new Shop();
		View view = new View();
		ShopLogic logic = new ShopLogic();
		
		logic.addCustomer(mila, new Customer(1001, "Petrov", "Petr", "Petrovich", "7 Kosmonavtov Str", "1234 5678 8765 4321", 10011234));
		logic.addCustomer(mila, new Customer(1002, "Petrova", "Olga", "Petrovna", "7 Kosmonavtov Str", "1233 5678 8765 4321", 10021233));
		logic.addCustomer(mila, new Customer(1003, "Ivanov", "Petr", "Petrovich", "9 Lenina Str", "2234 5678 8765 4321", 10032234));
		logic.addCustomer(mila, new Customer(1004, "Ivanova", "Anna", "Olegovna", "10 Lenina Str", "2234 2678 8765 4321", 10042234));
		
		logic.sortAlphabetically(mila);
		view.printBase(mila);
	}

}
