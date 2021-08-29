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
public class Contact {
    
    int contact_id;
    String email;
    String mobile_no;
    String skype;
    int users_id;

    public Contact(int contact_id, String email, String mobile_no, String skype, int users_id) {
        this.contact_id = contact_id;
        this.email = email;
        this.mobile_no = mobile_no;
        this.skype = skype;
        this.users_id = users_id;
    }
    
     public Contact(String email, String mobile_no, String skype) {
        this.email = email;
        this.mobile_no = mobile_no;
        this.skype = skype;
    }
     
     public Contact(String email, String mobile_no, String skype, int users_id) {
        this.email = email;
        this.mobile_no = mobile_no;
        this.skype = skype;
        this.users_id = users_id;
    }

    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
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

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }
    
    @Override
    public String toString() {
       return "[CONTACT_ID :] " + contact_id +
               " [EMAIL :] " + email + 
               " [MOBILE_NO :] " + mobile_no +
               " [SKYPE :] " + skype;
    }
    
    
    
}
