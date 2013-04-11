/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author Nick
 */
public class Problem6 {

//The sum of the squares of the first ten natural numbers is,
//12 + 22 + ... + 102 = 385
//
//The square of the sum of the first ten natural numbers is,
//(1 + 2 + ... + 10)2 = 552 = 3025
//
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    public static void main(String[] args) {
        int number = 101, sumnatural = 0, sumsquare = 0;
        for (int i = 0; i < number; i++) {
            sumsquare += i;
            int temp = (i * i);
            sumnatural += temp;
        }
        int result = (sumsquare * sumsquare) - sumnatural;
        System.out.println("result:" + result);
    }
}
