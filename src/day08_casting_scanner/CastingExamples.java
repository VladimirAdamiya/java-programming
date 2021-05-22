package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
        byte num1 = 100;
        short num2 = num1;
        int num3 = num2;
        System.out.println();
        System.out.println();
        System.out.println("num3 = " + num3);

        int num4 = 55;
        byte num5 = (byte)num4;
        System.out.println(num4);

        int num10 = 22;
        byte num11 = (byte)num10;
        int num12 = (int)num10;
        System.out.println(num10);
        System.out.println(num11);
        System.out.println(num12);

        double num13 = 1234.5;
        int num14 = (int)num13;
        System.out.println(num14);

        int num15 = 300;
        byte num16 = (byte)num15;
        System.out.println(num16);

        char letter = 'M';
        int numLetter = letter;
        System.out.println(numLetter);
    }
}
