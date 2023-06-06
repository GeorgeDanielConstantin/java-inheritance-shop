package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    private final int imei;
    private final int memoryAmount;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal iva, int imei, int memoryAmount) {
        super(name, description, price, iva);
        this.imei = imei;
        this.memoryAmount = memoryAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "IMEI: " + imei + "\n" +
                "Quantità di memoria: " + memoryAmount + "GB";
    }
}
