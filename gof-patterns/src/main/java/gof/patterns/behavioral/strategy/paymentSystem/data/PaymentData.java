package gof.patterns.behavioral.strategy.paymentSystem.data;

import java.util.Date;

public class PaymentData {
    private String paymentProvider;
    private String cardHolder;
    private String cardNumber;
    private Date expiryDate;
    private String cvv2;
    private Double dollarsToPay;

    public PaymentData() {
    }

    public PaymentData(String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public String getPaymentProvider() {
        return paymentProvider;
    }

    public void setPaymentProvider(String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public Double getDollarsToPay() {
        return dollarsToPay;
    }

    public void setDollarsToPay(Double dollarsToPay) {
        this.dollarsToPay = dollarsToPay;
    }

}