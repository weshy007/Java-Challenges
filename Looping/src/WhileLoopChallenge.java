public class WhileLoopChallenge {
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void sumOfEven() {

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount ++;
                continue;
            }
            System.out.println("Even Number " + number);
            evenCount++;

            if (evenCount >=5){
                break;
            }
        }
        System.out.println("Total of odd numbers found = " + oddCount);
        System.out.println("Total of even numbers found = " + evenCount);
    }
}
