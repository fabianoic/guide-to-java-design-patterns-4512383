package com.example;

public class LightMediator {

  private final PedestrianCrossingLight pedestrianCrossingLight;
  private final TrafficLight trafficLight;

  public LightMediator(PedestrianCrossingLight pedestrianCrossingLight, TrafficLight trafficLight) {
    this.pedestrianCrossingLight = pedestrianCrossingLight;
    this.trafficLight = trafficLight;
  }

  public void changeTrafficLightToGreenAndPedestrianToRed() {
    pedestrianCrossingLight.changeToRed();
    trafficLight.changeToGreen();
  }

  public void changeTrafficLightToRedAndPedestrianToGreen() {
    trafficLight.changeToRed();
    pedestrianCrossingLight.changeToGreen();
  }

}
