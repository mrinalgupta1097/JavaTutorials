package com.mrinalgupta.dayday6;

public enum PizzaSize {
    Regular, Medium, Large
}

class Pizza{
    private String pizzaName;
    private double price;
    private PizzaSize pizzaSize;

    public Pizza(String pizzaName, double price, PizzaSize pizzaSize) {
        this.pizzaName = pizzaName;
        this.price = price;
        this.pizzaSize = pizzaSize;

    }
    public double checkDiscount(){
        PizzaSize currentSize = this.pizzaSize;
        double discount = 0;

        switch(currentSize){
            case Regular :
                discount = 10;
                break;

            case Medium:
                discount = 20.5;
                break;

            case Large:
                discount = 30.2;
                break;
        }
        return discount;
    }

    public double calculatePriceAfterDiscount(){
        return this.price - ((this.price * checkDiscount())/100);
    }

    public static void main(String[] args) {
        Pizza myPizza = new Pizza("VegOverload", 500, PizzaSize.Medium);
        System.out.println("discount : " + myPizza.checkDiscount());
        System.out.println(myPizza.calculatePriceAfterDiscount());
    }
}