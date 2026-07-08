package com.example;

public class IsOnLightOperation implements LightOperation {
  
  private final Light light;

  public IsOnLightOperation(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.isOn();
  }
}
