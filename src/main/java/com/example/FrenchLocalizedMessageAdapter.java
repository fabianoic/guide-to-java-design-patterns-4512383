package com.example;

public class FrenchLocalizedMessageAdapter extends FrenchLocalizedMessage
    implements LocalizedMessage {

  @Override
  public void sayHello() {
    sayBonjour();
  }

}
