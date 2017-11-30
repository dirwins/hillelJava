package HW2;

import java.util.Locale;
import java.util.Scanner;

public class OddEvenPrimeMultiple {
    private static Scanner getSise = new Scanner(System.in);


    //Check odd/even Number
    public static boolean OddEven(int input) {
        if (input % 2 == 0) {
            System.out.println("Number '" + input + "' is even.");
            return true;
        } else {
            System.out.println("Number '" + input + "' is odd.");
            return false;
        }
    }


    // Check Prime Number
    public static void isPrime(int input) {
        boolean isPrime;
        if (input < 3) {
            System.out.println("Number '" + input + "' is Simple.");
            isPrime = false;
        } else {
            isPrime = true;
        }
        for (int i = 3; i <= (input / i); i += 2) {
            if (input % i == 0) {
                isPrime = false;
                //System.out.println("Number '" + input + "' is not Simple.");
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number '" + input + "' is  Prime.");
        } else {
            System.out.println("Number '" + input + "' is not Prime.");
        }
    }

    // Check multiple Number
    public static void multiple(int input) {
        if (input < 2) {
            System.out.println("'" + input + "' < 2");
        } else {
            System.out.print("List of multiple Numbers: ");
            int check = 0;
            for (int i = 2; i < input; i++) {
                if ((input % i) == 0) {
                    check++;
                    System.out.print(i + " ");
                }
            }
            if (check == 0) {
                System.out.println("1 " + input);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter your number:");
        getSise.useLocale(Locale.ENGLISH);
        if (getSise.hasNextInt()) {
            int inputN = getSise.nextInt();
            OddEven(inputN);
            isPrime(inputN);
            multiple(inputN);
        }
    }
}
