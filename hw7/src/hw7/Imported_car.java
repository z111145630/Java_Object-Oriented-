package hw7;

public class Imported_car extends Car{
	private String origin;
	public Imported_car(String b,int p,String o) {
		super(b,p);
		setOrigin(o);
	}
	public void setOrigin(String o) {
		origin=o;
	}
	public String getOrigin() {
		return origin;
	}
	public double calTotalPrice() {
		return getPrice()*1.5;
	}
	public String toString() {
		return getBrand()+"�O�i�f���A���a"+getOrigin()+"�A���"+getPrice()+"�A�`��"+calTotalPrice()+"���C";
	}
}
