package day43_list_custom_classes;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;

//  first name, age
public class Person {
   String firstName;
   int age;
   char gender;
   //behaviour
    public void speak () {
        System.out.println("Person is speaking");
    }

}
class People {
    public static void main(String[] args) {
        // create object of person class - Instantiate Person Class
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 43;
        person2.gender = 'M';
        person2.speak();

        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);

    }
}
