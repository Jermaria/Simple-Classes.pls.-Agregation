package by.htp.homework.seventh.task04;

import java.util.Scanner;

import by.htp.homework.seventh.task04.Logic;
import by.htp.homework.seventh.task04.Train;
import by.htp.homework.seventh.task04.View;

public class Main {

	public static void main(String[] args) {

Train[] schedule = new Train[5];
		
		schedule[0] = new Train("Rome", 23, "10:20");
		schedule[1] = new Train("Berlin", 13, "09:10");
		schedule[2] = new Train("Rome", 2, "08:20");
		schedule[3] = new Train("Rome", 3, "02:20");
		schedule[4] = new Train("Berli", 24, "01:22");
		
		Logic logic = new Logic();
		View view = new View();
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the train number");
		int num = scan.nextInt();
		
		Train searched = logic.findInfo(schedule, num);
		view.printInfo(searched);
		
		System.out.println();
		
		view.printSchedule(schedule);
		
		System.out.println();
		
		logic.sortAlphabetically(schedule);
		view.printSchedule(schedule);

	}

}