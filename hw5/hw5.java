package hw5;
import java.util.*;
public class hw5 {
	public static void main(String[] args) {
		Random rand = new Random();
		Geometry g;
		int r = rand.nextInt(3);
		if(r==0)
			g = new Geometry(Shape.CIRCLE);
		else if(r==1)
			g = new Geometry(Shape.RECTANGLE);
		else
			g = new Geometry(Shape.TRIANGLE);
		
		System.out.println("產生亂數為"+r);
		g.calArea();
		System.out.println(g.toString());
		
		
	}
	
	
}
