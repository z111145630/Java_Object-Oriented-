package hw8;
public class Pet {

	private String color;

	public Pet(int c) {
		setColor(c);
	}

	public void setColor(int c) {
		if (c == 1) {
			color = "�¦�";
		} else if (c == 2) {
			color = "�զ�";
		} else if (c == 3) {
			color = "���";
		} else if (c == 4) {
			color = "����";
		}
	}

	public String getColor() {
		return color;
	}

	public String bark() {
		return getColor() + "��Pet�����D���s�C";
	}

}
