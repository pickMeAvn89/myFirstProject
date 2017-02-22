package com.company.classes;

/**
 * Created by jpmc on 2/17/2017.
 */
public class Person {

    String fName;
    String lName;
    String address;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String introduceYourself(String fName, String lName){
        return "\nHello, I'm the Last Airbender" + " " + fName + " " + lName + ".";
    }

    public String introduceYourself(String fName, int age){
        return "\nMy pet " + " " + fName + "is " + age + " years old.";
    }

    public String introduceYourself(String fName, String mName, String lName, int age){
        return "\nI have nothing to do with " +fName + " " +mName + " " +lName + ", a " +age + " years old man.";
    }


    }


