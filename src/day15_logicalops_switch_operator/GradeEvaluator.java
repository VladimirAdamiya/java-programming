package day15_logicalops_switch_operator;

import javax.imageio.stream.ImageInputStream;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';

        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' ) {
            System.out.println("Pass with grade - " + grade);
        } else {
            System.out.println(" Not pass with grade - " + grade);
        }
    }
}
