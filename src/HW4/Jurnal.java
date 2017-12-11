package HW4;

import java.util.Locale;
import java.util.Scanner;

public class Jurnal {
    private static Scanner getInput = new Scanner(System.in);
    private static Students Student = new Students(Students.setName(), Students.setMarks(), Students.setVisits());
    private static Students[] studentsArray = new Students[0];

    //    private static int getValueGroup() { // , String Name, String[] Marks, String[] visit
//        getInput.useLocale(Locale.ENGLISH);
//        int num;
//        if (!getInput.hasNextInt()) {      // Check numerical type
//            System.out.println("Non-numerical type. Try again.");
//            getInput.next();
//            num = 0;
//            getValueGroup();
//        } else {
//            num = getInput.nextInt();
//            System.out.println("You choose [" + num + "] group");
//        }
//        return num;
//    }
//
//
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

//    private static String getName() {
//        getInput.useLocale(Locale.ENGLISH);
//        String Name;
//
//        Name = getInput.next();
////        System.out.println(Name);
//        return Name;
//    }
//
//    private static String getMarks() {
//        getInput.useLocale(Locale.ENGLISH);
//        String Marks;
//        Marks = getInput.next();
////        System.out.println(Marks);
//        return Marks;
//    }
//
//    private static String getAP() {
//        getInput.useLocale(Locale.ENGLISH);
//        String AP;
//        AP = getInput.next();
//        //System.out.println(AP);
//        return AP;
//    }


    private static void getChoice() {
//        if (!group.equals("group1") || !group.equals("group2")) {

        int choice = getValueActoin();  // = getInput();
        switch (choice) {
            case 1:
                studentsArray = addStudent();
                getChoice();
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
                    getChoice();
                break;

//                case "group1":
////                    groupChoice = "group1";
//                    inputAction();
////                    getChoice(groupChoice);
//                    break;
//                case "group2":
////                    groupChoice = "group2";
//                    inputAction();
////                    getChoice(groupChoice);
//                    break;

            default:
                System.out.println("Illegal choice.");
                getChoice();
        }
//        } else {
//            System.out.println("oooooooooo");
//        }

    }

    private static Students[] addStudent() {
        Students[] studentsArrayTemp;

        String name;
        int[] marks;
        boolean[] visits;
        System.out.println("Enter Name of new student...");
        name = Students.setName();
        System.out.println("Enter his first Mark (like as 2, 3, 4, 5), if it is...");
        marks = Students.setMarks();
        System.out.println("Enter his visitation('+' is present, '-' is absent), if it is...");
        visits = Students.setVisits();
//        System.out.println("Name: " + Student.name + "     Marks: " + Student.marks + "     Visits: " + Student.visits);
        if(studentsArray.length == 0){
            studentsArrayTemp = new Students[studentsArray.length+1];
            studentsArrayTemp[0] = Student;
        }else{
            studentsArrayTemp = new Students[studentsArray.length + 1];
            for(int i=0; i < studentsArrayTemp.length; i++) {
                if(i == studentsArrayTemp.length-1) {
                    studentsArrayTemp[studentsArrayTemp.length - 1] = Student;
                }else{
                    studentsArrayTemp[i] = studentsArray[i];
                }
            }
        }
        studentsArray = studentsArrayTemp;
        return studentsArrayTemp;
    }

    private static void PrintGroup(){
        for (int i = 0; i < studentsArray.length; i++){
            System.out.print(studentsArray[i].getName() + "     ");
            for (int j = 0; j < studentsArray[i].getMarks().length; j++){
                System.out.print(studentsArray[i].getMarks()[j] + " ");
            }
            System.out.println();
        }
    }

    private static void inputAction() {

        System.out.println();
        System.out.println("1.  Add a student");
        System.out.println("2.  Delete a student    //not released");
        System.out.println("3.  Contain a student    //not released");
        System.out.println("4.  Clear a group    //not released");
        System.out.println("5.  Trim a group    //not released");
        System.out.println("6.  Merge a group    //not released");
        System.out.println("7.  Sort a group    //not released");
        System.out.println("8.  ContainsAll    //not released");
        System.out.println("9.  Equals groups    //not released");
        System.out.println("10. Print Group");
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("It`s a Journal.");
        System.out.println("Check an actoin:");
//        inputAction();
        getChoice();
//        Students Student = new Students();
//        Student.setName();
//        Student.setMarks();
//        System.out.println(Student.getName());
//        System.out.println(Student.getMarks());
//        System.out.println(Student.getVisits());

    }
}
