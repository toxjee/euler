/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.math.BigInteger;


/**
 *
 * @author Nick
 */
public class Problem16 {
    /*215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

     What is the sum of the digits of the number 21000?*/

    public static void main(String[] args) {
        BigInteger start = new BigInteger("2");
        BigInteger number = start.pow(1000);
        String numberString = number.toString();

        long sum = 0L;
        for (int i = 0; i < numberString.length(); i++) {
            sum += Long.parseLong(numberString.substring(i, (i + 1)));
        }
        System.out.println("numberr = " + sum);
    }
}
