/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.util.ArrayList;

/**
 *
 * @author Nick
 */
public class Problem10 {
//    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//Find the sum of all the primes below two million.

    public static void main(String[] args) {
        long number = 0;
        ArrayList<Long> numbers = new ArrayList();
        for (long i = 2; i < 2000000; i++) {
            boolean add = true;
            for (int j = 0; j < numbers.size(); j++) {
                Long long1 = numbers.get(j);
                if ((i % long1) == 0) {
                    add = false;
                }
            }
            if (add) {
                numbers.add(i);
                number+= i;         
            }
        }
        System.out.println("sum = "+ number);
    }
}
