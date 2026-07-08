package com.example;

import java.util.Iterator;

public class Countries implements Iterable<Country> {

  private final Country[] countries;

  public Countries(Country... countries) {
    this.countries = countries;
  }

  public Country[] getCountries() {
    return this.countries;
  }

  @Override
  public Iterator<Country> iterator() {
    return new CountryIterator(this);
  }

}
