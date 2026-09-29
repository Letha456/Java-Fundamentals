package Chapter2;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/29/2026
 **/

public class ExploreOperators {
    public static void main(String[] args){
        int a, b;
        a = 5;
        b =15;
        System.out.println("-----------assign-------------");
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);

        a += 5;
        b += 2;
        System.out.println("-----------+-------------");
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);
        a -= 5;
        b -= 2;
        System.out.println("-------------------------");
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);
        a *= 2;
        b *= 3;
        System.out.println("-----------*-------------");
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);
        a /= 7;
        b /= 6;
        System.out.println("-----------/-------------");
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);

    }
}
