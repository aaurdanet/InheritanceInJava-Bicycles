import java.util.Scanner;

public class InheritanceClassForBicycle {

	public static void main(String[] args) {
		int eSize = 0;
		Bike[] myBike = new Bike[5];

		System.out.println("You cannot enter more than five bikes\n");

		myBike[eSize] = new Features("Pegassi", "Track", "Mate black", "Yes", 19);
		eSize++;

		myBike[eSize] = new Features("Nagasaki", "Offroad", "Mate blue", "Yes", 20);
		eSize++;

		myBike[eSize] = new Features("Dinka", "Street", "Red", "No", 20);
		eSize++;

		myBike[eSize] = new Features("Cheetah", "Comercial", "Green", "Yes", 15);
		eSize++;

		myBike[eSize] = new Features("Mochima", "Race", "Orange", "No", 25);
		eSize++;

		for (int i = 0; i < eSize; i++) {
			System.out.println(myBike[i]);
		}

	}
}