public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {

        if ((summer = true) && (temperature >= 25 && temperature <= 45)){
            System.out.println("true, summer");
            return true;
        } else if ((summer = false) && (temperature >= 25 && temperature <= 35)) {
            System.out.println("true, not summer");
            return true;
        } else {
            System.out.println("Invalid");
            return false;
        }
    }
}
