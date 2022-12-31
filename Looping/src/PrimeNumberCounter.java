public class PrimeNumberCounter {
    public static void primeNumberCalculator() {
        int count = 0;

        for (int i = 2; i <= 100; i++) {
            boolean counter = ThePrimeNumber.isPrime(i);
            if (ThePrimeNumber.isPrime(i)){
                System.out.println("Number " + i + " is a prime number");
                count ++;
                if (count == 3){
                    System.out.println("Found 3 - Exiting the loop!!");
                    break;
                }
            }
        }
//        System.out.println("Total number of primes is "+ count);
    }
}
