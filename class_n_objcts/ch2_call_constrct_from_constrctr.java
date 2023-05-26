// A class can have multiple parameterized constructors which can call each other.

class Car {

    // Private fields

    private String carName;
    private String carModel;
    private String carCapacity;

    // Default constructor

    public Car() {

        this.carName = "";
        this.carModel = "";
        this.carCapacity = "";

    }

    // Parameterized constructor 1
    public Car(String name, String model) {
        this.carName = name;
        this.carModel = model;
    }

    // Parameterized constructor 2
    public Car(String name, String model, String capacity) {
        this(name, model);
        this.carCapacity = capacity;

    }

    // Method to return car details
    public String getDetails() {
        return this.carName + ", " + this.carModel + ", " + this.carCapacity;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Ferrari", "F8", "100");
        System.out.println(myCar.getDetails());
        System.out.println("Joe Mama stanks!");

    }

}
