/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

/**
 *
 * @author Hidden Treasure
 */
public class Address {
    
    int address_id;
    int street_No;
    int post_code;
    String street;
    String city;
    

    public Address(int address_id, String street, int street_No, String city, int post_code) {
        this.address_id = address_id;
        this.street = street;
        this.street_No = street_No;
        this.city = city;
        this.post_code = post_code;
    }

    public Address(String street, int street_No, String city, int post_code) {
        this.street = street;
        this.street_No = street_No;
        this.city = city;
        this.post_code = post_code;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getStreet_No() {
        return street_No;
    }

    public void setStreet_No(int street_No) {
        this.street_No = street_No;
    }

    public int getPost_code() {
        return post_code;
    }

    public void setPost_code(int post_code) {
        this.post_code = post_code;
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
    
    @Override
    public String toString() {
        return  "[ADDRESS_ID :] " + address_id + 
                " [STREET :] " + street + 
                " [STREET_NO :] " + street_No + 
                " [CITY :] "  + city + 
                " [POST_CODE :] " + post_code;
    }

}
