package Chapter4;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/30/2026
 **/

public class ParameterisedMethods {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num, yearOfBirth;

       System.out.println("Enter a number to check if it is even: ");
       num = sc.nextInt();
       System.out.println("Is Even: " + isEven(num));

       yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter year of birth: "));
        System.out.println("Enter a Year of Birth to check your age: ");
        System.out.println("Age: " + getAge(yearOfBirth));

    }

    static int getAge(int yearOfBirth){
        final int CURRENT_YEAR = 2026;
        return CURRENT_YEAR - yearOfBirth;
    }

    static boolean isEven(int num){
        return (num % 2 == 0);
    }
    }
