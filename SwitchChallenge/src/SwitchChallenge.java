public class SwitchChallenge {
    public static void switchChallenge() {

        char charValue = 'g';

        switch (charValue) {
            case 'A':
                System.out.println("Letter " + charValue + " = Able");
                break;
            case 'B':
                System.out.println("Letter " + charValue + " = Baker");
                break;
            case 'C':
                System.out.println("Letter " + charValue + " = Charlie");
                break;
            case 'D':
                System.out.println("Letter " + charValue + " = Dog");
                break;
            case 'E':
                System.out.println("Letter " + charValue + " = Easy");
                break;
            default:
                System.out.println("Letter " + charValue + " not found");
                break;
        }
    }
}
