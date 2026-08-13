/**
 * Represents a Bike, a specific type of Vehicle.
 * Bikes have an engine capacity (in cc). Higher cc bikes
 * (performance/heavy bikes) cost extra per day.
 */
public class Bike extends Vehicle {
    private int engineCapacityCC;

    private static final int HIGH_CC_THRESHOLD = 150;
    private static final double HIGH_CC_EXTRA_CHARGE_PER_DAY = 100.0;

    public Bike(String vehicleNumber, String brand, double ratePerDay, int engineCapacityCC) {
        super(vehicleNumber, brand, ratePerDay);
        this.engineCapacityCC = engineCapacityCC;
    }

    public int getEngineCapacityCC() {
        return engineCapacityCC;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = getRatePerDay() * days;

        // High-cc bikes have an extra daily charge
        if (engineCapacityCC > HIGH_CC_THRESHOLD) {
            baseCost += HIGH_CC_EXTRA_CHARGE_PER_DAY * days;
        }
        return baseCost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type           : Bike");
        System.out.println("Engine Capacity: " + engineCapacityCC + "cc");
    }
}
