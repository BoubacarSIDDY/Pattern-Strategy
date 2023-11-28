package com.groupeisi.strategy;

public class PaymentSystemAppStrategy {
    public static void main(String[] args) {
        PaymentContextStrategy paymentContextStrategy = new PaymentContextStrategy();
        // utilisation de la méthode de paiement OrangeMoney
        paymentContextStrategy.setPaymentStrategy(new OrangeMoneyStrategy());
        paymentContextStrategy.processPayment(1500);
        // utilisation de la méthode de paiement Mobile Money
        paymentContextStrategy.setPaymentStrategy(new MobileMoneyStrategy());
        paymentContextStrategy.processPayment(500);
        // utilisation de la méthode de WaveMoney
        paymentContextStrategy.setPaymentStrategy(new WaveMoneyStrategy());
        paymentContextStrategy.processPayment(200);
    }
}