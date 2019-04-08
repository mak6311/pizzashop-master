package edu.psu.ist;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;

    private String customerName;

    private String customerPhoneNumber;

    //Constructor Method
    public Customer(int _customerId), String _customerName) {
        this.customerId = _customerId;
        this.customerName = _customerName;
    }

        //Setters and Getters
    public int getCustomerId()
            return customerId;
    }

    public void setCustomerId(int _customerId) {
    this.customerId = _customerId;
}

    public String getCustomerName() {
    return customerName;
}

    public void setCustomerName(String _customerName) {
    this.customerName = _customerName;
}


    public static void printCustomer(ArrayList<Customer> cList){
        for (Customer cust: cList){
            System.out.println("Customer Id:" + cust.getCustomerId());
            System.out.println("Customer Name:" + cust.getCustomerName());
        }
    }
    
}
