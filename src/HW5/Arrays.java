package HW5;

import java.util.Locale;
import java.util.Scanner;

public class Arrays {
    private static Scanner getInput = new Scanner(System.in);
//    private static int[] arrayMemory = {5, 6, 9, 5};

    private static void checkAction() {
        System.out.println();
        System.out.println("1.  Add one element");
        System.out.println("2.  Get element by index");
        System.out.println("3.  Contains");
        System.out.println("4.  Add all elements from other array");
        System.out.println("5.  Check equals of arrays");
        System.out.println("6.  Clear");
        System.out.println("7.  Find of index");
        System.out.println("8.  Get size of array");
        System.out.println("9.  Sort array");
        System.out.println();
//        getInputAction();
    }

    private static int getInputAction() {            // Receiving Name from console
        getInput.useLocale(Locale.ENGLISH);
        int input = getInput.nextInt();
        System.out.println("Your input Action is " + input);
        return input;
    }

    private static int getElement() {
        System.out.println("Enter number");
        getInput.useLocale(Locale.ENGLISH);
        int input = getInput.nextInt();
        System.out.println("Your input number is " + input);
        return input;
    }

    private static int[] getArray() {
        System.out.println("Enter numbers using ' ' (spase). For example: [2 4 6 8 10]");
        getInput.useLocale(Locale.ENGLISH);
        String Input = getInput.nextLine();
//        System.out.println(Input);
        String[] array = Input.split(" ");
//        if(array.length == 0) getArray();
        System.out.print("Your array is: ");
        int[] intArray = new int[array.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
             System.out.println(intArray[i]);
        }
        System.out.println();
        return intArray;
    }

    public static void main(String[] args) {
        System.out.println("Array 1 - {5, 6, 9, 5}");
        System.out.println("Array 2 - {7, 1, 2, 3, 8}");
        ArraysActions newArray = new ArraysActions();
        checkAction();
        switch (getInputAction()) {
            case 1:

                ArraysActions.addElement(newArray.getArrayMemory(), getElement());
                break;
            case 2:
                ArraysActions.getIndex(getElement());
                break;

            case 3:
                ArraysActions.contains(getElement());
                break;
            case 4:

                ArraysActions.addAllElements();
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:

            default:
                System.out.println(" Input number between 1 and 9...");


        }


    }
}
