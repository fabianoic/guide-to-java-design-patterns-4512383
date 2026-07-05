package com.example;

public class UserBlueFactory implements ColorFactory {

  @Override
  public Button createButton() {
    return new BlueButton();
  }

  @Override
  public ScrollBar createScrollBar() {
    return new BlueScrollBar();
  }

}