package com.example;

public class App {

    public static void main(String[] args) {

        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();

        var LightMediator = new LightMediator(pedestrianCrossingLight, trafficLight);

        trafficLight.changeToAmber();
        LightMediator.changeTrafficLightToGreenAndPedestrianToRed();
        trafficLight.changeToAmber();
        LightMediator.changeTrafficLightToRedAndPedestrianToGreen();

    }

}
