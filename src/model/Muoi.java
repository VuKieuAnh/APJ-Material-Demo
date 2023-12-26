package model;

import java.time.LocalDate;

public class Muoi extends Material implements Discount {
    @Override
    public double getRealMoney() {
        return 0;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public LocalDate getExpiryDate() {
        return null;
    }
}
