package org.lessons.java.shop;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanti prodotti vuoi nel carrello?");
        int productsNumber = Integer.parseInt(scan.nextLine());

        Prodotto[] cart = new Prodotto[productsNumber];

        for (int i = 0; i < cart.length; i++) {
            System.out.println("Inserisci il tipo di prodotto: ");
            String productType = scan.nextLine();

            System.out.println("Nome Prodotto: ");
            String name = scan.nextLine();

            System.out.println("Descrizione Prodotto: ");
            String description = scan.nextLine();

            System.out.println("Prezzo del Prodotto: ");
            BigDecimal price = new BigDecimal(scan.nextLine());

            System.out.println("Iva: ");
            BigDecimal iva = new BigDecimal(scan.nextLine());

            switch (productType.toLowerCase()) {
                case "smartphone" -> {
                    System.out.print("IMEI: ");
                    int imei = scan.nextInt();
                    System.out.print("Quantità di memoria: ");
                    int memoryAmount = Integer.parseInt(scan.nextLine());
                    cart[i] = new Smartphone(name, description, price, iva, imei, memoryAmount);
                }
                case "televisore" -> {
                    System.out.print("Dimensione: ");
                    int dimensions = Integer.parseInt(scan.nextLine());
                    System.out.print("Smart (S/N): ");
                    boolean smart = scan.nextLine().equalsIgnoreCase("S");
                    cart[i] = new Televisori(name, description, price, iva, dimensions, smart);
                }
                case "cuffie" -> {
                    System.out.print("Colore: ");
                    String color = scan.nextLine();
                    System.out.print("Wireless (S/N): ");
                    boolean wireless = scan.nextLine().equalsIgnoreCase("S");
                    cart[i] = new Cuffie(name, description, price, iva, color, wireless);
                }
                default -> {
                    System.out.println("Tipo di prodotto non valido. Riprova.");
                    i--;
                }
            }
        }

        System.out.println(Arrays.toString(cart));
    }
}
