public class BisectionMethod {
    // Define the function whose root we want to find
    public static double function(double x) {
        // Example function: f(x) = x^3 - x - 2
        return Math.pow(x, 3) - x - 2;
    }

    public static void main(String[] args) {
        // Initial guesses
        double a = 1;
        double b = 2;
        double c = 0;
        double error = 1; // Start with an arbitrary high error
        double tolerance = 0.0001; // Tolerance for stopping
        int iteration = 1;

        // Ensure that a and b bracket the root (i.e., f(a) * f(b) < 0)
        if (function(a) * function(b) >= 0) {
            System.out.println("Incorrect initial guesses. Root is not bracketed.");
            return;
        }

        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Iteration", "a", "b", "c", "Error");

        // Iterate until the error is within the desired tolerance
        while (error > tolerance) {
            c = (a + b) / 2.0; // Compute the midpoint
            error = Math.abs(b - a) / 2.0; // Calculate the current error

            // Print the values for this iteration
            System.out.printf("%-10d %-10.6f %-10.6f %-10.6f %-10.6f%n", iteration, a, b, c, error);

            // Check if we found the root or if we should adjust a or b
            if (function(c) == 0.0) {
                // We've found the exact root
                break;
            } else if (function(a) * function(c) < 0) {
                // The root is in the left subinterval
                b = c;
            } else {
                // The root is in the right subinterval
                a = c;
            }

            iteration++;
        }

        // Print the final result
        System.out.println("\nRoot found at: " + c);
        System.out.println("Error: " + error);
    }
}
