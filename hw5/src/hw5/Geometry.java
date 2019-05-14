package hw5;
import java.util.*;
public class Geometry {
	private Shape gshape;
	private double area;
	Scanner key = new Scanner(System.in);
	public Geometry(Shape g) {
		setgshape(g);
		setarea(0);
	}
	public void setgshape(Shape g) {
		gshape = g;
	}
	public Shape getshape() {
		return gshape;
	}
	public void setarea(double a) {
		area = a;
	}
	public double getarea() {
		return area;
	}
	public double calArea() {
		if(gshape.equals( Shape.CIRCLE)) {
			System.out.print("請輸入圓形的半徑：");
			setarea(Math.pow(key.nextDouble(), 2)*Math.PI);
		}
		else if(gshape.equals(Shape.RECTANGLE)) {
			System.out.print("請輸入長方形的長和寬：");
			setarea(key.nextDouble()*key.nextDouble());
		}
		else {
			System.out.print("請輸入三角形的底和高：");
			setarea((key.nextDouble()*key.nextDouble())/2);
		}
		return getarea();	
	}
	public String toString() {
		if(gshape.equals(Shape.CIRCLE))
			return "圓形的面積為"+Math.round(getarea()*100)/100.0;
		else if(gshape.equals(Shape.RECTANGLE))
			return "長方形的面積為"+Math.round(getarea()*100)/100.0;
		else
			return "三角形的面積為"+Math.round(getarea()*100)/100.0;
	}
}
