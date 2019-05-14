package hw4;
import java.util.Scanner;
public class hw4 {

	public static void main(String[] args) {
		int gas,mile;
		Scanner k =new Scanner(System.in);
		System.out.print("請輸入機車目前的油量：");
		FuelGauge f=new FuelGauge(gas =k.nextInt());
		System.out.print("請輸入機車目前的里程數：");
		Odometer od =new Odometer(mile=k.nextInt(),f);
		System.out.println();
		
		for(int g=gas-1;g>=0;g--) {
			System.out.printf("機車里程數:%d英哩\n",od.getMileage()+1);
			System.out.printf("機車油量:%d加侖\n",f.getGallons()-1);
			System.out.println("----------------");
			od.incrementMileage();
			f.decrementGallons();
			
		}
	}

}