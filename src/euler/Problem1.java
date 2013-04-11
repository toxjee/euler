/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author Nick
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //3 en 5  in 1000
        int number = 1, sum = 0, below = 1000;
        for (int i = 0; i < below; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("SUM IS" + sum);
    }
}
