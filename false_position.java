public class FalsePosition {
    public static double f(double x) {
        return 3 * x - Math.cos(x) - 1;
    }
    public static void falsePosition(double a, double b, double tolerance) {
        if (f(a) * f(b) >= 0) {
            System.out.println("Root does not exist.");
            return;
        }
        double c = 0, error = 1;
        while (error > tolerance) {
            c = (a * f(b) - b * f(a)) / (f(b) - f(a));
            error = Math.abs(f(c));
            if (f(c) == 0) {
                break;
            }
            if (f(a) * f(c) > 0) {
                a = c;
            } else {
                b = c;
            }
        }
        System.out.println("The root is: " + c);
    }
    public static void main(String[] args) {
        falsePosition(0, 1, 0.001);
    }
}
