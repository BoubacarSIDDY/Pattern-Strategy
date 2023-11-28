package com.groupeisi.strategy;

public class PaymentContextStrategy {
    private IPaymentStrategy IPaymentStrategy;

    public void processPayment(double amount){
        IPaymentStrategy.pay(amount);
    }

    public void setPaymentStrategy(IPaymentStrategy IPaymentStrategy) {
        this.IPaymentStrategy = IPaymentStrategy;
    }
}