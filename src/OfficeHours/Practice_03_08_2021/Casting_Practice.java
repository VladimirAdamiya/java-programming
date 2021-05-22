package OfficeHours.Practice_03_08_2021;

public class Casting_Practice {
    public static void main(String[] args) {
        byte b = 10;
        short s = b; // automatically converting to biggest
        byte d = (byte)s; // to able to change needs to cast it to (byte)

        //float f = 3.54;  // not going to work
        float f1 = 3.54f;  // will work
        float f2 = (float)3.54;  // will work



    }
}
