package com.example;

public class App {

    public static void main(String[] args) {
        var context = "hello world";
        var result = new SentenceShouldEndWithAPeriod().interpret(context);
        System.out.println(result);
    }

}
