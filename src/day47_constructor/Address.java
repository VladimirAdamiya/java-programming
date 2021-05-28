package day47_constructor;

public class Address {
    // public static void main(String[] args) {

    // }

        private String street;
        private String city;
        private String state;
        private String zipCode;
        private String country = "USA";

        public Address(){
            System.out.println("Address constructor");
            street = "123 No street";
            city = "bad";
            state = "WS";
            zipCode = "0002";
            country = "USW";
        }
        public String toString() {
            return street + ", " + city + ", " + state + ", " + zipCode + ", " + country;
        }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

