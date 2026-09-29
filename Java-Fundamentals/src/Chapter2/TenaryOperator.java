package Chapter2;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/29/2026
 **/

public class TenaryOperator {
    public static void main(String[] args) {
        int age = 15;
        String feedback;
        if(age >= 18){
            feedback = "You can vote";
        }else{
            feedback = "Hade, you cannot vote";
        }

        feedback = (age>=18) ? "Vote" : "Not Vote";

        System.out.println(feedback);
    }
}
