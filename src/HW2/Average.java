package HW2;

import java.util.Locale;
import java.util.Scanner;

public class Average {
    private static Scanner getSise = new Scanner(System.in);

    public static void main(String[] args) {
        getSise.useLocale(Locale.ENGLISH);
        System.out.println("Enter Num1:");
        if (getSise.hasNextDouble()) {

            double Num1 = getSise.nextDouble();
            System.out.println("Enter Num2:");
            double Num2 = getSise.nextDouble();
            System.out.println("HW2.Average of Num1 and Num2 is " + (Num1 + Num2) / 2);
        }
    }
}
