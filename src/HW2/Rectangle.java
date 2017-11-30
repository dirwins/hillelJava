package HW2;

import java.util.Locale;
import java.util.Scanner;


public class Rectangle {
    private static Scanner getSise = new Scanner(System.in);

    public static void main(String[] args) {
        getSise.useLocale(Locale.ENGLISH);
        System.out.println("Enter width:");
        int width = getSise.nextInt();
        System.out.println("Enter height:");
        int height = getSise.nextInt();


        for (int i = 1, a = 0; i <= width; i++, a++) {
            for (int j = 1, b = 0; j <= height; j++, b++) {
                if (i == 1 || j == 1 || i == width || j == height)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

