package com.example;

public class App {

    public static void main(String[] args) {

        var india = new Country("India");
        var poland = new Country("Poland");
        var nigeria = new Country("Nigeria");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");

        var countries = new Countries(india, poland, nigeria, canada, argentina);
        var countryIterator = new CountryIterator(countries);

        countryIterator.iterate();
        System.out.println("");
        countryIterator.iterateWithoutFirstLetterEqualsTo("C");
    }

}
