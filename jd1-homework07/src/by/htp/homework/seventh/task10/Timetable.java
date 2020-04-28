package by.htp.homework.seventh.task10;

import java.io.Serializable;
import java.util.ArrayList;

public class Timetable implements Serializable {
	
	ArrayList <Airline> base = new ArrayList <Airline>();
	
	public Timetable() {}

	public Timetable(ArrayList<Airline> base) {
		this.base = base;
	}

	public ArrayList<Airline> getBase() {
		return base;
	}

	public void setBase(ArrayList<Airline> base) {
		this.base = base;
	}
	
}
