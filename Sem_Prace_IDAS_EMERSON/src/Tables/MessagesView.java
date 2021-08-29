/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.sql.Timestamp;

/**
 *
 * @author Hidden Treasure
 */
public class MessagesView {

    int message_id;
    String message_content;
    Timestamp date_posted;
    String user_name;

    public MessagesView(int message_id, String message_content, Timestamp date_posted, String user_name) {
        this.message_id = message_id;
        this.message_content = message_content;
        this.date_posted = date_posted;
        this.user_name = user_name;
    }
    
    public MessagesView() {

    }

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Timestamp getDate_posted() {
        return date_posted;
    }

    public void setDate_posted(Timestamp date_posted) {
        this.date_posted = date_posted;
    }

}
