package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {

    private final int dimensions;
    private final boolean smart;

    public Televisori(String name, String description, BigDecimal price, BigDecimal iva, int dimensions, boolean smart) {
        super(name, description, price, iva);
        this.dimensions = dimensions;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Dimensioni: " + dimensions + " pollici" + "\n" +
                (smart ? "Smart Tv" : "");
    }
}
