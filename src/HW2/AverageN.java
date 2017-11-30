package HW2;

import java.util.Locale;
import java.util.Scanner;

public class AverageN {
    private static Scanner getSise = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter numbers using ' ' (spase). For example: [2 4 6 8 10]");
        getSise.useLocale(Locale.ENGLISH);
        String Input = getSise.nextLine();

        //System.out.println(Input);
        String[] Nums = Input.split(" ");
        int Sum = 0;
        for (int i = 0; i < Nums.length; i++) {
            Sum = Sum + Integer.parseInt(Nums[i]);
        }
        System.out.println("HW2.Average is " + Sum / Nums.length);
    }
}
