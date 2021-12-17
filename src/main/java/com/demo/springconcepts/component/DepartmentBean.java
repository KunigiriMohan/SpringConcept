package com.demo.springconcepts.component;


import org.springframework.stereotype.Component;
/**
 * @Component : Annotation for Creating Department Component i.e DepartmentBean.
 */
@Component
public class DepartmentBean {
    private String deptName;
    /**
     * Getters and Setters for getting nd intialising Variables of Deapartment class
     * 
     */
    public String getDeptName(){
        return deptName;
    }

    public void setDeptName(String deptName){
        this.deptName = deptName;
    }
}