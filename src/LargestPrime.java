public class LargestPrime {
    public static int getLargestPrime (int number) {
        if (number < 2) {
            return -1;
        }

        int divisorIsPrime = 0;
        boolean flag = false;

        for (int divisor=1; divisor <= number; divisor++ ) {
            if (number % divisor == 0) {                            // Get the divisor of (number)
                for(int i = 2; i <= divisor/2; ++i) {               // Check if the divisor is a prime number or not
                    if(divisor % i == 0) {
                        flag = true;                                // flag bukan prime number
                        break;
                    }
                }
                if (!flag) {                                        // flag adalah prime number
                    divisorIsPrime = divisor;                       // divisor adalah prime number
                }
            }
        }
        return divisorIsPrime;
    }
}
