
public class Features extends Bike {

	private String color;
	private String gears;
	private double wheelSize;

	public Features(String brand, String type, String color, String gears, double wheelSize) {
		super(brand, type);

		setColor(color);
		setGears(gears);
		setWheelSize(wheelSize);

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGears() {
		return gears;
	}

	public void setGears(String gears) {
		this.gears = gears;
	}

	public double getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(double wheelSize) {
		this.wheelSize = wheelSize;
	}

	public String toString() {
		String result;
		result = super.toString() + "Color: " + color + "\n" + "Gears: " + gears + "\n" + "Wheel size: " + wheelSize +" inches"
				+ "\n";
		return result;
	}
}