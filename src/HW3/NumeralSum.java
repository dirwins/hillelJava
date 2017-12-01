package HW3;

import java.util.Scanner;
import java.util.Locale;

public class NumeralSum {
    private static Scanner getNumber = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter your number:");
        getNumber.useLocale(Locale.ENGLISH);
        if (getNumber.hasNextInt()) {
            String number = getNumber.nextLine();
            char[] charArray = number.toCharArray();
            System.out.print("Your reverse number is ");
            for (int i = charArray.length - 1; i >= 0; i--) {
                System.out.print(charArray[i]);
            }
        } else {
            System.out.println("Your input must contain only numbers.");
        }
    }
}
