package com.example;

import com.example.WithdrawalRequest.Currency;

public class App {

    public static void main(String[] args) {
        var europeRequest = new WithdrawalRequest(20, Currency.EUR);
        var atm = atmChain();
        atm.dispense(europeRequest);

        var usRequest = new WithdrawalRequest(50, Currency.USD);

        atm.dispense(usRequest);
    }

    public static ATM atmChain() {
        var usDollarATM = new UsDollarATM(null);
        var euroATM = new EuroATM(usDollarATM);
        return euroATM;
    }

}
