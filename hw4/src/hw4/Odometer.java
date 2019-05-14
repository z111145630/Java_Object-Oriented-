package hw4;
public class Odometer {
	public int MAX_MILEAGE = 100;
	private int mileage;
	private FuelGauge fuelGauge;

	public Odometer(int m,FuelGauge fg) {
		mileage =m;
		fuelGauge=fg;
	}
	public int getMileage() {
		return mileage;
	}
	public void incrementMileage() {
		if(mileage==MAX_MILEAGE-1)
			mileage=0;
		else
			mileage+=1;
	}
}