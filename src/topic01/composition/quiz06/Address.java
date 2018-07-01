/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic01.composition.quiz06;

/**
 *
 * @author anis
 */
public class Address {
    private Street street;
    private String city;
    private String country;

    public Address(Street street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", city=" + city + ", country=" + country + '}';
    }
}
