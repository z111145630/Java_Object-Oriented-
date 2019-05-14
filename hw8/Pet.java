package hw8;
public class Pet {

	private String color;

	public Pet(int c) {
		setColor(c);
	}

	public void setColor(int c) {
		if (c == 1) {
			color = "黑色";
		} else if (c == 2) {
			color = "白色";
		} else if (c == 3) {
			color = "橘色";
		} else if (c == 4) {
			color = "黃色";
		}
	}

	public String getColor() {
		return color;
	}

	public String bark() {
		return getColor() + "的Pet不知道怎麼叫。";
	}

}
