public class BisectionMethod {
    // Function f(x)
    public static double f(double x) {
        return 3 * x - Math.cos(x) - 1;
    }

    // Bisection Method
    public static void bisection(double a, double b, double tolerance) {
        if (f(a) * f(b) >= 0) {
            System.out.println("Root does not exist in the given interval.");
            return;
        }

        double c = 0, error = 1;
        while (error > tolerance) {
            c = (a + b) / 2;  // Midpoint
            error = Math.abs(f(c));  // Error as absolute value of f(c)

            if (f(c) == 0) {
                break;  // c is the root
            } else if (f(a) * f(c) < 0) {
                b = c;  // Root lies between a and c
            } else {
                a = c;  // Root lies between c and b
            }
        }

        System.out.println("The root is: " + c);
    }

    public static void main(String[] args) {
        bisection(0, 1, 0.001);  // Interval [0, 1] and tolerance 0.001
    }
}
