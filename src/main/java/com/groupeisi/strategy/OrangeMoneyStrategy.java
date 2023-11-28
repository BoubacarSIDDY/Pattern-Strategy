package com.groupeisi.strategy;

public class OrangeMoneyStrategy implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paiement avec Orange Money : " + amount);
    }
}