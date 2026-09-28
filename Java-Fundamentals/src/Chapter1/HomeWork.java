package Chapter1;
import java.util.*;
/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/28/2026
 **/

public class HomeWork {
    public static void main(){

        double adultMealPrice = 50.00;
        double childMealPrice = 37.50;
        int numberOfAdultMeal;
        int numberOfChildMeal;
        double adultMealTotalAmount;
        double childMealTotalAmount;
        int totalNumberOfMeals;
        double totalPrice;

        //Takes in the number of each meal type
        Scanner sc = new Scanner(System.in);

        //enter the number of Adult meals
        System.out.println("Enter the number of Adult Meals you want: ");
        numberOfAdultMeal = sc.nextInt();

        System.out.println("Enter the number of Child Meals you want: ");
        numberOfChildMeal = sc.nextInt();

        adultMealTotalAmount = numberOfAdultMeal * adultMealPrice;
        childMealTotalAmount = numberOfChildMeal * childMealPrice;
        totalNumberOfMeals = numberOfAdultMeal + numberOfChildMeal;
        totalPrice = adultMealTotalAmount + childMealTotalAmount;

        System.out.println("=============================Receipt=============================");
        System.out.println("Total Number Of Adult Meals Ordered: \t" + numberOfAdultMeal);
        System.out.println("Total Number Of Child Meals Ordered: \t" + numberOfChildMeal);
        System.out.println("Total Number Of Meals Ordered:       \t"  + totalNumberOfMeals);
        System.out.println("=============================Price===============================");
        System.out.println("Total Price Of Adult Meals Ordered: \t" +  adultMealTotalAmount );
        System.out.println("Total Price Of Child Meals Ordered: \t" + childMealTotalAmount );
        System.out.println("Total Price Of Meals Ordered:       \t" +  totalPrice);
        System.out.println("=================================================================");


    }
}
