import java.util.Locale;
import java.util.Scanner;


public class chess {
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
        System.out.println("Enter width:");
        int width = getSise.nextInt();
        System.out.println("Enter height:");
        int height = getSise.nextInt();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((OddEven(i) && OddEven(j)) || (!OddEven(i) && !OddEven(j))) { // (i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
