package euler;

/**
 *
 * @author Nick
 */
public class Problem9 {

//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//a2 + b2 = c2
//
//For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
    public static void main(String[] args) {
        int number = 1000;
        for (int a = 0; a < 1000; a++) {
            for (int b = (a + 1); b < 1000; b++) {
                int a2 = (a * a), b2 = (b * b), c = ((number - a) - b), c2 = (c * c);
                if (c2 == (a2 + b2)) {
                    int product = ((a * b) * c);
                    System.out.println("product: " + product + " abc:" + a + ", " + b + ", " + +c);
                }
            }
        }
    }
}
