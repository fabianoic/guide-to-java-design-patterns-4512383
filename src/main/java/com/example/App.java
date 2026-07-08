package com.example;

public class App {

    public static void main(String[] args) {
        var light = new Light();

        var isOnLightOperation = new IsOnLightOperation(light);
        var turnOnLightOperation = new TurnOnLightOperation(light);
        var turnOffLightOperation = new TurnOffLightOperation(light);

        var executor = new LightExecutor();

        executor.addLightOperation(isOnLightOperation);
        executor.addLightOperation(turnOnLightOperation);
        executor.addLightOperation(isOnLightOperation);
        executor.addLightOperation(turnOffLightOperation);
        executor.addLightOperation(isOnLightOperation);

        executor.executeAll();
    }

}
