package day25_Loops;
import java.util.*;
public class StartEnd {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter start and end");
        int start = scan.nextInt();
        int end = scan.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}
