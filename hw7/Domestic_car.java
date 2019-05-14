package hw7;

public class Domestic_car extends Car{
	public Domestic_car(String b,int p) {
		super(b,p);
	}
	public double calTotalPrice() {
		return getPrice()*1.1;
	}
	public String toString() {
		return getBrand()+"是國產車，原價"+getPrice()+"元，總價"+calTotalPrice()+"元。";
	}
}
