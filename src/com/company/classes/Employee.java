package com.company.classes;

/**
 * Created by jpmc on 2/17/2017.
 */
public class Employee extends Person {
    String Department;
    String PayGrade;
    String EmployeeId;

    /*
    public void setDepartment(String department) {
        Department = department;
    }

    public void setPayGrade(String payGrade) {
        PayGrade = payGrade;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getDepartment() {
        return Department;
    }

    public String getPayGrade() {
        return PayGrade;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public String introduceYourself(String fName, String lName){
        return "\nWe will pass, " + fName + " " + lName;
    }*/

    public Employee(){
    }
    public Employee(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }
}
