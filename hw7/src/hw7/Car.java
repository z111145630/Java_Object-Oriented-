package hw7;

public class Car {
	private String brand;
	private int price;
	public Car(String b,int p) {
		setBrand(b);
		setPrice(p);
	}
	public void setBrand(String b) {
		brand=b;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int p) {
		price=p;
	}
	public int getPrice() {
		return price;
	}
	
}
