/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDL;

/**
 *
 * @author Polid
 */
public class Adress {
    public final int ID=1;
    private int id;
    private int number;
    private String street;
    private String city;
    private String postalCode;

    public Adress(int number, String street, String city, String postalCode) {
        this.id=ID+this.id;
        this.number = number;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Adress{" + "number=" + number + ", street=" + street + ", city=" + city + ", postalCode=" + postalCode + '}';
    }
    
    
}
