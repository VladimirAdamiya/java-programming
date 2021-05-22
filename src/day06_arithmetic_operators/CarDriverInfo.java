package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
       String carModel = "Audi";
       String driverName = "Vladimir";
       String licenceNumber = "A4697854";
       String LicencePlate = "VOVAN1";
       short speed = 180;
       boolean isAutomatic = true;
       char licenceType = 'A';
       System.out.println("Car Model: \t\t\t\t\t"+  carModel);
       System.out.println("LicencePlate# \t\t\t\t"+  LicencePlate);
       System.out.println("Driver Name: \t\t\t\t" +  driverName);
       System.out.println("licence # \t\t\t\t\t" +  licenceNumber);
       System.out.println("Speed \t\t\t\t\t\t" +  speed + " mph");
       System.out.println("Automatic Transmission \t\t" +  true);
       System.out.println("licence Type \t\t\t\t" +  licenceType);

       String firstName = "Adam";
       String lastName = " Smith";
       String fullName = firstName +  lastName;
       System.out.println("My name is " + fullName);


    }
}
