package hw4;
import java.util.Scanner;
public class hw4 {

	public static void main(String[] args) {
		int gas,mile;
		Scanner k =new Scanner(System.in);
		System.out.print("�п�J�����ثe���o�q�G");
		FuelGauge f=new FuelGauge(gas =k.nextInt());
		System.out.print("�п�J�����ثe�����{�ơG");
		Odometer od =new Odometer(mile=k.nextInt(),f);
		System.out.println();
		
		for(int g=gas-1;g>=0;g--) {
			System.out.printf("�������{��:%d�^��\n",od.getMileage()+1);
			System.out.printf("�����o�q:%d�[��\n",f.getGallons()-1);
			System.out.println("----------------");
			od.incrementMileage();
			f.decrementGallons();
			
		}
	}

}