public class NewtonRaphsonMethod {
    // Define the function whose root we want to find
    public static double function(double x) {
        // Example function: f(x) = x^3 - x - 2
        return Math.pow(x, 3) - x - 2;
    }

    // Define the derivative of the function
    public static double derivative(double x) {
        // Derivative of f(x) = 3x^2 - 1
        return 3 * Math.pow(x, 2) - 1;
    }

    public static void main(String[] args) {
        double x0 = 1.5; // Initial guess
        double x1 = 0; // Next approximation
        double tolerance = 0.0001; // Tolerance for stopping
        double error = 1; // Start with an arbitrary high error
        int iteration = 1;

        System.out.printf("%-10s %-10s %-10s %-10s%n", "Iteration", "x", "f(x)", "Error");

        // Iterate until the error is within the desired tolerance
        while (error > tolerance) {
            x1 = x0 - function(x0) / derivative(x0); // Newton-Raphson formula
            error = Math.abs(x1 - x0); // Update error

            // Print the values for this iteration
            System.out.printf("%-10d %-10.6f %-10.6f %-10.6f%n", iteration, x1, function(x1), error);

            x0 = x1; // Update x0 for the next iteration
            iteration++;
        }

        // Print the final result
        System.out.println("\nRoot found at: " + x1);
        System.out.println("Error: " + error);
    }
}
