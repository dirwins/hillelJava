package HW4;

import java.util.Locale;
import java.util.Scanner;

public class Students {
    private static Scanner getInput = new Scanner(System.in);

    private static String name;
    private static int[] marks = new int[1];
    private static boolean[] visits = new boolean[1];

    Students(String name, int[] marks, boolean[] visits) {         //  Constructor
        this.name = name;
        this.marks = marks;
        this.visits = visits;

    }

    public String getName() {
        return name;
    }

    protected static String setName() {            // Receiving Name from console
        getInput.useLocale(Locale.ENGLISH);
        name = getInput.next();
//        System.out.println("Your input name is " + name);
        return name;
    }

    protected int[] getMarks() {
        return marks;
    }

    protected static int[] setMarks() {         // Receiving Mark from console
        getInput.useLocale(Locale.ENGLISH);
        int[] MarksTemp;
        if (!getInput.hasNextInt()) {
            System.out.println("Enter Mark as Number...");
            getInput.next();
            setMarks();     // Recursion Call
        } else {
            int Mark = getInput.nextInt();

            if (Mark <= 5 && Mark >= 2) {
                System.out.println("Your input is " + Mark);
                if (marks[0] == 0) {
                    MarksTemp = new int[marks.length];
                    MarksTemp[0] = Mark;
                } else {
                    MarksTemp = new int[marks.length + 1];
                    for (int i = 0; i < MarksTemp.length; i++) {
                        if (i == MarksTemp.length - 1) {
                            MarksTemp[i] = Mark;
                        } else {
                            MarksTemp[i] = marks[i];
                        }
                    }
                }
                marks = MarksTemp;
            } else {
                System.out.println("Incorrect Input. Enter 2, 3, 4 or 5...");
                setMarks();      // Recursion Call
            }
        }
//        for (int i : Marks) {
//            System.out.print(i + " ");
//        }
        return marks;
    }

    protected static String getVisits() {
        getInput.useLocale(Locale.ENGLISH);
        String AP;
        AP = getInput.next();
        //System.out.println(AP);
        return AP;
    }


    protected static boolean[] setVisits() {
        return visits;
    }

}
