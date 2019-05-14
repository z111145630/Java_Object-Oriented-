package hw8;
import java.util.Random;

public class hw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pet animal[] = new Pet[5];

		Random r = new Random();

		for (int i = 0; i <= 4; i++) {

			int colorInt = r.nextInt(4) + 1;
			int objectType = r.nextInt(3) + 1;

			if (objectType == 1) {
				animal[i] = new Pet(colorInt);
			} else if (objectType == 2) {
				animal[i] = new Dog(colorInt);
			} else if (objectType == 3) {
				animal[i] = new Cat(colorInt);
			}

		}

		for (int i = 0; i <= 4; i++) {

			System.out.println(animal[i].bark());

		}

	}

}
