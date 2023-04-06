package gof.patterns.behavioral.strategy.paymentSystem;

import gof.patterns.behavioral.strategy.paymentSystem.config.SpringConfig;
import gof.patterns.behavioral.strategy.paymentSystem.data.PaymentData;
import gof.patterns.behavioral.strategy.paymentSystem.service.PaymentService;
import gof.patterns.behavioral.strategy.paymentSystem.service.impl.PaymentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        PaymentData data = new PaymentData("ProviderB");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PaymentService paymentService = context.getBean(PaymentServiceImpl.class);
        String result = paymentService.executePayment(data);
        System.out.println(result);
    }
}
