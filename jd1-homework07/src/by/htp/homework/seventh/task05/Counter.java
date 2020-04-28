package by.htp.homework.seventh.task05;

import java.io.Serializable;

// 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на
// единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
// произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
// позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса

public class Counter implements Serializable {


	private int value;
	private int min;
	private int max;
	
	public Counter() {}
	
	public Counter(int value, int min, int max) {
		
		this.value = value;
		this.min = min;
		this.max = max;
	}
	
	public void setCounter(int value) {
		this.value = value;
	}
	
	public int getCounter() {
		return value;
	}
	
	public void setMin(int min) {
		this.min = min;
	}
	
	public int getMin() {
		return min;
	}
	
	public void setMax(int max) {
		this.max = max;
	}
	
	public int getMax() {
		return max;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + max;
        result = prime * result + min;
        result = prime * result + value;
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
        Counter other = (Counter) obj;
        if (max != other.max)
            return false;
        if (min != other.min)
            return false;
        if (value != other.value)
            return false;
        return true;
    }

    public void increaseCounter() {
		if (value + 1 > max) {
			value = 0;
		} else {
			value++;
		}
	}
	
	public void decreaseCounter() {
		if (value - 1 < min) {
			value = 0;
		} else {
			value--;
		}
	}
}
