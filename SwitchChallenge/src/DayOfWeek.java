public class DayOfWeek {
    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("Day " + day + " is Sunday");
            case 1 -> System.out.println("Day " + day + " is Monday");
            case 2 -> System.out.println("Day " + day + " is Tuesday");
            case 3 -> System.out.println("Day " + day + " is Wednesday");
            case 4 -> System.out.println("Day " + day + " is Thursday");
            case 5 -> System.out.println("Day " + day + " is Friday");
            case 6 -> System.out.println("Day " + day + "is Saturday");
            default -> System.out.println("Invalid Day");
        }

    }
}
