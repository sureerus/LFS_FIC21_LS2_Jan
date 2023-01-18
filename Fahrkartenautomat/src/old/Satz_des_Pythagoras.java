package old;

import java.lang.Math;
public class Satz_des_Pythagoras {
    public static void main(String[] args) {

        for (int x = 1; x <= 30; x++) {
            for (int a = 1; a <= 30; a++) {
                double d = Math.pow(x, 2.0) + Math.pow(x, 2.0);
                if (Math.sqrt(d) % 1 == 0.0) {
                    System.out.printf(x + "^2 " + a + "^2= " + "%.0f" + "^2\n", Math.sqrt(d));
                }
            }
        }
    }
}