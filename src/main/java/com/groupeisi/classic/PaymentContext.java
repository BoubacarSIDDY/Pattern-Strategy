package com.groupeisi.classic;

public class PaymentContext {

    public void processPayment(String paymentMethod, double amount){
        if("OrangeMoney".equals(paymentMethod)){
            // méthode de paiement avec Orange Money
            System.out.println("Paiement avec Orange Money : " + amount);
        } else if ("MobileMoney".equals(paymentMethod)) {
            // méthode de paiement avec Mobile Money
            System.out.println("Paiement avec Mobile Money : " + amount);
        } else if ("WaveMoney".equals(paymentMethod)) {
            // méthode de paiement avec Mobile Money
            System.out.println("Paiement avec Wave Money : " + amount);
        }else if ("WizallMoney".equals(paymentMethod)) {
            // méthode de paiement avec Mobile Money
            System.out.println("Paiement avec Wizall Money : " + amount);
        }else{
            System.out.println("Moyen de paiement non pris en charge : " + paymentMethod);
        }
    }
}
