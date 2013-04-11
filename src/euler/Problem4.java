/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author Nick
 */
public class Problem4 {

//    A palindromic number reads the same both ways
//    . The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers
    public static void main(String[] args) {
        //3 en 5  in 1000
        int below = 1000, highest = 0;
        for (int n1 = 500; n1 < below; n1++) {
            for (int n2 = 500; n2 < below; n2++) {
                int product = (n1 * n2);
                String number = String.valueOf(product);
                char[] numbers = number.toCharArray();
                if (numbers[0] == numbers[5] && numbers[1] == numbers[4] && numbers[2] == numbers[3]) {
                    if (product > highest) {
                        highest = product;
                        System.out.println("palindrom: " + product + " number1" + n1 + " number 2:" + n2);
                    }
                }
            }
        }
    }
}
