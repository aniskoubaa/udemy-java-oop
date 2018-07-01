package topic03.polymorphism.contractfirst.util;



public class Address {
     
    private Street street;
    private String City;
    private String Country;
    private int zipCode;

    public Address(Street street, String City, String Country, int zipCode) {
        this.street = street;
        this.City = City;
        this.Country = Country;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", City=" + City + ", Country=" + Country + ", zipCode=" + zipCode + "}";
    }
    

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
    
}
