package com.example;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {

  private Countries countries;
  private Integer index;

  public CountryIterator(Countries countries) {
    this.countries = countries;
    index = 0;
  }

  @Override
  public boolean hasNext() {
    return index < (countries.getCountries().length);
  }

  @Override
  public Country next() {
    if (!hasNext()) {
      return null;
    }
    return countries.getCountries()[index++];
  }

  public void iterate() {
    while (hasNext()) {
      System.out.println(next().getName());
    }
    index = 0;
  }

  public void iterateWithoutFirstLetterEqualsTo(String letter) {
    while (hasNext()) {
      Country country = next();
      if (!country.getName().startsWith(letter)) {
        System.out.println(country.getName());
      }
    }
    index = 0;
  }

}
