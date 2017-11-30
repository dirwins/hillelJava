package HW1;

import java.util.Locale;
import java.util.Scanner;


public class Calculator {
    private static Scanner getNumber = new Scanner(System.in);


    private static double getNcheck() { // Get number from Console
        getNumber.useLocale(Locale.ENGLISH);
        double num;
        System.out.println("Enter number:");
        if (!getNumber.hasNextDouble()) {      // Check numerical type firstNumber
            System.out.println("Non-numerical type. Try again.");
            getNumber.next();
            num = getNcheck();
        } else {
            num = getNumber.nextDouble();
        }
        return num;
    }

    private static char getAction() { // Get action from Console
        System.out.println("Enter an action(operation):");
        char operation;
        if (getNumber.hasNext()) {
            operation = getNumber.next().charAt(0);
        } else {
            System.out.println("Error. Wrong operation!");
            operation = getAction();
        }
        return operation;
    }


    private static double Calc(double N1, double N2, char operation) { // Calculate result
        double result;

        switch (operation) {
            case '+':
                result = SumCalc(N1, N2);
                System.out.println("Sum is " + result);
                break;
            case '-':
                result = DifferenceCalc(N1, N2);
                System.out.println("Difference is " + result);
                break;
            case '*':
                result = MultiplicationCalc(N1, N2);
                System.out.println("Multiplication is " + result);
                break;
            case '/':
                result = DivisionCalc(N1, N2);
                System.out.print("Division is " + result);
                break;
            default:
                System.out.println("Unavailable action. Try again.");
                result = Calc(N1, N2, getAction());
        }
        return result;

    }

    private static double SumCalc(double firstN, double secondN) {
        double Sum;
        Sum = firstN + secondN;
        return Sum;
    }

    private static double DifferenceCalc(double firstN, double secondN) {
        double Difference;
        Difference = firstN - secondN;
        return Difference;
    }

    private static double MultiplicationCalc(double firstN, double secondN) {
        double Multiplication;
        Multiplication = firstN * secondN;
        return Multiplication;
    }

    private static double DivisionCalc(double firstN, double secondN) {
        double Division;
        while (secondN == 0) { // Сheck the division by zero
            System.out.println("Division Error! Second input equals Zero. Try again with other number");
            secondN = getNcheck();
        }
        Division = firstN / secondN;
        return Division;
    }


    public static void main(String[] args) {
        double getN1 = getNcheck(); // Get first number
        double getN2 = getNcheck(); // Get second number
        Calc(getN1, getN2, getAction()); // Calculate result
    }
}
