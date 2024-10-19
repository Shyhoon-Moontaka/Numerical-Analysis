public class NewtonRaphson {
    // Function f(x)
    public static double f(double x) {
        return 3 * x - Math.cos(x) - 1;
    }

    // Derivative of f(x)
    public static double df(double x) {
        return 3 + Math.sin(x);
    }

    // Newton-Raphson Method
    public static void newtonRaphson(double x0, double tolerance) {
        double x1 = x0, error = 1;

        while (error > tolerance) {
            x1 = x0 - f(x0) / df(x0); // Newton-Raphson iteration
            error = Math.abs(f(x1)); // Update error
            
            if (error < tolerance) {
                break;
            }

            x0 = x1; // Update for next iteration
        }

        System.out.println("The root is: " + x1);
    }

    public static void main(String[] args) {
        newtonRaphson(0.5, 0.001); // Initial guess x0 = 0.5
    }
}
