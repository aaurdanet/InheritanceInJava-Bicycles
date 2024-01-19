import java.util.Scanner;

public class Bike extends Object {
	private String brand;
	private String type;
	

	public Bike(String brand, String type) {
		setBrand(brand);
		setType(type);

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {	
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
				this.type = type;
	}

	public String toString() {
		String result;
		result = "Brand: " + brand + "\t" + "Type: "  + type + "\n";
		return result;

	}
	
}