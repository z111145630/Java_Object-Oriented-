package hw3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class hw3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat g = new DecimalFormat(".00");
		
		for (;0 == 0;) {
			showMenu();
			System.out.println("請輸入選項1~4:");
			int a = keyboard.nextInt();
			if (a == 1) {
				for (;0 == 0;) {
					System.out.println("請輸入圓半徑：");
					double r = keyboard.nextDouble();
					if (r >= 0) {
						int ca;
						System.out.println(Geometry.toString(a,Geometry.calculateArea(r)));
						break; }
					 else
						System.out.println("錯誤，請輸入大於零的數字 ！");
						continue; } }
			
			else if (a == 2) {
				for (;0 == 0;) {
					System.out.println("請輸入長方形長和寬：");
					double h = keyboard.nextDouble();
					double w = keyboard.nextDouble();
					if (h >= 0 && w >= 0) {
						System.out.println(Geometry.toString(a,Geometry.calculateArea(h, w)));
						break;}
					else
						System.out.println("錯誤，請輸入大於零的數字 ！");
					continue; } }
			
			else if (a == 3) {
				for (;0 == 0;) {
					System.out.println("請輸入梯形上底、下底、高：");
					double upbase = keyboard.nextDouble();
					double downbase = keyboard.nextDouble();
					double h = keyboard.nextDouble();
					if (upbase >= 0 && downbase >= 0 && h >= 0) {
						System.out.println(Geometry.toString(a,Geometry.calculateArea(upbase, downbase, h)));
						break; }
					else
						System.out.println("錯誤，請輸入大於零的數字 ！");
					continue; } }
			
			else if (a == 4) {
				System.out.println("程式結束");
				break; }
			else
				System.out.println("選項輸入錯誤，請重新輸入！");
		}
		
	}
	public static void showMenu() {
		System.out.println(
				"Geometry Calculator\n" + "1. Calculate the Area of a Circle\n"
				+ "2. Calculate the Area of a Rectangle\n"
				+ "3. Calculate the Area of a Trapezoidal\n"
				+ "4. Quit \n");
	}
	
	}

