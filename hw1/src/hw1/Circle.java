package hw1;

public class Circle {
	private double radious;
	private double PI = 3.14;
	
	public void setRadius(double r) {
		radious = r;
	}
	public double getRadius() {
		 return radious;
	}
	public double getArea() {
		return radious*radious*PI;
	}
	public double getDiameter() {
		return radious*2;
	}
	public double getCircumference() {
		return radious*2*PI;
	}
}
