/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author Nick
 */
public class Problem5 {

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    public static void main(String[] args) {
        for (int i = 1; i < 999999999; i++) {
            boolean temp = true;
            for (int j = 1; j < 20; j++) {
                if (!((i % j) == 0)) {
                    temp = false;
                }
            }
            if (temp) {
                System.out.println("number" + i);
            }
        }
    }
}
