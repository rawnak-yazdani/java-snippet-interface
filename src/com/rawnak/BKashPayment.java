package com.rawnak;

public class BKashPayment implements Payment {

    @Override
    public long getAmount() {
        System.out.println("Taking BKash payment");
        return 100;
    }
}
