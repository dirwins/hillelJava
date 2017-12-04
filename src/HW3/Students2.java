package HW3;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Students2 {
    static int group;
//    String Name;
//    String[] Marks;
//    String[] visit;

    private static Scanner getInput = new Scanner(System.in);

    private static int getValueGroup() { // , String Name, String[] Marks, String[] visit
        getInput.useLocale(Locale.ENGLISH);
        int num;
        if (!getInput.hasNextInt()) {      // Check numerical type
            System.out.println("Non-numerical type. Try again.");
            getInput.next();
            num = 0;
            getValueGroup();
        } else {
            num = getInput.nextInt();
            System.out.println("You choose [" + num + "] group");
        }
        return num;
    }

    private static int getValueActoin() { // , String Name, String[] Marks, String[] visit
        getInput.useLocale(Locale.ENGLISH);
        int num;
        if (!getInput.hasNextInt()) {      // Check numerical type
            System.out.println("Non-numerical type. Try again.");
            getInput.next();
            num = 22;
//            getValueGroup();
        } else {
            num = getInput.nextInt();
            System.out.println("You choose the [" + num + "] action");
        }
        return num;
    }

    private static void getChoice() {
        int choice = getValueActoin();
        switch (choice) {
            case 0:
                group = getValueGroup();
                getChoice();
                break;
            case 1:
                addRecord(group);
                break;
            case 2:
//                    deleteRecord();
                break;
            case 3:
//                    containsRecord();
                break;
            case 4:
//                    clear();
                break;
            case 5:
//                    trim();
                break;
            case 6:
//                    merge();
                break;
            case 7:
//                    sortRecords();
                break;
            case 8:
//                    containsAll();
                break;
            case 9:
//                    equalsGroups();
                break;
            case 10:
                    PrintGroup();
                break;

            default:
                System.out.println("Illegal choice.");
                getChoice();
        }
    }

//    private static String groupChoice;
//
//
//    private static String getChoiceGroup(String group) {
//        //groupChoice = group;
//        int Choice;
//        if (group.equals("group1")) {
//            Choice = 0;
//            //System.out.println(group);
//            //setAction();
//            //getChoice(group);
//            return group;
//        }
//        if (group.equals("group2")) {
//            Choice = 1;
//            //setAction();
//            //getChoice(group);
//            return group;
//        } else {
//            System.out.println("unchecked group");
//            return group = null;
//        }
////        System.out.println("Checked group " + group);
////        System.out.println("Choose an action:");
//        //return Choice;;
//
//    }


    private static void addRecord(int group) {

        String[] journalTemp = new String[3];

        System.out.println("Enter Name of student:");
        //String getName = getName().toString();
        //journalTemp[0] = getName;
        String getName = getName();
        journalTemp[0] = getName;
        System.out.println(getName + " is added to group.");



        System.out.println("Enter his marks:");
        String getMarks = getMarks();
        System.out.println(getMarks + " is added for this student.");
        journalTemp[1] = getMarks;

        System.out.println("Enter Visitation of student:");
        String getAP = getAP();
        System.out.println(getAP + " is visitation of this student.");
        journalTemp[2] = getAP;
        System.out.println("Record is added.");

        for (int i = 0; i < journalTemp.length; i++) {
            System.out.print(journalTemp[i] + "    ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Check another action:");
        getChoice();
    }

    private static void deleteRecord() {
        System.out.println("Enter Name of student for deleting:");
//        getName();
        // Deleting function
        System.out.println("Student is deleted");
//        getChoice();
    }

    private static void containsRecord() {
        System.out.println("Contains");
//        getChoice("");
    }

    private static void clear() {
        System.out.println("Clear");
//        getChoice("");
    }

    private static void trim() {
        System.out.println("Trim");
//        getChoice("");
    }

    private static void merge() {
        System.out.println("Merge");
//        getChoice("");
    }

    private static void sortRecords() {
        System.out.println("Sort");
//        getChoice("");
    }

    private static void containsAll() {
        System.out.println("ContainsAll");
//        getChoice("");
    }

    private static void equalsGroups() {
        System.out.println("Equal Groups");
//        getChoice("");
    }

    private static void PrintGroup() {
        //groupChoice = group;
        System.out.println("Print Group");

        //journal1[];


        String[][] journal = journal1("", "", "");
        for (int i = 0; i < journal.length; i++) {
            //System.out.println(journal + "    ");
            for (int j = 0; j < journal[i].length; j++) {
                //journal[i][j] = journal[j][i];
                System.out.print(journal[i][j] + "    ");
            }
            System.out.println();
        }


        getChoice();
    }


    public static void actoinList() {
        System.out.println();
        System.out.println("0.  Change a group");
        System.out.println("1.  Add a student");
        System.out.println("2.  Delete a student");
        System.out.println("3.  Contain a student");
        System.out.println("4.  Clear a group");
        System.out.println("5.  Trim a group");
        System.out.println("6.  Merge a group");
        System.out.println("7.  Sort a group");
        System.out.println("8.  ContainsAll");
        System.out.println("9.  Equals groups");
        System.out.println("10. Print Group");      // Done
        System.out.println();
    }

//    private static String getInput() { // Get number of action
//
//        getInput.useLocale(Locale.ENGLISH);
//        String num;
//        if (!getInput.hasNextLine()) {      // Check numerical type
//            System.out.println("Non-numerical type. Try again.");
//            getInput.next();
//            num = getInput.toString();
//        } else {
//            num = getInput.nextLine();
//            System.out.println("Your choice is [" + num + "]");
//
//        }
//        return num;
//    }

    private static String getName() {
        getInput.useLocale(Locale.ENGLISH);
        String Name;

        Name = getInput.next();
//        System.out.println(Name);
        return Name;
    }

    private static String getMarks() {
        getInput.useLocale(Locale.ENGLISH);
        String Marks;
        Marks = getInput.next();
//        System.out.println(Marks);
        return Marks;
    }

    private static String getAP() {
        getInput.useLocale(Locale.ENGLISH);
        String AP;
        AP = getInput.next();
        //System.out.println(AP);
        return AP;
    }


    private static String[][] journal1(String Name, String marks, String visit) {

        String[][] journal1 = new String[3][];
        String[] firstGroup = {"Ivanov", "Korolev", "Chenkov", "Berezovsky"};
        String[] marks1 = {"5 5 3", "3 5 2", "3 5 4", "5 5 4"};
        String[] visit1 = {"absent", "present", "absent", "present"};

        journal1[0] = firstGroup;
        journal1[1] = marks1;
        journal1[2] = visit1;

        return journal1;
    }

    private static String[][] journal2(String Name, String marks, String visit) {
        String[][] journal2 = new String[3][];
        String[] secondGroup = {"Gorin", "Yakovenko", "Kozarenko", "Kalinichenko"};
        String[] marks2 = {"5 4 5", "4 5 5", "5 3 5", "3 5 4"};
        String[] visit2 = {"present", "present", "absent", "present"};

        journal2[0] = secondGroup;
        journal2[1] = marks2;
        journal2[2] = visit2;

        return journal2;
    }

    public static void main(String[] args) {
        System.out.println("It`s a student`s database.");
        System.out.println("Enter 'group1' or 'group2. ");

        getValueGroup();
        actoinList();
        //Group1.getValueActoin();
        getChoice();

    }
}
