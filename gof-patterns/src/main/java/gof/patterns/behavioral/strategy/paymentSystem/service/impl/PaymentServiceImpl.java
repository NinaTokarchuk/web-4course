package gof.patterns.behavioral.strategy.paymentSystem.service.impl;

import gof.patterns.behavioral.strategy.paymentSystem.data.PaymentData;
import gof.patterns.behavioral.strategy.paymentSystem.strategy.Provider;
import gof.patterns.behavioral.strategy.paymentSystem.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private List<Provider> providers;

    @Override
    public String executePayment(final PaymentData paymentData) {
        //THE PREVIOUS CODE (WHICH NEEDS TO BE REFACTORED PER TASK) IS COMMENTED BELOW
//        String result;
//        if (paymentData.getPaymentProvider().equals("ProviderA")) {
//            result = providerA.doExecutePayment(paymentData.getCardHolder(), paymentData.getCvv2(), paymentData.getDollarsToPay(),
//                    paymentData.getCardNumber());
//        } else if (paymentData.getPaymentProvider().equals("ProviderB")) {
//            return providerB.makePaymentHappen(paymentData.getCvv2(), paymentData.getCardNumber(), paymentData.getCardHolder(),
//                    paymentData.getDollarsToPay(), true);
//        }
//        if (isNotBlank(result)) {
//            return result;
//        }
//        if (paymentData.getPaymentProvider().equals("ProviderC")) {
//            return providerC.chargeMoneyFromCard(paymentData.getCvv2(), paymentData.getCardNumber(),
//                    paymentData.getDollarsToPay() * 0.35);
//        }
//        // This will never happen as per design document in 2016 this situation is not possible
//        return "Success";

        String providerName = paymentData.getPaymentProvider();
        return providers.stream()
                .filter(provider -> provider.isApplicable(providerName))
                .findFirst()
                .map(provider -> provider.performPayment(paymentData))
                .orElseThrow(UnsupportedOperationException::new);
    }
}


