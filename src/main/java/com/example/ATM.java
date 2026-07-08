package com.example;

public abstract class ATM {

    public final ATM nextCurrencyATM;

    public ATM(ATM nextCurrencyATM) {
        this.nextCurrencyATM = nextCurrencyATM;
    }

    public abstract void dispense(WithdrawalRequest request);

}
