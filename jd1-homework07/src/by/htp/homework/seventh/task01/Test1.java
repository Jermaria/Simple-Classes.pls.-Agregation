package by.htp.homework.seventh.task01;

// 1. Создайте класс Test1 двумя переменными. 

// Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, 
// и метод, который находит наибольшее значение	из этих двух переменных.

public class Test1 {

	private int a;
	private int b;

	public void changeAB(int newA, int newB) {
		a = newA;
		b = newB;
	}

	public void setA(int _a) {
		a = _a;
	}

	public void setB(int _b) {
		b = _b;
	}

	public void print() {
		System.out.println("a = " + a + ", b = " + b);
	}

	public int getSum() { //
		int sum;
		sum = a + b;
		return sum;
	}

	public int getMax() {
		int max;
		max = Math.max(a, b);
		return max;
	}
}
