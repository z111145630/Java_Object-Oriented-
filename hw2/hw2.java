package hw2;
import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int y1,s1,y2,s2;
		String m1,m2;
		
		System.out.print("輸入製造年份：");		
		y1 = keyboard.nextInt();
		System.out.print("輸入速度：");
		s1 = keyboard.nextInt();
		System.out.print("輸入製造廠牌：");
		m1 = keyboard.next();
		System.out.print("輸入製造年份：");		
		y2 = keyboard.nextInt();
		System.out.print("輸入速度：");
		s2 = keyboard.nextInt();
		System.out.print("輸入製造廠牌：");
		m2 = keyboard.next();
		
		Car car1 = new Car(y1,m1);
		Car car2 = new Car(y2,m2,s2);
		car1.setSpeed(s1);
		
		System.out.println("\t製造年份\t製造廠牌\t速度");	
		System.out.println("第一輛汽車："+car1.getInfo());	
		System.out.println("第二輛汽車："+car2.getInfo());	
		System.out.print("加速第一輛汽車：目前速度為");
		car1.accelerate();
		System.out.print("\n加速第一輛汽車：目前速度為");
		car1.accelerate();
		System.out.print("\n減速第一輛汽車：目前速度為");
		car1.brake();
		System.out.print("\n減速第一輛汽車：目前速度為");
		car1.brake();
		
		System.out.print("\n加速第二輛汽車：目前速度為");
		car2.accelerate();
		System.out.print("\n加速第二輛汽車：目前速度為");
		car2.accelerate();
		System.out.print("\n減速第二輛汽車：目前速度為");
		car2.brake();
		System.out.print("\n減速第二輛汽車：目前速度為");
		car2.brake();
	}

}
