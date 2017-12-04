package HW3;

import java.util.Locale;
import java.util.Scanner;

public class SquarePoint {
    private static Scanner getInput = new Scanner(System.in);

    private static int getNcheck() { // Get number from Console
        getInput.useLocale(Locale.ENGLISH);
        int num;
        //System.out.println("Enter number:");
        if (!getInput.hasNextInt()) {      // Check numerical type firstNumber
            System.out.println("Non-numerical type. Try again.");
            getInput.next();
            num = getNcheck();
        } else {
            num = getInput.nextInt();
        }
        return num;
    }

    public static void main(String[] args) {
        getInput.useLocale(Locale.ENGLISH);

        System.out.println("Enter x1:");
        int x1 = getNcheck();
        System.out.println("Enter x2:");
        int y1 = getNcheck();
        System.out.println("Point X (" + x1 + "," + y1 + ")");
        System.out.println();

        System.out.println("Enter y1:");
        int x2 = getNcheck();
        System.out.println("Enter y2:");
        int y2 = getNcheck();
        System.out.println("Point Y (" + x2 + "," + y2 + ")");
        System.out.println();

        System.out.println("Enter p1:");
        int x = getNcheck();
        System.out.println("Enter p2:");
        int y = getNcheck();
        System.out.println("Point P (" + x + "," + y + ")");

        if ((x >= x1 && x <= x2) && (y >= y1 && y <= y2)) {
            System.out.println("Point P Contains this rectangle");
        } else {
            System.out.println("Point P not contains this rectangle");
        }
    }
}
