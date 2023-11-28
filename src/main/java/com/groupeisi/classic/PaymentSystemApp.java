package com.groupeisi.classic;

public class PaymentSystemApp {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        // utilisation d'Orange Money
        paymentContext.processPayment("OrangeMoney", 1000);
        // utilisation de Wave Money
        paymentContext.processPayment("WaveMoney", 2000);
        // utilisation de Mobile Money
        paymentContext.processPayment("MobileMoney", 500);
    }
}
