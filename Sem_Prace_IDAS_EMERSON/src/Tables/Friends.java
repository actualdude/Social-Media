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
public class Friends {
    
    int friend_id;
    int id;
    int users_user_id;
    
    String friends;

    public Friends(int users_id, int users_user_id, int friends_id) {
        this.friend_id = friends_id;
        this.id = users_id;
        this.users_user_id = users_user_id;
    }
    
    public Friends(int friends_id) {
        this.friend_id = friends_id;
    }
   
     public Friends(String friends) {
        this.friends = friends;
    }

    public String getFriends() {
        return friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }

    public int getFriend_id() {
        return friend_id;
    }

    public void setFriend_id(int friend_id) {
        this.friend_id = friend_id;
    }

    public int getId() {
        return id;
    }

    public int getUsers_user_id() {
        return users_user_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsers_user_id(int users_user_id) {
        this.users_user_id = users_user_id;
    }
    
}
