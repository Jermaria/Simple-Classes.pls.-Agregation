package by.htp.homework.seventh.task07;

public class Main {
	
	public static void main(String[] args) {
	Triangle abc = new Triangle(new double[] {0,0}, new double[] {0,7}, new double[] {4,0});
	
	double p, s;
	
	p = abc.calculatePerimeter();
	s = abc.CalculateSquare();
	
	System.out.println("P = " + p);
	System.out.println("S = " + s);
	
	double[] med = new double[2];
	
	med = abc.findIntersection();
	
	System.out.println("coordinates of intersection: (" + med[0] + ";" + med[1] + ")");
	
	}
}
