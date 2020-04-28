package by.htp.homework.seventh.task04;

import by.htp.homework.seventh.task04.Train;

public class Logic {
	
	public void sortByNumber(Train[] timetable) {
		
		int previous, current;
		
		for(int i = 1; i < timetable.length; i++) {
			
			current = timetable[i].getNumber();
			previous = timetable[i-1].getNumber();
			
			if (current < previous) {
				for (int j = i; j > 0; j--) {
					if (timetable[j].getNumber() < timetable[j-1].getNumber()) {
						
						Train temp;
						temp = timetable[j];
						timetable[j] = timetable[j-1];
						timetable[j-1] = temp;	
					}
				}
			}	
		}
	}
	
	public Train findInfo(Train[] timetable, int num) {
	
		Train searchedTrain = new Train();
		
		for (int i = 0; i < timetable.length; i++) {
			
			int trainNum;
			trainNum = timetable[i].getNumber();
			
			if (trainNum == num) {
								
				searchedTrain = timetable[i];
				break;
			}
		}
		
		return searchedTrain;
	}
	
	public void sortAlphabetically(Train[] timetable) {
		
		sortByLetters(timetable);
		sortSameByTime(timetable);
	}
	
	public void sortByLetters(Train[] timetable) {
		
		for (int i = 0; i < timetable.length - 1; i++) {
			for (int j = i + 1; j < timetable.length; j++) {
				
				if (timetable[i].getDestination().compareTo(timetable[j].getDestination()) > 0) {
					
					Train temp;
					
					temp = timetable[i];
					timetable[i] = timetable[j];
					timetable[j] = temp;
				}
			}
		}	
	}
	
	public void sortByTime(Train[] timetable, int start, int finish) {
		
		for (int i = start; i < finish; i++) {
			
			for (int j = i + 1; j > i; j--) {
				if (timetable[i].getTime().compareTo(timetable[j].getTime()) > 0) {
				
					Train temp;
				
					temp = timetable[i];
					timetable[i] = timetable[j];
					timetable[j] = temp;
				}
			}
		}
	}
	
	public void sortSameByTime(Train[] timetable) {
		
		int j;
		for (int i = 0; i < timetable.length - 1; i++) {
			
			j = i + 1;
			
			while((j < timetable.length) && (timetable[i].getDestination().equals(timetable[j].getDestination()))) {
				j++;
			}
			
			if (j - i > 1) {
				
				int start, finish;
				
				start = i;
				finish = j - 1;
				
				sortByTime(timetable, start, finish);
				
				i = finish;
			}	
		}	
	}
}
