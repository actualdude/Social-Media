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
public class Study_Plan {
    
    int study_plan_id;
    String study_plan_name;
    int study_dep_id;

    public Study_Plan(int study_plan_id, String study_plan_name, int study_dep_id) {
        this.study_plan_id = study_plan_id;
        this.study_plan_name = study_plan_name;
        this.study_dep_id = study_dep_id;
    }
    
     public Study_Plan(String study_plan_name, int study_dep_id) {
        this.study_plan_name = study_plan_name;
        this.study_dep_id = study_dep_id;
    }
    
    public Study_Plan(String study_plan_name) {
        this.study_plan_name = study_plan_name;
    }

    public int getStudy_plan_id() {
        return study_plan_id;
    }

    public void setStudy_plan_id(int study_plan_id) {
        this.study_plan_id = study_plan_id;
    }

    public String getStudy_plan_name() {
        return study_plan_name;
    }

    public void setStudy_plan_name(String study_plan_name) {
        this.study_plan_name = study_plan_name;
    }
    
    @Override
    public String toString() {
       return "[STUDY_PLAN_ID :] " + study_plan_id +
               " [STUDY_PLAN :] " + study_plan_name;
    }
    
}
