public class SecondAndMinutesChallenge {
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds <0 || seconds > 59)) {
            System.out.println("Invalid Value");
            return "Invalid value";
        }

        int hoursIn = minutes / 60;
        int minutesRemaining = minutes % 60;

        System.out.println(hoursIn + "h " + minutesRemaining + "m " + seconds + "s");
        return null;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0 ) {
            System.out.println("Invalid Value");
            return "Invalid value";
        }

        int minutesIn = seconds / 60;
        int secondsRemaining = seconds % 60;

        getDurationString(minutesIn, secondsRemaining);
        return null;
    }
}
