public class FeetToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet <0) || (inches < 0 || inches > 12)) {
            System.out.println("Invalid");
            return -1;
        }
        double toInches = feet * 12;
        double toCM = (toInches * 2.54) + (inches * 2.54);

        System.out.println(feet + " feet, " + inches + " inches = " + toCM + " cm");
        return toCM;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches /12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
