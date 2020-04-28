package by.htp.homework.seventh.task05;

import by.htp.homework.seventh.task05.Counter;

public class Main {

	public static void main(String[] args) {
		
		Counter c = new Counter(1, 0, 10);
		
		c.decreaseCounter();
		
		System.out.println(c.getCounter());
		
		c.increaseCounter();
		
		System.out.println(c.getCounter());
	}

}
