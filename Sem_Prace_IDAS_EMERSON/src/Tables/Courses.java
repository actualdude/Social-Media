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
public class Courses {
    
    int courses_id;
    String name;
    String short_name;

    public Courses(int courses_id, String name, String short_name) {
        this.courses_id = courses_id;
        this.name = name;
        this.short_name = short_name;
    }
    
    public Courses(String name, String short_name) {
        this.name = name;
        this.short_name = short_name;
    }
    
    public Courses(String short_name) {
        this.short_name = short_name;
    }

    public int getCourses_id() {
        return courses_id;
    }

    public void setCourses_id(int courses_id) {
        this.courses_id = courses_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }
    
    
    @Override
    public String toString() {
       return "[COURSES_ID :] " + courses_id +
               " [SHORT_NAME :] " + short_name + 
               " [NAME :] " + name;
    }
    
    
}
