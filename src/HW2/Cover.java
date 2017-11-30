package HW2;

import java.util.Locale;
import java.util.Scanner;


public class Cover {
    private static Scanner getSise = new Scanner(System.in);

    //Check odd/even Number
    public static boolean OddEven(int input) {
        if (input % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        getSise.useLocale(Locale.ENGLISH);
        System.out.println("Enter size:");
        int size = getSise.nextInt();


        for (int i = 1, a = 0; i <= size; i++, a++) {
            for (int j = 1, b = 0; j <= size; j++, b++) {
                if (i == 1 || j == 1 || i == size || j == size || i == j || j == size - (i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }


}