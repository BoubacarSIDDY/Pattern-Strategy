package com.groupeisi;

public class Context {

    private IStrategy iStrategy;

    public void effectuerOperation(){
        System.out.println("************");
        iStrategy.operationStrategy();
        System.out.println("************");
    }

    public void setiStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }
}
