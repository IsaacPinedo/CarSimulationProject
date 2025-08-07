import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //--// Creating a new Car instance/object.
        Car UserCar = new Car();

        // Setting up its attributes.
        UserCar.make = "Toyota";
        UserCar.model = "Corolla";
        UserCar.color = "Black";
        UserCar.year = 2019;

        // Displaying the car details for UserCar by using GetCarDetails method.
        UserCar.GetCarDetails();

    //--// Creating a Scanner class instance/object
        Scanner Keyboard = new Scanner(System.in);

        // Creating an array of Car instances/objects (OwnedCars).
        Car[] OwnedCars = new Car[5];

        // Loop through OwnedCars array.
        for (int index = 0; index < OwnedCars.length; index++) {
            // Creating individual Car instances/objects inside the array.
            OwnedCars[index] = new Car();

            // Adding attributes for each instance/object created.
            System.out.println("Enter details for your car");

            System.out.println("Make: ");
            OwnedCars[index].make = Keyboard.nextLine();
            System.out.println("Model: ");
            OwnedCars[index].model = Keyboard.nextLine();
            System.out.println("Color: ");
            OwnedCars[index].color = Keyboard.nextLine();
            System.out.println("Year: ");
            OwnedCars[index].year = Keyboard.nextInt();
            Keyboard.nextLine();
        }

        // Calling for GetCarDetails method in every instance/object created inside the loop.
        for (int index = 0; index < OwnedCars.length; index++) {
            String car_details = OwnedCars[index].GetCarDetails();
            System.out.println(car_details);
        }
    }
}