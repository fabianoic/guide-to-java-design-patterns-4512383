package com.example;

public class Recipe {

    public static void main(String[] args) {

        var vegetarianPizza = new VegetarianPizza();
        vegetarianPizza.preparePizza();

        var meatFeastPizza = new MeatFeastPizza();
        meatFeastPizza.preparePizza();

    }

}
