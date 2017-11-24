import java.util.Locale;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args){
        double firstNumber, secondNumber;

        Scanner getNumber = new Scanner(System.in);     // Reading input from command-line
        getNumber.useLocale(Locale.ENGLISH);


        System.out.println("Enter Firts number: ");
        firstNumber = getNumber.nextDouble();
        System.out.println("Your input " + firstNumber + " as a first number.");

        System.out.println("Enter Second number: ");
        secondNumber = getNumber.nextDouble();

        System.out.println("Your input " + secondNumber + " as a second number.");

        System.out.println();
        System.out.println("Your: ");
        double sum = firstNumber + secondNumber;        // Sum
        System.out.println("Sum is " + sum);    // Output: Sum double and double

        double difference = firstNumber - secondNumber;     // Difference
        System.out.println("Difference is " + difference);    // Output: Difference double and double

        double multiplication = firstNumber * secondNumber;     // Multiplication
        System.out.println("Multiplication is " + multiplication);    // Output: Multiplication double and double

        System.out.print("Division is ");   // Output: Division double and double
        if(secondNumber != 0) {             //Check zero-division
            double division = firstNumber / secondNumber;    // Division
            System.out.println(division);    // Output: Division double and double
        }else{
            System.out.println("ERROR");
            System.out.println();
            System.out.println("Division Error! Second input equals Zero. Try again with other number");
        }







    }
}
