package hw3;
import java.text.DecimalFormat;
public class Geometry {
	static DecimalFormat g = new DecimalFormat(".00");
	private static double area;
	static double calculateArea(double r) {
		double pi = 3.14;
		area = r*r*pi;
		g.format(area);
		return area;
	}
	static double calculateArea(double h, double w) {
		area = h*w;
		g.format(area);
		return area;
	}
	static double calculateArea(double upbase, double downbase, double h) {
		area = (upbase+downbase)*h*0.5;
		g.format(area);
		return area;
	}
	static String toString(int index, double area) { 
		String end = null; 
		switch(index) {
		case 1:
			end= "圓面積為" + area;
			break;
		case 2:
			end= "方形面積為"+ area;
			break;
		case 3:
			end= "梯形面積為"+ area;
			break;
		}
		return end;	  
	}
}