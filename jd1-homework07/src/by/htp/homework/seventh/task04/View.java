package by.htp.homework.seventh.task04;

import by.htp.homework.seventh.task04.Train;

public class View {

	public void printSchedule(Train[] timetable) {
		
		for (int i = 0; i < timetable.length; i++) {
			
			String destination = timetable[i].getDestination();
			int trainNum = timetable[i].getNumber();
			String time = timetable[i].getTime();
			
			System.out.printf("%-10s № %-4d %-5s", destination, trainNum, time);
			System.out.println();
		}
	}
	
	public void printInfo(Train train) {

		System.out.println(train.getDestination() + " №" + train.getNumber() + " " + train.getTime());
	}

}
