import java.util.Scanner;


public class Calculator {
    public static void main(String[] args){
        int firstNumber;    //
        int secondNumber;   //
        Scanner getNumber = new Scanner(System.in);

        System.out.println("Enter Firts number: ");
        firstNumber = getNumber.nextInt();

        System.out.println("Enter Second number: ");
        secondNumber = getNumber.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println("Sum of First Number and Second Number is " + sum);  // Output: Sum int and int
        System.out.println("Difference of First Number and Second Number is " + difference);    // Output: Difference int and int
        System.out.println("Multiplication of First Number and Second Number is " + multiplication);    // Output: Multiplication int and int
        System.out.println("Division of First Number and Second Number is " + division);    // Output: Division int and int

    }
}
