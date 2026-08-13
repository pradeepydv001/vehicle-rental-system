/**
 * Abstract base class representing a generic rentable vehicle.
 * All vehicle types (Car, Bike, etc.) inherit common properties
 * from this class and provide their own rental cost logic.
 */
public abstract class Vehicle {
    private String vehicleNumber;
    private String brand;
    private double ratePerDay;

    public Vehicle(String vehicleNumber, String brand, double ratePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.ratePerDay = ratePerDay;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    /**
     * Each vehicle type calculates its rental cost differently,
     * so this is left abstract for subclasses to implement.
     */
    public abstract double calculateRentalCost(int days);

    /**
     * Prints common vehicle details. Subclasses can extend this
     * to show their own extra details.
     */
    public void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Brand          : " + brand);
        System.out.println("Rate/Day       : $" + ratePerDay);
    }
}
