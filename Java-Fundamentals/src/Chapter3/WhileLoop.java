package Chapter3;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/30/2026
 **/

public class WhileLoop {
    public static void main(String[] args){
        int x = 1;

        while(x % 3 == 0){
            System.out.println(x + "- Java");
            x += 2;
        }
    }
}
