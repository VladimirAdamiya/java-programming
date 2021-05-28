package day47_constructor;

public class AddressList {
    public static void main(String[] args) {


    Address homeAddress = new Address();

    homeAddress.setStreet("1107 S Old Wilke Rd apt 102");
    homeAddress.setCity("Arlington Heights");
    homeAddress.setState("IL");
    homeAddress.setZipCode("60005");
    homeAddress.setCountry("USA");
        System.out.println("homeAddress: " + homeAddress.toString());
    }
    }
