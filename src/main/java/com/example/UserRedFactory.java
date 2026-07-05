package com.example;

public class UserRedFactory implements ColorFactory {

  @Override
  public Button createButton() {
    return new RedButton();
  }

  @Override
  public ScrollBar createScrollBar() {
    return new RedScrollBar();
  }

}