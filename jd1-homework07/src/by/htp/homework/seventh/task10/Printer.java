package by.htp.homework.seventh.task10;

public class Printer {
    
    public void printAirline(Airline airline) {
        
        System.out.println("Flight No " + airline.getFlight() + " flying to " + airline.getDestination() 
                               + " departs at " + airline.getDepartureTime() + " on " + airline.getDay()
                               + " served by " + airline.getPlane());
    }
	
	public void printSchedule(Timetable schedule) {
		
		for (Airline line : schedule.base) {
		    printAirline(line);
		}
	}

}
