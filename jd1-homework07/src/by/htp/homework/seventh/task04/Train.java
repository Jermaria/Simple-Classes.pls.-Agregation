package by.htp.homework.seventh.task04;

// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
// данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
// поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте
// возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
// быть упорядочены по времени отправления.

import java.io.Serializable;

public class Train implements Serializable{
	
	private String destination;
	private int number;
	private String time;
	
	public Train() {}
	
	public Train(String dest, int num, String time) {
		
		this.destination = dest;
		this.number = num;
		this.time = time;
	}
	
	public void setDestination(String dest) {
		this.destination = dest;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setNumber(int num) {
		this.number = num;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getTime() {
		return time;
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + number;
        result = prime * result + ((time == null) ? 0 : time.hashCode());
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
        Train other = (Train) obj;
        if (destination == null) {
            if (other.destination != null)
                return false;
        } else if (!destination.equals(other.destination))
            return false;
        if (number != other.number)
            return false;
        if (time == null) {
            if (other.time != null)
                return false;
        } else if (!time.equals(other.time))
            return false;
        return true;
    }
	
	

}
