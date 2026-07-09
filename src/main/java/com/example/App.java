package com.example;

public class App {

    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();

        checkoutPage.pay(Payment.payWithCard);
        checkoutPage.pay(Payment.payByBankTransfer);


    }

}
