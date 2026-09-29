package Chapter2;
import java.util.*;
/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/29/2026
 **/

public class CallTech {
    public static void main(String[] args) {
        double talkMinutes;
        int textMessages;
        double data;
        String Output = "";

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number talk Minutes you Need: ");
        talkMinutes = sc.nextDouble();
        System.out.print("Enter the number talk Message you Need: ");
        textMessages = sc.nextInt();
        System.out.print("Enter the number data you Need: ");
        data = sc.nextDouble();

        if (data > 0){
            if(data < 3){
                Output = "Plan E at $79 per month";
            }
            else{
                Output = "Plan F at $87 per month";

            }
        }
        else if(talkMinutes < 300){
            if(textMessages == 0 && data == 0){
                Output = "Plan A at $49 per month";
            }
            else if(textMessages > 0 && data == 0){
                Output = "Plan B at $55 per month";
            }
        }
        else{
            if((textMessages < 50) && data == 0){
                Output = "Plan C at $61 per month";
            }
            else {
                Output = "Plan D at $70 per month";
            }
        }
        System.out.println(Output);
    }

}
