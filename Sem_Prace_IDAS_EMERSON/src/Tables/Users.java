/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.sql.Date;

/**
 *
 * @author Hidden Treasure
 */
public class Users {

    int user_id;
    String name;
    String surname;
    String gender;
    String user_description;
    Date dob;
    String username;
    String password;

    public Users(int user_id, String name, String surname, String gender, String user_desription, Date dob, String username, String password) {
        this.user_id = user_id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.user_description = user_desription;
        this.dob = dob;
        this.username = username;
        this.password = password;
    }
    
    public Users(String name, String surname, String gender, String user_desription, Date dob, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.user_description = user_desription;
        this.dob = dob;
        this.username = username;
        this.password = password;
    }
    
    public Users(String name) {
        this.name = name;
    }
 
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String toString() {
        return "[USER_ID :] " + user_id
                + " [NAME :] " + name
                + " [SURNAME :] " + surname
                + " [GENDER :] " + gender
                + " [DESCRIPTON :] " + user_description
                + " [DOB :] " + dob;
    }

}
