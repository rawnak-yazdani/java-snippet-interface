package com.rawnak;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PaymentEngine paymentEngine = new PaymentEngine();
        BKashPayment bKashPayment = new BKashPayment();
//        Payment bKashPayment = new BKashPayment();
        CashPayment cashPayment = new CashPayment();
//        Payment cashPayment = new CashPayment();

        paymentEngine.accept(bKashPayment);
        paymentEngine.accept(cashPayment);
    }
}
