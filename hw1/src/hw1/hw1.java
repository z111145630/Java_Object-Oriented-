package hw1;

import java.util.Scanner;
public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle box = new Circle();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("�п�J�ꪺ�b�|�G");
		double r = keyboard.nextDouble();
		box.setRadius(r);
		
		System.out.printf("�ꪺ���n���G%.2f\n�ꪺ���|���G%.2f\n"
				+ "�ꪺ�P�����G%.2f",box.getArea(),box.getDiameter(),box.getCircumference());

	}
}
