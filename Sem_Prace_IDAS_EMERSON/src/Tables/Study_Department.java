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
public class Study_Department {
    
    int department_id;
    String department_name;

    public Study_Department(int department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
    }
    
    public Study_Department(String department_name) {
        this.department_name = department_name;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    
    @Override
    public String toString() {
       return "[DEPARTMENT_ID :] " + department_id +
               " [DEPARTMENT_NAME :] " + department_name;
    }
    
}
