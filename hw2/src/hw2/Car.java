package hw2;

public class Car {
	private int year;
	private String mark;
	private int speed;
	
	public Car(int y,String m) {
		year = y;
		mark = m;
	}
    public Car(int y,String m,int s) {
		year = y;
		mark = m;
		speed = s;
	}
    public void setYear(int y) {
    	year = y;
    }
    public int getYear() {
    	return year;
    }
    public void setMark(String m) {
    	mark = m;
    }
    public String getMark() {
    	return mark;
    }
    public void setSpeed(int s) {
    	speed = s;
    }
    public int getSpeed() {
    	return speed;
    }
    public void accelerate() {
    	speed +=5;
    	System.out.print(speed);
    }
    public void brake() {
    	speed -=5;
    	System.out.print(speed);
    }
    public String getInfo() {
    	return year+"\t"+mark+"\t"+speed;
    }

	
}
