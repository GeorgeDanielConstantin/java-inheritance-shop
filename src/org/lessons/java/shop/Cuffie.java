package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    private final String color;
    private final boolean wireless;

    public Cuffie(String name, String description, BigDecimal price, BigDecimal iva, String color, boolean wireless) {
        super(name, description, price, iva);
        this.color = color;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Colore: " + color + "\n" +
                (wireless ? "Wireless" : "Cablato");
    }
}
