public class Secant{
    public static double f(double x) {
        return 3 * x - Math.cos(x) - 1;
    }
    public static void secantMethod(double x0, double x1, double tolerance) {
        double x2;
        while (Math.abs(f(x1)) > tolerance) {
            x2 = x1 - (f(x1) * (x1 - x0)) / (f(x1) - f(x0));
            x0 = x1;
            x1 = x2;
        }
            System.out.printf("The root is: "+ x1+"\n");
    }
    public static void main(String[] args) {  
        secantMethod(0,1,0.001);
    }
}
