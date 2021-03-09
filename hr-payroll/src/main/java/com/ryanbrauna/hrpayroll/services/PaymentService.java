package com.ryanbrauna.hrpayroll.services;

import com.ryanbrauna.hrpayroll.models.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.00,days);
    }

}
