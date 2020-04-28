package by.htp.homework.seventh.task10;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Timetable airportSchedule = new Timetable();
		
		airportSchedule.base.add(new Airline ("Paris", "FR218", "Concorde", "12:10", new LinkedList<String>(Arrays.asList("Monday", "Friday"))));
		airportSchedule.base.add(new Airline ("Moscow", "TU218", "TU-154", "15:10", new LinkedList<String>(Arrays.asList("Monday", "Sunday"))));
		airportSchedule.base.add(new Airline ("Paris", "FR210", "Boeing-747", "02:10", new LinkedList<String>(Arrays.asList("Tuesday", "Friday"))));
		airportSchedule.base.add(new Airline ("Paris", "FR318", "Aerobus-A320", "17:10", new LinkedList<String>(Arrays.asList("Monday", "Friday"))));
		airportSchedule.base.add(new Airline ("Paris", "SU267", "Bombardier global-6000", "08:10", new LinkedList<String>(Arrays.asList("Wednesday", "Friday"))));
		airportSchedule.base.add(new Airline ("Paris", "SU218", "Embraer-195", "18:10", new LinkedList<String>(Arrays.asList("Monday", "Friday"))));
		
		TimetableLogic logic = new TimetableLogic();
		Printer print = new Printer();
		
		print.printSchedule(logic.findOptionsByDay(airportSchedule, "Monday"));
		System.out.println();
		
		print.printSchedule(logic.findOptionsByDayAndTime(airportSchedule, "Monday", "15:00"));
		System.out.println();
		
	}

}
