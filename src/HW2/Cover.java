package HW2;

import java.util.Locale;
import java.util.Scanner;


public class Cover {
    private static Scanner getSise = new Scanner(System.in);


    public static void main(String[] args) {
        getSise.useLocale(Locale.ENGLISH);
        System.out.println("Enter width:");
        int width = getSise.nextInt();
        System.out.println("Enter height:");
        int height = getSise.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int x = (int) (0.5 + (1.0 * (i) * width) / (height - 0.5));
                if (i == 0 || j == 0 || i == height - 1 || j == width - 1 || x == j || j == width - x - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}