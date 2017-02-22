package com.company.classes;


/**
 * Created by jpmc on 2/17/2017.
 */
public class Customer extends Person {

    String customerName;
    String address;
    String telephoneNumber;
    String customerId;

    /*
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }



    public String introduceYourself(String fName,String lName){
        return "\nHi, I'm the " + fName +  " " + lName + ", lord of all cabbages. I demand you to give me back my CABBAGES!!!";
    }*/

    public Customer(){
        }
        public Customer(String fName, String lName){
            this.fName = fName;
            this.lName = lName;
        }

}

