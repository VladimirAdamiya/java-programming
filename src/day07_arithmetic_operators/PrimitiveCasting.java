package day07_arithmetic_operators;

public class PrimitiveCasting {
    public static void main(String[] args){

        int n1 = 4;
        byte b1 = (byte) n1;

        byte b2 = 55;
        int n2 = b2;
        System.out.println(b1);
        System.out.println(n2);

        int num1 = 100;
        byte b3 = (byte)num1;
        short s1 = (short)b3;
        System.out.println(b3);
    }
}
