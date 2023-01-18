package old;

public class Einmaleins {
    public static void main(String[] args) {

        int k = 10;
        for (int m = 1; m <= k; m++) {       // Schleife über alle Zahlen, die miteinander multipliziert werden
            for (int j = 1; j <= k; j++) {
                System.out.printf("%5s", m * j);
            }
            // Zeilenumbruch
            System.out.println();
        }
    }
}

