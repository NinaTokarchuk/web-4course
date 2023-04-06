package gof.patterns.behavioral.strategy.paymentSystem.strategy.impl;

import gof.patterns.behavioral.strategy.paymentSystem.data.PaymentData;
import gof.patterns.behavioral.strategy.paymentSystem.strategy.Provider;
import org.springframework.stereotype.Component;

@Component
public class ProviderB implements Provider {
    private static final String PROVIDER_B = "ProviderB";

    @Override
    public boolean isApplicable(String providerName) {
        return providerName.equals(PROVIDER_B);
    }

    @Override
    public String performPayment(PaymentData paymentData) {
        //custom logic
        return PROVIDER_B;
    }
}
