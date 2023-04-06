package gof.patterns.behavioral.strategy.paymentSystem.service;

import gof.patterns.behavioral.strategy.paymentSystem.data.PaymentData;

public interface PaymentService {
    String executePayment(PaymentData paymentData);
}
