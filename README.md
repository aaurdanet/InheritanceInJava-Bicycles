Inheritance Class for Bicycle

The InheritanceClassForBicycle Java program demonstrates the use of inheritance with the Bike class and its derived class Features. It creates an array of bikes, initializes instances with various features, and then displays the details of each bike.
Features

Bike and Features

The project includes two classes: Bike and Features. The Bike class serves as the base class with basic attributes like brand and type, while the Features class extends Bike and introduces additional features such as color, gears, and wheel size.

    Main Method:
        Initializes an array of bikes (Bike[] myBike) and populates it with instances of the Features class.
        Demonstrates the use of polymorphism by storing objects of the derived class (Features) in an array of the base class (Bike).
        Prints the details of each bike using a loop.

java

public static void main(String[] args)

    Array of Bikes:
        Creates an array to hold instances of the Bike class, allowing for polymorphic behavior.

java

Bike[] myBike = new Bike[5];

    Initialization of Bikes:
        Initializes instances of the Features class with different features and adds them to the array.

java

myBike[eSize] = new Features("Pegassi", "Track", "Mate black", "Yes", 19);
// (similar initialization for other bikes)
eSize++;

    Loop for Displaying Bikes:
        Iterates through the array and prints the details of each bike.

java

for (int i = 0; i < eSize; i++) {
    System.out.println(myBike[i]);
}

