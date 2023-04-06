package gof.patterns.behavioral.strategy.paymentSystem.strategy;

import gof.patterns.behavioral.strategy.paymentSystem.data.PaymentData;

public interface Provider {
    boolean isApplicable(String providerName);

    String performPayment(PaymentData paymentData);
}
