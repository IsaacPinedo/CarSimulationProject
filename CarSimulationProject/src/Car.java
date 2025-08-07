public class Car {
    // Adding class attributes
    String make; // stores the car's make (like Ford, Toyota)
    String model; // stores the car's specific model name (like Mustang, Camry)
    String color; // stores the car's color (like Red, Silver)
    int year; // stores the car's manufacturing year (like 2020)

    // Car details method
    public String GetCarDetails() {
        return "Make: " + make + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year;
    }

}
