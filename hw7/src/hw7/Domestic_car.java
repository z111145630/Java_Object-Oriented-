package hw7;

public class Domestic_car extends Car{
	public Domestic_car(String b,int p) {
		super(b,p);
	}
	public double calTotalPrice() {
		return getPrice()*1.1;
	}
	public String toString() {
		return getBrand()+"�O�겣���A���"+getPrice()+"���A�`��"+calTotalPrice()+"���C";
	}
}
