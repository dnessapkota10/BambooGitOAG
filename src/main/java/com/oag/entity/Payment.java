package com.oag.entity;

import java.util.Date;

/**
 * Created by Dinesh Sapkota on 19/12/2017.
 */

public class Payment {
    private int customerId;
    private String paymentType;
    private double paymentAmount;
    private String customerName;

    public Payment(int customerId, String paymentType, double paymentAmount, String customerName){
        this.customerId = customerId;
        this.paymentType = paymentType;
        this.paymentAmount = paymentAmount;
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    private Date payDate;

}
