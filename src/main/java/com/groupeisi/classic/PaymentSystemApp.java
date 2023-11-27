package com.groupeisi.classic;

public class PaymentSystemApp {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.processPayment("OrangeMoney", 1000);
    }
}
