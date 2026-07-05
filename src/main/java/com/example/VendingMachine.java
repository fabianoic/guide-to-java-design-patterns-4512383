package com.example;

import java.util.HashMap;
import java.util.function.Supplier;

public class VendingMachine {

    private static final HashMap<String, Supplier<Snack>> snackMap = new HashMap<>();

    static {
        snackMap.put("Drink", Drink::new);
        snackMap.put("Chips", Chips::new);
        snackMap.put("ChocolateBar", ChocolateBar::new);
    }

    Snack getSnack(String snackType) {
        if (snackMap.get(snackType) != null) {
            return snackMap.get(snackType).get();
        } else {
            throw new IllegalArgumentException("Invalid snacktype");
        }
    }

}
