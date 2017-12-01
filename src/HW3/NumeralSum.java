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
            int Sum = 0;
            for(int i = 0; i < charArray.length; i++){
                Sum = Sum + (int)charArray[i] - 48;
            }
            System.out.println("Sum of your numbers is " + Sum);
        }else{
            System.out.println("Your input must contain only numbers.");
        }
    }
}