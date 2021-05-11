/**
 * @author lukelmiller
 */

import java.lang.Math;
import java.text.NumberFormat;

public class MathClass {
    public static void main(String[] args) {
        double pw = Math.PI;
        System.out.println(pw);
        double e = Math.E;
        System.out.println(e*pw);
        System.out.println(Math.random());
        System.out.println(Math.min(pw, e));
        double price = 399.999;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println(formatter.format(price));
    }
}
