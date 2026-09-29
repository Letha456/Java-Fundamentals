package Chapter2;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/29/2026
 **/

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Current Value of x: " + x);
        System.out.println("Pre incre x: " + ++x);
        System.out.println("Current Value of x: " + x);
        System.out.println("Pre decre x: " + --x);
        System.out.println("Current Value of x: " + x);

        x = 16;
        System.out.println("Current Value of x: " + x);
        System.out.println("Post incre x: " + x++);
        System.out.println("Current Value of x: " + x);
        System.out.println("Post decre x: " + x--);
        System.out.println("Current Value of x: " + x);
    }
}