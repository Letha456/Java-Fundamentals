package Chapter1;
import java.util.*;
/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/28/2026
 **/

public class UserInput {
    public static void main(String[] args){
        String name;
        int age;
        double height;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Enter Height: ");
        height = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

    }
}
