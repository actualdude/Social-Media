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
public class Messages {
    
    int message_id;
    String content;
    String user_id;
    String id;
    Timestamp date_posted;

    public Messages(int message_id, String content, String user_id, String id, Timestamp date_posted) {
        this.message_id = message_id;
        this.content = content;
        this.user_id = user_id;
        this.id = id;
        this.date_posted = date_posted;
    }
    
    public Messages(String content, String user_id, String id, Timestamp date_posted) {
        this.content = content;
        this.user_id = user_id;
        this.id = id;
        this.date_posted = date_posted;
    }

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getDate_posted() {
        return date_posted;
    }

    public void setDate_posted(Timestamp date_posted) {
        this.date_posted = date_posted;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUsers_id(String user_id) {
        this.user_id = user_id;
    }
    
    @Override
    public String toString() {
       return "[MESSAGE_ID :] " + message_id+
               " [CONTENT :] " + content + 
               " [DATE_POSTED :] " + date_posted;
    }
    
}
