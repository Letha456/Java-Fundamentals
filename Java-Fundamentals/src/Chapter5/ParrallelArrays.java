
package Chapter5;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/1/2026
 **/


public class ParrallelArrays {
    public static void main(String[] args) {
        String[] arStudents = new String[]{"John", "Kate", "Jessica", "Lerato", "Carol"};
        int[] arTest1 = new int[]{74, 69, 85, 78, 96};
        int[] arTest2 = new int[]{63, 56, 90, 87, 74};
        int[] arTest3 = new int[]{70, 74, 73, 94, 81};

        int size = arStudents.length;
        System.out.println("Name\tTest 1\tTest 2\tTest 3" +
                "\n----------------------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(arStudents[i] + "\t\t" + arTest1[i] + "\t\t" + arTest2[i] + "\t\t"
                    + arTest3[i]);
        }
    }
}