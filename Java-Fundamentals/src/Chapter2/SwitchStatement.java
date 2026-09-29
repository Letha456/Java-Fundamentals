package Chapter2;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 9/29/2026
 **/

public class SwitchStatement {
    public static void main(String[] args) {
        String module = "Java";
        String lecturer;

        switch (module){
            case "Java": lecturer = "Smith";
            break;
            case "C#": lecturer = "Carol";
            break;
            case "Python": lecturer = "James";
            break;
            default: lecturer = "Invalid Module";
        }
        System.out.println("Lecturer for module " + module + " is " + lecturer);
    }
}
