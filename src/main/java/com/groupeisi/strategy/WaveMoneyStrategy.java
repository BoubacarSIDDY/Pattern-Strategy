package com.groupeisi.strategy;

public class WaveMoneyStrategy implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paiement avec Wave Money : " + amount);
    }
}