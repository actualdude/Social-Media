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
public class GroupsView {
    
    int user_id;
    String user_name;
    String courses;
    String group_name;
    String group_description;

    public GroupsView(int user_id, String user_name, String courses, String group_name, String group_description) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.courses = courses;
        this.group_name = group_name;
        this.group_description = group_description;
    }
    
    public GroupsView() {

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getGroup_description() {
        return group_description;
    }

    public void setGroup_description(String group_description) {
        this.group_description = group_description;
    }
    
    
    
    
}
