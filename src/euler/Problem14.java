package euler;

/**
 *
 * @author Nick
 */
public class Problem14 {
    /*  The following iterative sequence is defined for the set of positive integers:

     n → n/2 (n is even)
     n → 3n + 1 (n is odd)

     Using the rule above and starting with 13, we generate the following sequence:
     13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

     It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

     Which starting number, under one million, produces the longest chain?*/

    public static void main(String[] args) {
        long maxChains = 0;
        long bestStartingNumber = 0;
        for (long i = 0; i < 1000000; i++) {
            long currentNumber = i;
            long currentChains = 0;
            while (currentNumber > 1) {
                if (currentNumber % 2 > 0) {
                    currentChains++;
                    currentNumber = ((currentNumber * 3) + 1);
                } else {
                    currentChains++;
                    currentNumber = (currentNumber / 2);

                }
            }
            if (currentChains >= maxChains) {
                maxChains = currentChains;
                bestStartingNumber = i;
                System.out.println("new best start = " + i);
                System.out.println("with " + currentChains + " amount of chains");
            }
        }

        System.out.println("startnumer = " + bestStartingNumber);
    }
}
