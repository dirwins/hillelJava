package HW2;

import java.util.Scanner;
import java.util.Locale;

public class Deposit {
    private static Scanner getEnter = new Scanner(System.in);

    public static void main(String[] args) {
        getEnter.useLocale(Locale.ENGLISH);
        System.out.println("Enter your deposit:");
        int deposit = getEnter.nextInt();
        System.out.println("Enter percent:");
        int percent = getEnter.nextInt();
        System.out.println("Enter 'years':");
        int years = getEnter.nextInt();


        int percentSum = percent;
        int depositSum = deposit;
        //depositSum = deposit + deposit * percent / 100;
        for (int i = 1; i <= years; i++) {

            percentSum = depositSum  * percent / 100;
            System.out.println("After year '" + i + "' percents are " + percentSum);

            depositSum = depositSum + depositSum * percent / 100;
            System.out.println("After year '" + i + "' deposit is " + depositSum);

            System.out.println();
        }

    }
}
