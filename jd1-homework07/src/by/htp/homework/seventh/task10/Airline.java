package by.htp.homework.seventh.task10;

import java.io.Serializable;
import java.util.LinkedList;

// Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
// метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
// методами. Задать критерии выбора данных и вывести эти данные на консоль.
// Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
// Найти и вывести:
// a) список рейсов для заданного пункта назначения;
// b) список рейсов для заданного дня недели;
// c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

public class Airline implements Serializable {
	
	private String destination;
	private String flight;
	private String plane;
	private String departureTime;
	private LinkedList<String> day;
	
	public Airline() {}

	public Airline(String destination, String flight, String plane, String departureTime, LinkedList<String> day) {
		super();
		this.destination = destination;
		this.flight = flight;
		this.plane = plane;
		this.departureTime = departureTime;
		this.day = day;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public String getPlane() {
		return plane;
	}

	public void setPlane(String plane) {
		this.plane = plane;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public LinkedList<String> getDay() {
		return day;
	}

	public void setDay(LinkedList<String> day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + "[destination = " + destination + ",    flight = " + flight + ",    plane = " + plane + ",    departureTime = "
				+ departureTime + ",    day = " + day + "]";
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((day == null) ? 0 : day.hashCode());
        result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + ((flight == null) ? 0 : flight.hashCode());
        result = prime * result + ((plane == null) ? 0 : plane.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Airline other = (Airline) obj;
        if (day == null) {
            if (other.day != null)
                return false;
        } else if (!day.equals(other.day))
            return false;
        if (departureTime == null) {
            if (other.departureTime != null)
                return false;
        } else if (!departureTime.equals(other.departureTime))
            return false;
        if (destination == null) {
            if (other.destination != null)
                return false;
        } else if (!destination.equals(other.destination))
            return false;
        if (flight == null) {
            if (other.flight != null)
                return false;
        } else if (!flight.equals(other.flight))
            return false;
        if (plane == null) {
            if (other.plane != null)
                return false;
        } else if (!plane.equals(other.plane))
            return false;
        return true;
    }

}
