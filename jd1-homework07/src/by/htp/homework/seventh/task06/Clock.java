package by.htp.homework.seventh.task06;

import java.io.Serializable;

// Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
// изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
// недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное
// количество часов, минут и секунд

public class Clock implements Serializable {

	private int hours;
	private int minutes;
	private int seconds;
	
	public Clock() {}
	
	public Clock(int hours, int minutes, int seconds) {
		validateHours(hours);
		validateMinutes(minutes);
		validateSeconds(seconds);
	}
	
	public void setHours(int hours) {
		validateHours(hours);
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setMinutes(int minutes) {
		validateMinutes(minutes);
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setSeconds(int seconds) {
		validateMinutes(minutes);
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hours;
        result = prime * result + minutes;
        result = prime * result + seconds;
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
        Clock other = (Clock) obj;
        if (hours != other.hours)
            return false;
        if (minutes != other.minutes)
            return false;
        if (seconds != other.seconds)
            return false;
        return true;
    }

    public void validateHours(int hours) {
		
		if ((hours >= 0) && (hours <= 23)) {
			this.hours = hours;
		}
	}
	
	public void validateMinutes(int min) {
		
		if ((min >= 0) && (min <= 59)) {
			this.minutes = min;
		}
	}
	
	public void validateSeconds(int sec) {
		
		if ((sec >= 0) && (sec <= 59)) {
			this.seconds = sec;
		}
	}
	
	public void changeTime(int hours, int minutes, int seconds) {
		
		int sumSec1, sumSec2;
		
		sumSec1 = convertToSeconds();
		sumSec2 = hours * 3600 + minutes * 60 + seconds;
		
		int total;
		
		total = sumSec1 + sumSec2;
		
		convertFromSeconds(total);
		
	}
	
	public int convertToSeconds() {
		int totalSeconds;
		
		totalSeconds = this.hours * 3600 + this.minutes * 60 + this.seconds;
		
		return totalSeconds;
	}
	
	public void convertFromSeconds(int sec) {
		
		this.hours = sec / 3600;
		this.minutes = sec % 3600 / 60;
		this.seconds = sec % 60;

	}
	
	public void printTime() {
		
		printWise(hours);
		System.out.print(":");
		printWise(minutes);
		System.out.print(":");
		printWise(seconds);	
	}
	
	public static void printWise(int x) {
		if (x < 10) {
			System.out.print("0");
		}
		System.out.print(x);
	}
}
