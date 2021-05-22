package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1 = 10;
        num1++; // => + 1 / POST INCREMENT /  increase in value happens afterwards.
        System.out.println("num = " + num1); // => 11
        ++num1; // => + 1 / PRE INCREMENT / it increases variable value first.
        System.out.println("num = " + num1); // => 12

        int num2 = 5;
        num2--; // => - 1 / POST DECREMENT /  decrease in value happens afterwards.
        --num2; // => - 1 / PRE DECREMENT / decrease variable value first.
        System.out.println("num2 = " + num2); // => 3

        int num3 = 8;
        int num4 = num3;
        num3++;
        System.out.println("num4 = " + num4);  // = 8 because of ++num3
        System.out.println("num3 = " + num3);  // = 9 because of ++num3

        int num5 = 4;
        int num6 = num5++;
        System.out.println("num5 = " + num5);  // = 5 because of ++num5
        System.out.println("num6 = " + num6);  // = 4 because of num5++

        int sedan = 10;
        System.out.println(sedan++);
        System.out.println(sedan);

        int trucks = 5;
        System.out.println(++trucks);
        System.out.println(trucks);

        int mynumber = 20;
        System.out.println("my number = " + mynumber);
        // mynumber++;
        System.out.println("my number = " + mynumber);
        System.out.println(mynumber++); // will print old value / 20
        System.out.println(++mynumber); // will print new value / 21

        int mynumber1 = 20;
        int yournumber = mynumber1++;
        System.out.println(mynumber1);
        System.out.println(yournumber);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a); // a = 51
        System.out.println("b = " + b); // b = 23
        System.out.println("c = " + c); // c = 73 / not counting a++, since it's post increase

    }
}
