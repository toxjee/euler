/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author Nick
 */
public class Problem2 {

    public static void main(String[] args) {
        
        long prevNumber = 0, number = 1, max = 4000000, sumofeven = 0;
        for (int i = 0; i < 100; i++) {
            long temp = prevNumber;
            prevNumber = number;
            number = temp + number;
            if ((number % 2) == 0) {
                sumofeven += number;
            }
            if (number > max) {
                System.out.println("even" + sumofeven);
                break;
            }
        }
    }
}
