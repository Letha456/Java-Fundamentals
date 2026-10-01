package Chapter4;

import java.util.Scanner;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/30/2026
 **/

public class Homework {
    static String firstName;
    static String lastName;
    static int age;
    static String grade;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        greetings();
        System.out.print("Enter First Name: ");
        String firstName = sc.next();

        System.out.print("Enter Last Name: ");
        String lastName = sc.next();

        System.out.print("Enter Birth Year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter Test Mark: ");
        double testMark = sc.nextDouble();

        int age = determineAge(birthYear);
        String grade = determineGrade(testMark);
        displayOutput(firstName, lastName, age, grade);

        sc.close();
    }

    static void greetings(){
        System.out.println("                Thobela my brother or sister                    " );
        System.out.println("================Welcome to your Grade Calculator================");
    }

    static String determineGrade(double testMark){
        if(testMark < 40){
            return "F";
        }
        else if(testMark >= 40 && testMark < 49){
            return "D-";
        }
        else if(testMark >= 50 && testMark < 59){
            return "D";
        }
        else if(testMark >= 60 && testMark < 69){
            return "C";
        }
        else if(testMark >= 70 && testMark < 79){
            return "B";
        }
        else if(testMark >= 80 && testMark < 89){
            return "A";
        }
        return "A+";
    }

    static int determineAge(int year){
        final int CURRENT_YEAR = 2026;
        return CURRENT_YEAR - year;
    }

    public static void displayOutput(String firstName, String lastName, int age, String grade) {
        System.out.println("==========================================");
        System.out.println("            YOUR DETAILS MFANAKA              ");
        System.out.println("==========================================");
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Age        : " + age);
        System.out.println("Grade      : " + grade);
        System.out.println("==========================================");
    }
}
