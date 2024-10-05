public class SecantMethod {
    // Define the function whose root we want to find
    public static double function(double x) {
        // Example function: f(x) = x^3 - x - 2
        return Math.pow(x, 3) - x - 2;
    }

    public static void main(String[] args) {
        double x0 = 1;   // First initial guess
        double x1 = 2;   // Second initial guess
        double x2 = 0;   // New approximation
        double tolerance = 0.0001; // Tolerance for stopping
        double error = 1; // Start with an arbitrary high error
        int iteration = 1;

        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Iteration", "x0", "x1", "x2", "Error");

        // Iterate until the error is within the desired tolerance
        while (error > tolerance) {
            x2 = x1 - function(x1) * (x1 - x0) / (function(x1) - function(x0)); // Secant method formula
            error = Math.abs(x2 - x1); // Calculate the current error

            // Print the values for this iteration
            System.out.printf("%-10d %-10.6f %-10.6f %-10.6f %-10.6f%n", iteration, x0, x1, x2, error);

            // Update x0 and x1 for the next iteration
            x0 = x1;
            x1 = x2;
            iteration++;
        }

        // Print the final result
        System.out.println("\nRoot found at: " + x2);
        System.out.println("Error: " + error);
    }
}
