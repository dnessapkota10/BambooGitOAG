package com.oag.dao;

import com.oag.entity.Payment;

import java.util.List;

/**
 * Created by Dinesh Sapkota on 19/12/2017.
 */
public interface PaymentDao {

    public List<Payment> getAllPayment();
    public Payment getPayment(int customerId);

}
