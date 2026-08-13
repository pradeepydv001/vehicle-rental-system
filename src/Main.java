import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the Vehicle Rental System with multiple
 * vehicle types (Car and Bike). Shows details and calculates
 * rental cost for each vehicle over a given number of days.
 */
public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        // Adding different types of vehicles
        vehicles.add(new Car("KA-01-AB-1234", "Toyota Innova", 1500.0, 7));   // large car
        vehicles.add(new Car("KA-02-CD-5678", "Hyundai i20", 1000.0, 5));     // regular car
        vehicles.add(new Bike("KA-03-EF-9012", "Royal Enfield Classic", 500.0, 350)); // high-cc bike
        vehicles.add(new Bike("KA-04-GH-3456", "Honda Activa", 300.0, 110));  // regular bike

        int rentalDays = 3;

        System.out.println("===== Vehicle Rental System =====\n");

        for (Vehicle v : vehicles) {
            v.displayDetails();
            double cost = v.calculateRentalCost(rentalDays);
            System.out.println("Rental (" + rentalDays + " days): $" + cost);
            System.out.println("----------------------------------");
        }
    }
}
