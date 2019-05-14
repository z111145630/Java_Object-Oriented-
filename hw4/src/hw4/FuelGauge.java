package hw4;

public class FuelGauge {
	public int max_gallons = 10;
	private int gallons;

	public FuelGauge() {
		this(0);
	}
	public FuelGauge(int g) {
		gallons=g;
	}
	public int getGallons() {
		return gallons;
	}
	public void incrementGallons() {
		gallons+=1;
	}
	public void decrementGallons() {
		gallons-=1;
	}
}
