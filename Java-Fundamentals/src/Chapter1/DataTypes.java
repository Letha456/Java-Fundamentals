package Chapter1;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/28/2026
 **/

public class DataTypes {
    public static void main(String[] args) {
        int intAge;
        short number = 5;
        long longAge = 25;
        double salary = 5000.00;
        float wage = 5000.00f;
        boolean isEmployed;
        char letter = 'A';
        String day = "Today is Monday";

        intAge = 36;
        isEmployed = false;

        System.out.println("Age (" + intAge + ", " + longAge + ")");
        System.out.println("Salary: " + salary);
        System.out.println("Wage: " + wage);
        System.out.println("Letter: " + letter);
        System.out.println("Day: " + day);
        System.out.println("Number: " + number);

    }
}
