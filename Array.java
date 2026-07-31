
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks = new int[] { 145, 872, 398 };
        System.out.println(marks[0]);
        System.out.println(marks.length);
        Arrays.sort(marks);
        for(int i = 0; i< marks.length ; i++){
            System.out.println(marks[i]);
        }
    }
}
