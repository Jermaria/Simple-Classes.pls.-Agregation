package by.htp.homework.seventh.task07;

import java.io.Serializable;
import java.util.Arrays;

//Описать класс, представляющий треугольник. 
//Предусмотреть методы для создания объектов, 
//вычисления площади, периметра и точки пересечения медиан.

public class Triangle implements Serializable {
	
	private double[] a = new double[2];
	private double[] b = new double[2];
	private double[] c = new double[2];
	
	public Triangle() {}
	
	public Triangle(double[] a, double[] b, double[] c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setA(double[] a) {
		this.a = a;
	}
	
	public void setB(double[] b) {
		this.b = b;
	}
	
	public void setC(double[] c) {
		this.c = c;
	}
	
	public double[] getA() {
		return a;
	}
	
	public double[] getB() {
		return b;
	}
	
	public double[] getC() {
		return c;
	}
	
	
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(a);
        result = prime * result + Arrays.hashCode(b);
        result = prime * result + Arrays.hashCode(c);
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
        Triangle other = (Triangle) obj;
        if (!Arrays.equals(a, other.a))
            return false;
        if (!Arrays.equals(b, other.b))
            return false;
        if (!Arrays.equals(c, other.c))
            return false;
        return true;
    }

    public double calculatePerimeter() {
		
		double side1, side2, side3;
		double perimeter;
		
		side1 = calculateSide(a, b);
		side2 = calculateSide(b, c);
		side3 = calculateSide(a, c);
		
		perimeter = side1 + side2 + side3;
		
		return perimeter;
	}
	
	public double CalculateSquare() {
		double halfP;
		double s;
		
		halfP = calculatePerimeter() / 2;
		
		double side1, side2, side3;
		
		side1 = calculateSide(a, b);
		side2 = calculateSide(b, c);
		side3 = calculateSide(a, c);
		
		double temp;
		
		temp = halfP * (halfP - side1) * (halfP - side2) * (halfP - side3);
		s = Math.sqrt(temp);
		
		return s;
	}
	
	public double calculateSide(double[] a, double[] b) {
		double side;
		
		double temp;
		temp = Math.pow((a[0] - b[0]), 2) + Math.pow((a[1] - b[1]), 2);
		side = Math.sqrt(temp);
		
		return side;
	}
	
	public double[] findIntersection() {
		double[] intersection = new double[2];
		
		intersection[0] = (a[0] + b[0] + c[0]) / 3;
		intersection[1] = (a[1] + b[1] + c[1]) / 3;
		
		return intersection;
	}
	
	public void printCoordinate(double[] coordinate) {
		System.out.println("x = " + coordinate[0] + " y = " + coordinate[0]);
	}

}
