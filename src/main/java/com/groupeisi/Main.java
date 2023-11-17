package com.groupeisi;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        context.setiStrategy(new StrategyImpl1());
        context.effectuerOperation();
        context.setiStrategy(new StrategyImpl2());
        context.effectuerOperation();

        // 2ème méthode :
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Quelle strategie ? ");
            String className = scanner.nextLine();
            IStrategy iStrategy = (IStrategy) Class.forName(className).getConstructor().newInstance();
            context.setiStrategy(iStrategy);
            context.effectuerOperation();
        }
    }

    // Raison d'utilisation : Quand un objet doit pouvoir faire varier une partie de son algorithme dynamiquement
}