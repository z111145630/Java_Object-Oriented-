package hw7;
import java.util.Scanner;
import java.util.Random;
public class hw7 {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		Random r=new Random();
		
		for(int x=0;x<3;x++){
			
		int a=r.nextInt(2)+1;
		if(a==1) {
			System.out.println("亂數=1");
			System.out.println("請依序輸入品牌、原始價格和產地");
			Imported_car i = new Imported_car(k.next(),k.nextInt(),k.next());
			System.out.println(i.toString());
		}
		if(a==2) {
			System.out.println("亂數=2");
			System.out.println("請依序輸入品牌和原始價格");
			Domestic_car d = new Domestic_car(k.next(),k.nextInt());
			System.out.println(d.toString());		
		}
		
		}
		
	}
}
