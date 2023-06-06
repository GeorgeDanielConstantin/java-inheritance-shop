package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    private final int code;
    private String name;
    private String description;
    private BigDecimal price;

    private BigDecimal iva;

    public Prodotto(String name, String description, BigDecimal price, BigDecimal iva) {
        this.code = generateRandomCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    private int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(100000000);
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIvaPrice() {
        return price.add(price.multiply(iva));
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String getExtendedName() {
        return code + "-" + name;
    }


    @Override
    public String toString() {
        return "Codice: " + code + "\n" +
                "Nome: " + name + "\n" +
                "Descrizione: " + description + "\n" +
                "Prezzo base: " + price + "\n" +
                "Prezzo con iva: " + price.add(price.multiply(iva));
    }
}
