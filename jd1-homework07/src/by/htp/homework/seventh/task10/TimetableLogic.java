package by.htp.homework.seventh.task10;

public class TimetableLogic {
	
	public Timetable findOptionsByDestination(Timetable airport, String destination) {
		
		Timetable found = new Timetable();
		
		for (int i = 0; i < airport.base.size(); i++) {
			
			if (airport.base.get(i).getDestination().equals(destination)) {
				found.base.add(airport.base.get(i));
			}
		}
		
		return found;
	}
	
	
	
	public Timetable findOptionsByDay(Timetable airport, String day) {
		
	    Timetable found = new Timetable();

		for (int i = 0; i < airport.base.size(); i++) {
			for (int j = 0; j < airport.base.get(i).getDay().size(); j++) {
				
				if (airport.base.get(i).getDay().get(j).equals(day)) {
				    found.base.add(airport.base.get(i));
				}
			}
		}
		
		return found;
	}
	
	
	
	public Timetable findOptionsByDayAndTime(Timetable airport, String day, String time) {
		
	    Timetable found = new Timetable();
	    
	    found = findOptionsByDay(airport, day);
		
		for (int i = 0; i < found.base.size(); i++) {
			if (found.base.get(i).getDepartureTime().compareTo(time) < 0) {
				found.base.remove(i);
			}
		}
		
		return found;
	}
}
