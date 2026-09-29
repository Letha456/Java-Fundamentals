package Chapter2;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/29/2026
 **/

public class NestIfStatement {
    public static void main(String[] args) {

        int creditScore = 500;
        int salary = 15000;
        boolean employmentStatus = true;
        String d = "Declined";

        if (employmentStatus) {
            if(salary >= 15000){
                if(creditScore >=600){
                    d = "Approved";
                }else if (creditScore >= 500 && creditScore <=599){
                    d = "Eish atleast wa zama so Approved";
                }else{
                    d = "try mashonisa cause your credit score is low";
                }
            }else {
                d = "need atleast 15k";
            }
        }else{
            d = "forget about it mfana";
        }
    }
}
