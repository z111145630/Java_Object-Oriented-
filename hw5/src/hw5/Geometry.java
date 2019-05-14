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
			System.out.print("�п�J��Ϊ��b�|�G");
			setarea(Math.pow(key.nextDouble(), 2)*Math.PI);
		}
		else if(gshape.equals(Shape.RECTANGLE)) {
			System.out.print("�п�J����Ϊ����M�e�G");
			setarea(key.nextDouble()*key.nextDouble());
		}
		else {
			System.out.print("�п�J�T���Ϊ����M���G");
			setarea((key.nextDouble()*key.nextDouble())/2);
		}
		return getarea();	
	}
	public String toString() {
		if(gshape.equals(Shape.CIRCLE))
			return "��Ϊ����n��"+Math.round(getarea()*100)/100.0;
		else if(gshape.equals(Shape.RECTANGLE))
			return "����Ϊ����n��"+Math.round(getarea()*100)/100.0;
		else
			return "�T���Ϊ����n��"+Math.round(getarea()*100)/100.0;
	}
}
