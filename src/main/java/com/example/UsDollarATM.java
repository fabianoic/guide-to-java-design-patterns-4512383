package com.example;

public class UsDollarATM extends ATM {

    public UsDollarATM(ATM nextCurrencyATM) {
        super(nextCurrencyATM);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == WithdrawalRequest.Currency.USD) {
            System.out.println("Dispensing $" + request.getAmount());
        } else if (nextCurrencyATM != null) {
            nextCurrencyATM.dispense(request);
        }
    }

}
