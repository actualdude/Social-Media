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
public class CourseView {
    
    int courses_course_id;
    String short_name;
    String course_name;
    String department_name;

    public CourseView(int courses_course_id, String short_name, String course_name, String department_name) {
        this.courses_course_id = courses_course_id;
        this.short_name = short_name;
        this.course_name = course_name;
        this.department_name = department_name;
    }
    
    public CourseView() {
    }

    public int getCourses_course_id() {
        return courses_course_id;
    }

    public void setCourses_course_id(int courses_course_id) {
        this.courses_course_id = courses_course_id;
    }
    
    
    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    } 
    
}
