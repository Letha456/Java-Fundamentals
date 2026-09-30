package Chapter3;
import java.util.*;
/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/30/2026
 **/

public class RetirementGoal {
    public static void main(String[] args){
        double numberOfYearsUntilRetirement;
        double amountToSaveAnnually;
        double totalRetirementAmount;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of years until retirement: ");
        numberOfYearsUntilRetirement = sc.nextDouble();
        while (numberOfYearsUntilRetirement <= 0) {
            System.out.print("INVALID NUMBER OF YEARS. Enter number of years until retirement (> 0): ");
            numberOfYearsUntilRetirement = sc.nextDouble();
        }

        // Prompt and validate annual savings amount
        System.out.print("Enter the amount of money you can save annually: ");
        amountToSaveAnnually = sc.nextDouble();
        while (amountToSaveAnnually <= 0) {
            System.out.print("INVALID AMOUNT. Enter  the amount of money you can save annually(> 0): ");
            amountToSaveAnnually = sc.nextDouble();
        }
        totalRetirementAmount = numberOfYearsUntilRetirement * amountToSaveAnnually;
        System.out.println("======================================================");
        System.out.println("                Retirement Goal                       ");
        System.out.println("======================================================");
        System.out.println("Number Of Years Till Retirement: \t" + numberOfYearsUntilRetirement);
        System.out.println("Amount Of Money at Retirement: \t" + totalRetirementAmount);
        System.out.println("======================================================");

        sc.close();

    }
}
