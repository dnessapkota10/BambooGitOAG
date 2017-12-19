package com.oag.dao;

import com.oag.entity.Payment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dinesh Sapkota on 19/12/2017.
 */
public class PaymentDaoImpl implements PaymentDao {
    public List<Payment> getAllPayment() {
        List<Payment> payments = new ArrayList<Payment>();
        payments.add(new Payment(1,"CC",200.5,"TestCustomer1" ));
        payments.add(new Payment(2,"DC",20.3,"TestCustomer2" ));
        return payments;
    }

    public Payment getPayment(int customerId) {
        return new Payment(1,"CC",200.5,"TestCustomer1" );

    }
}
