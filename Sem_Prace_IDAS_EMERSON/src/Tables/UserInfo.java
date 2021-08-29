/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.util.Date;

/**
 *
 * @author Hidden Treasure
 */
public class UserInfo {
    
    
    String name;
    String surname;
    String Gender;
    String user_description;
    Date dob;
    String City;
    String email;
    String mobile_no;
    String skype;

    public UserInfo(String name, String surname, String Gender, String user_description, Date dob, String City, String email, String mobile_no, String skype) {
        this.name = name;
        this.surname = surname;
        this.Gender = Gender;
        this.user_description = user_description;
        this.dob = dob;
        this.City = City;
        this.email = email;
        this.mobile_no = mobile_no;
        this.skype = skype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getUser_description() {
        return user_description;
    }

    public void setUser_description(String user_description) {
        this.user_description = user_description;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }
    
    
    
    
}
