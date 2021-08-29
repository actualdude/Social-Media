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
public class CommentsView {
    
    int comment_id;
    String user_name;
    String email;
    String comments;
    Timestamp date_posted;
    String like_data;
    String group_name;

    public CommentsView(int comment_id, String user_name, String email, String comments, Timestamp date_posted, String like_data, String group_name) {
        this.comment_id = comment_id;
        this.user_name = user_name;
        this.email = email;
        this.comments = comments;
        this.date_posted = date_posted;
        this.like_data = like_data;
        this.group_name = group_name;
    }
    
     public CommentsView() {

    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Timestamp getDate_posted() {
        return date_posted;
    }

    public void setDate_posted(Timestamp date_posted) {
        this.date_posted = date_posted;
    }

    public String getLike_data() {
        return like_data;
    }

    public void setLike_data(String like_data) {
        this.like_data = like_data;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }
    
}
