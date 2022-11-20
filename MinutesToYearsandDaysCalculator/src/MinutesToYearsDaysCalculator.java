public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long minutesToHours = minutes / 60;
            long hoursToDays = minutesToHours / 24;
            long daysToYears = hoursToDays / 365;

            long daysRemaining = hoursToDays % 365;

            System.out.println(minutes + " min = " + daysToYears + " y and " + daysRemaining + " d");
        }
    }
}
