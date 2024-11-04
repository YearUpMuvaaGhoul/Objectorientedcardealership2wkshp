package com.yearup.contracts;

public class SalesContract extends Contract {
    private double recordingFee;

    public SalesContract(String vin, String customerName, String contractType, String contractDate) {
        super(vin, customerName, contractType, contractDate);
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
