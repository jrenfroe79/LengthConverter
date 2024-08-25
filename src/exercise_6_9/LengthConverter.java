package exercise_6_9;

public class LengthConverter {

    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        // Test program
        double feet = 10; // Example value in feet
        double meters = 3; // Example value in meters
        
        // Convert feet to meters
        double convertedMeters = footToMeter(feet);
        System.out.printf("%.2f feet is %.2f meters%n", feet, convertedMeters);

        // Convert meters to feet
        double convertedFeet = meterToFoot(meters);
        System.out.printf("%.2f meters is %.2f feet%n", meters, convertedFeet);
    }
}
