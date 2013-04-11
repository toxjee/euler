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
public class Problem7 {
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?

    public static void main(String[] args) {
        int number = 0;
        ArrayList<Long> numbers = new ArrayList();
        for (long i = 2; i < 10000000; i++) {
            boolean add = true;
            for (int j = 0; j < numbers.size(); j++) {
                Long long1 = numbers.get(j);
                if ((i % long1) == 0) {
                    add = false;
                }
            }
            if (add) {
                numbers.add(i);
                number++;
                if (number == 10001) {
                    System.out.println("priem 10011 = " + i);
                    break;
                }
            }
        }

    }
}
