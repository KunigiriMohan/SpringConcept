package com.demo.springconcepts.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Component : Creting Component of SpringConceptSApplications.
 * @Autowired : To intialize variables of setters.
 */
@Component
public class EmployeeBean {
    private int eid;
    private String ename;
    @Autowired
    private DepartmentBean deptBean;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
    /**
     * Constructer of EmployeeBean Class
     */
    public EmployeeBean(){}
    /**
     * Getters and Setters of Variables
     * @param deptBean
     */
    @Autowired
    public EmployeeBean(DepartmentBean deptBean){
        logger.trace("Autowiring by using @Autowire annotation on Constructer");
        this.deptBean = deptBean;
    }

    public int getEid(){
        return eid;
    }

    public void setid(int eid){
        this.eid=eid;
    }

    public String getEname(){
        return ename;
    }

    public void setEname(String ename){
        this.ename = ename;
    }

    public DepartmentBean getDepartmentBean(){
        return deptBean;
    }

    @Autowired
    public void setDeptBean(DepartmentBean deptBean){
        logger.trace("Autowiring by using @Autwire annotation on setter");
        this.deptBean = deptBean;
    }
    /**
     * method to show details of Employee
     */
    public void showEmployeeDetails(){
        logger.debug("Employee Id : {} ",eid);
        logger.debug("Employee Name : {}",ename);
        deptBean.setDeptName("Information Technology");
        logger.debug("Department : {}",deptBean.getDeptName());
    }
}
