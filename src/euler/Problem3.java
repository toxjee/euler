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
public class Problem3 {
//    The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 

    public static void main(String[] args) {
        long number = 600851475143L;
        ArrayList<Long> numbers = new ArrayList();

        for (long i = 2; i < 10000000; i++) {
            if ((number % i) == 0) {
                boolean add = true;
                for (int j = 0; j < numbers.size(); j++) {
                    Long long1 = numbers.get(j);
                    if ((i % long1) == 0) {
                        add = false;
                    }
                }
                if (add) {
                    numbers.add(i);
                }
            }
        }

        for (int k = 0; k < numbers.size(); k++) {
            System.out.println("priemen"+  numbers.get(k));
        }


    }
}
