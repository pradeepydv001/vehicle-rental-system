/**
 * Represents a Car, a specific type of Vehicle.
 * Cars have a number of seats, and larger cars (more seats)
 * cost extra per day due to higher maintenance/fuel usage.
 */
public class Car extends Vehicle {
    private int numSeats;

    private static final int LARGE_CAR_SEAT_THRESHOLD = 5;
    private static final double LARGE_CAR_EXTRA_CHARGE_PER_DAY = 200.0;

    public Car(String vehicleNumber, String brand, double ratePerDay, int numSeats) {
        super(vehicleNumber, brand, ratePerDay);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = getRatePerDay() * days;

        // Larger cars (more than 5 seats) have an extra daily charge
        if (numSeats > LARGE_CAR_SEAT_THRESHOLD) {
            baseCost += LARGE_CAR_EXTRA_CHARGE_PER_DAY * days;
        }
        return baseCost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type           : Car");
        System.out.println("Seats          : " + numSeats);
    }
}
