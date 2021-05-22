package day41_array_list;

import day27_Loops.IndexOf;

import javax.management.monitor.MonitorSettingException;
import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Audi");
        myCars.add("Moskvich");
        myCars.add("Tesla");
        myCars.add("jeep");
        myCars.add("Lada");
        myCars.add("yugo");

        //jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla
        System.out.println(myCars.toString());
        String allCarsIn1St = myCars.toString(); // saves all cars in 1 string variable

        System.out.println("allCarsIn1St = " + allCarsIn1St);

        // change index 0 to Lamborghini
        myCars.set(0, "Lamborghini");

        System.out.println("after set = " + myCars.toString());

        // change 4 to Honda
        myCars.set(4, "Honda");

        System.out.println("after set Honda = " + myCars.toString());

        /**
         * How would you do that if myCars was array:
         * myCars[4] = "Honda";
         */
        /**
         * String str = "java';
         * str.indexOf("v") ==> 2
         */
        // find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("Moskvich");
        System.out.println("moskvichIndex" + moskvichIndex);
        System.out.println("after set to jiguli = " + myCars);

        // replace ford with trabant
        // indexOf
        myCars.set(myCars.indexOf("Ford"), "trabant");

        System.out.println("after set to trabant " + myCars);

        // lada -> bugatti
        /*
        ifCars contains lada set value to bugatti

        else
        print "lada is not found
         */
        if (myCars.contains("Lada")) {
            myCars.set(myCars.indexOf("Lada"), "Bugatti");
        } else {
            System.out.println("Lada not found");
        }
        System.out.println("after set bugatti = " + myCars.toString());

        /**
         lamborghini -> prius
         toyota -> lexus
         trabant -> audi
         */
        for(int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("lamborghini")) {
                myCars.set(i, "prius");
            } else if (myCars.get(i).equals("toyota")) {
                myCars.set(i, "lexus");
            } else if (myCars.get(i).equals("trabant")) {
                myCars.set(i , "audi");
            }
        }
        System.out.println("after loop = " + myCars);
    }
}
