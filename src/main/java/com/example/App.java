package com.example;

public class App {

    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);

    }

    private static UserInterface createUserInterface(String color) {
        ColorFactory colorFactory = FactoryMaker.userMaker(color);
        Button button = colorFactory.createButton();
        ScrollBar scrollBar = colorFactory.createScrollBar();

        return new UserInterface(button, scrollBar);
    }

}
