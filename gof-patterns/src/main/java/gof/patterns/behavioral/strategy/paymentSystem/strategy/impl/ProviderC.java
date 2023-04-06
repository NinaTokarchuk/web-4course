package gof.patterns.behavioral.strategy.paymentSystem.strategy.impl;

import gof.patterns.behavioral.strategy.paymentSystem.data.PaymentData;
import gof.patterns.behavioral.strategy.paymentSystem.strategy.Provider;
import org.springframework.stereotype.Component;

@Component
public class ProviderC implements Provider {
    private static final String PROVIDER_C = "ProviderC";

    @Override
    public boolean isApplicable(String providerName) {
        return providerName.equals(PROVIDER_C);
    }

    @Override
    public String performPayment(PaymentData paymentData) {
        //custom logic
        return PROVIDER_C;
    }
}
