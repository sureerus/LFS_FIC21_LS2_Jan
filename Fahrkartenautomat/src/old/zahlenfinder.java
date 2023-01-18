package old;

import java.util.Scanner;

public class zahlenfinder {

    public static void main(String[]args) {
        System.out.println("Bitte geben Sie die Zahl ein:");
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.next();
        int zahl = Integer.parseInt(eingabe);

        int summe = 0;
        while (zahl > 0) {
            summe += zahl % 10;
            zahl /= 10;
        }
        System.out.println("Die Quersumme lautet " + summe);
    }
}