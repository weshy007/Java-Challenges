public class AreaCalculator {
    public static double area(double radius){
        if (radius < 0){
            return -1.0;
        }
        double result = (radius * radius) * Math.PI;
        System.out.println("The area of a circle is " + result);
        return result;
    }

    public static double area(double x, double y){
        if ((x < 0) || (y < 0)){
            return -1.0;
        }
        double result = x * y;
        System.out.println("The area of a rectangle is " + result);
        return result;
    }
}
