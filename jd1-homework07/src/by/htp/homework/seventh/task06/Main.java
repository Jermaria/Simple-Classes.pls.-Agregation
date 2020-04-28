package by.htp.homework.seventh.task06;

import by.htp.homework.seventh.task06.Clock;

public class Main {

	public static void main(String[] args) {
		
		Clock c = new Clock(7 , 10, 1);
		
		c.printTime();
		System.out.println();
		
		c.changeTime(2, 10, 1);
		
		c.printTime();

	}

}
