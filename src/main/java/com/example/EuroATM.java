package com.example;

import java.util.Currency;

public class EuroATM extends ATM {

    public EuroATM(ATM nextCurrencyATM) {
        super(nextCurrencyATM);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if(request.getCurrency() == WithdrawalRequest.Currency.EUR) {
            System.out.println("Dispensing €" + request.getAmount());
        } else if (this.nextCurrencyATM != null) {
            nextCurrencyATM.dispense(request);
        }
    }
}
