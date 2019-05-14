package hw1;

import java.util.Scanner;
public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle box = new Circle();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("請輸入圓的半徑：");
		double r = keyboard.nextDouble();
		box.setRadius(r);
		
		System.out.printf("圓的面積為：%.2f\n圓的直徑為：%.2f\n"
				+ "圓的周長為：%.2f",box.getArea(),box.getDiameter(),box.getCircumference());

	}
}
