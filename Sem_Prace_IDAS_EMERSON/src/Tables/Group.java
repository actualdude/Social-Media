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
public class Group {
    
    int group_id;
    String group_name;
    String description;
    int course_id;

    public Group(int group_id, String group_name, String description, int course_id) {
        this.group_id = group_id;
        this.group_name = group_name;
        this.description = description;
        this.course_id = course_id;
    }
    
     public Group(String group_name, String description, int course_id) {
        this.group_name = group_name;
        this.description = description;
        this.course_id = course_id;
    }
    
    public Group(String group_name, String description) {
        this.group_name = group_name;
        this.description = description;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
    
    @Override
    public String toString() {
       return "[GROUP_ID :] " + group_id +
               " [GROUP_NAME :] " + group_name + 
               " [DESCRIPTION :] " + description;
    }
    
}
