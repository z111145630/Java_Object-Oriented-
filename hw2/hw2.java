package hw2;
import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int y1,s1,y2,s2;
		String m1,m2;
		
		System.out.print("��J�s�y�~���G");		
		y1 = keyboard.nextInt();
		System.out.print("��J�t�סG");
		s1 = keyboard.nextInt();
		System.out.print("��J�s�y�t�P�G");
		m1 = keyboard.next();
		System.out.print("��J�s�y�~���G");		
		y2 = keyboard.nextInt();
		System.out.print("��J�t�סG");
		s2 = keyboard.nextInt();
		System.out.print("��J�s�y�t�P�G");
		m2 = keyboard.next();
		
		Car car1 = new Car(y1,m1);
		Car car2 = new Car(y2,m2,s2);
		car1.setSpeed(s1);
		
		System.out.println("\t�s�y�~��\t�s�y�t�P\t�t��");	
		System.out.println("�Ĥ@���T���G"+car1.getInfo());	
		System.out.println("�ĤG���T���G"+car2.getInfo());	
		System.out.print("�[�t�Ĥ@���T���G�ثe�t�׬�");
		car1.accelerate();
		System.out.print("\n�[�t�Ĥ@���T���G�ثe�t�׬�");
		car1.accelerate();
		System.out.print("\n��t�Ĥ@���T���G�ثe�t�׬�");
		car1.brake();
		System.out.print("\n��t�Ĥ@���T���G�ثe�t�׬�");
		car1.brake();
		
		System.out.print("\n�[�t�ĤG���T���G�ثe�t�׬�");
		car2.accelerate();
		System.out.print("\n�[�t�ĤG���T���G�ثe�t�׬�");
		car2.accelerate();
		System.out.print("\n��t�ĤG���T���G�ثe�t�׬�");
		car2.brake();
		System.out.print("\n��t�ĤG���T���G�ثe�t�׬�");
		car2.brake();
	}

}
