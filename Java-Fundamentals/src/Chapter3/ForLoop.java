package Chapter3;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/30/2026
 **/

public class ForLoop {
    public static void main(String[] args){
        for(int x = 1; x <= 5; x++){
            System.out.println(x + " - Java");
        }

        for(int x = 1, y = 10;x <= 5; x++,y--){
            System.out.println(x + " - " + y);
        }

    }
}
