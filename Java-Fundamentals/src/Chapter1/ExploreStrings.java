package Chapter1;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/28/2026
 **/

public class ExploreStrings {
    public static void main(String[] args){
        String sentence = " In Java, variables must be declared before they can be used.";

        System.out.println("Length: " + sentence.length());
        System.out.println("Position: " + sentence.indexOf("v"));
        System.out.println("10th position has: " + sentence.charAt(10));


    }
}
