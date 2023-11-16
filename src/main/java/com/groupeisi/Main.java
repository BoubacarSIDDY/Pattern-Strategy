package com.groupeisi;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setiStrategy(new StrategyImpl1());
        context.effectuerOperation();
        context.setiStrategy(new StrategyImpl2());
        context.effectuerOperation();
    }
}