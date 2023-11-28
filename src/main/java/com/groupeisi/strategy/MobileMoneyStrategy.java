package com.groupeisi.strategy;

public class MobileMoneyStrategy implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paiement avec Mobile Money : " + amount);
    }
}