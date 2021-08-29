/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.time.LocalDateTime;

/**
 *
 * @author Hidden Treasure
 */
public class Comments {
    
    
    int comment_id;
    int users_id;
    int group_group_id;
    String content;
    int comments_comment_id;
    LocalDateTime dateposted;

    public Comments(int comment_id, String content, LocalDateTime dateposted, int comments_comment_id, int users_id, int group_group_id) {
        this.comment_id = comment_id;
        this.users_id = users_id;
        this.group_group_id = group_group_id;
        this.content = content;
        this.comments_comment_id = comments_comment_id;
        this.dateposted = dateposted;
    }
    
      public Comments(String content, LocalDateTime dateposted, int comments_comment_id, int users_id, int group_group_id) {
        this.users_id = users_id;
        this.group_group_id = group_group_id;
        this.content = content;
        this.comments_comment_id = comments_comment_id;
        this.dateposted = dateposted;
    }
      
          public Comments(int comment_id, String content, LocalDateTime dateposted) {
        this.comment_id = comment_id;
        this.content = content;
        this.dateposted = dateposted;
    }
  
    public Comments(String content) {
        this.content = content;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public int getGroup_group_id() {
        return group_group_id;
    }

    public void setGroup_group_id(int group_group_id) {
        this.group_group_id = group_group_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getComments_comment_id() {
        return comments_comment_id;
    }

    public void setComments_comment_id(int comments_comment_id) {
        this.comments_comment_id = comments_comment_id;
    }

    public LocalDateTime getDateposted() {
        return dateposted;
    }

    public void setDateposted(LocalDateTime dateposted) {
        this.dateposted = dateposted;
    }

    @Override
    public String toString() {
       return "[COMMENT_CHAT_ID :] " + comment_id +
               " [COMMENTS :] " + content + 
               " [DATE_POSTED :] " + dateposted;
    }
    
    
    
    
}
