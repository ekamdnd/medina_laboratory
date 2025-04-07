// Base class: Vehicle
 
import java.util.Scanner;
 
class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;
 
 
//Constructor
public Vehicle (String brand, int speed, String fuelType) {
    this.brand = brand;
    this.speed = speed;
    this.fuelType = fuelType;
 
}
 
//Encapsulation: Getter Method
public String getBrand() {
    return brand;
 
}
 
public int getSpeed() {
    return speed;
   
}
 
public String getFuelType() {
    return fuelType;
 
}
 
// Method to display vehicle information
public void displayInfo() {
    System.out.println("Brand" + brand);
    System.out.println("Speed" + speed);
    System.out.println("FuelType" + fuelType);
 
}
 
}
 
//Derived class: Car ui
class Car extends Vehicle {
    private int numDoors;
 
//Constructor
    public Car(String brand, int speed, String fuelType) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }
    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
 }
  //Derived class: Motorcycle
 class Motorcycle extends Vehicle {
    private boolean hasSidecar;
 
 
    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }
     // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "None"));
    }
 
    //Main class
    public class TestVehicle {
        public static void main(String[] args) {
            Scanner myka = new Scanner(System.in);
 
        // Input for Car
        System.out.println("Enter Car details:");
        System.out.print("Brand: ");
        String carBrand = myka.nextLine();
        System.out.print("Speed (km/h): ");
        int carSpeed = myka.nextInt();
        myka.nextLine(); // Consume newline
        System.out.print("Fuel Type: ");
        String carFuelType = myka.nextLine();
        System.out.print("Number of Doors: ");
        int numDoors = myka.nextInt();
        myka.nextLine(); // Consume newline
 
        Car car = new Car(carBrand, carSpeed, carFuelType);
       
        //Input for Motorcycle
        System.out.println("\nEnter Motorcycle details:");
        System.out.print("Brand: ");
        String motoBrand = myka.nextLine();
        System.out.print("Speed (km/h): ");
        int motoSpeed = myka.nextInt();
        myka.nextLine(); // Consume newline
        System.out.print("Fuel Type: ");
        String motoFuelType = myka.nextLine();
        System.out.print("Has Sidecar? (yes/none): ");
        boolean hasSidecar = myka.nextBoolean();

        Motorcycle motorcycle = new Motorcycle(motoBrand, motoSpeed, motoFuelType, hasSidecar);

          // Display entered details
          System.out.println("\nCar Details:");
          car.displayInfo();
         
          System.out.println("\nMotorcycle Details:");
          motorcycle.displayInfo();
   
          myka.close();
      }
  }
             
          }