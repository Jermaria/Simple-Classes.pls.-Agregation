package by.htp.homework.seventh.task02;

public class Test2Main {

	public static void main(String[] args) {
		
		Test2 t1 = new Test2();
		print(t1);
		
		Test2 t2 = new Test2(3, 5);
		print(t2);
		
		t1.setX(1);
		t1.setY(1);
		print(t1);
	}
	
	public static void print(Test2 t) {
		System.out.println(t.getX() + " " + t.getY());
	}

}
