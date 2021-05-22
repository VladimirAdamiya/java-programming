package day41_array_list;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare array list -> import Array list utility
        ArrayList<String> cities = new ArrayList<>();
        // add cities to array list -> add method
        cities.add("Washington");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        // add Ashgabat to 0 index
        cities.add(0, "Ashgabat");
        // print all value in the same line
        System.out.println(cities);
        // print first and last city
        System.out.println("first city = " +cities.get(0));
        // find last index using size() -1
        System.out.println("last city = " + cities.get(cities.size()-1));

        // print count of items in array list
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size + " cities in the list");

        // for loop and print all values in same line
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i)+" ");
        }
        System.out.println();
        // for each loop
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();
        // delete item from array list
        // 1. remove using index. delete value at index 3
        cities.remove(3);
        // 2. remove using object/value
        cities.remove("New York");

        System.out.println("after remove = "+ cities);

        // delete/remove all values from the list
        cities.clear();

        System.out.println("after clear the list = " + cities);

        // 3. using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }

        // 4. check size () == 0
        if (cities.size() == 0) {
            System.out.println("city size = " + cities.size());
        }




    }
}
