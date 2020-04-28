package by.htp.homework.seventh.task02;

// 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
// Добавьте конструктор, инициализирующий члены класса по умолчанию. 
// Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {
	private int x;
	private int y;
	
	public Test2() {
		x = 1;
		y = 1;
	}
	
	public Test2(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
	
	public void setX(int newX) {
		this.x = newX;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int newY) {
		this.y = newY;
	}
	
	public int getY() {
		return y;
	}
}
