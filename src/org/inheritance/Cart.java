package org.inheritance;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Prodotto> carrello = new ArrayList<>();

        System.out.println("Quanti prodotti vuoi creare?");
        int numeroProdotti = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numeroProdotti; i++) {
            System.out.println("Inserisci il tipo di prodotto (smartphone, televisore, cuffie):");
            String tipoProdotto = scanner.nextLine();
            System.out.println("Inserisci il nome del prodotto:");
            String nome = scanner.nextLine();
            System.out.println("Inserisci la marca del prodotto:");
            String marca = scanner.nextLine();
            System.out.println("Inserisci il prezzo del prodotto:");
            BigDecimal prezzo = scanner.nextBigDecimal();
            System.out.println("Inserisci l'IVA del prodotto:");
            BigDecimal iva = scanner.nextBigDecimal();
            scanner.nextLine();
            switch (tipoProdotto.toLowerCase()) {
                case "smartphone":
                    System.out.println("Inserisci l'IMEI dello smartphone:");
                    int imei = scanner.nextInt();
                    System.out.println("Inserisci la memoria dello smartphone:");
                    int memoria = scanner.nextInt();
                    carrello.add(new Smartphone(nome, marca, prezzo, iva, imei, memoria));
                    break;
                case "televisore":
                    System.out.println("Inserisci la dimensione del televisore:");
                    String dimensione = scanner.nextLine();
                    System.out.println("Il televisore è smart? (true/false):");
                    boolean smart = scanner.nextBoolean();
                    scanner.nextLine();
                    carrello.add(new Televisori(nome, marca, prezzo, iva, dimensione, smart));
                    break;
                case "cuffie":
                    System.out.println("Inserisci il colore delle cuffie:");
                    String colore = scanner.nextLine();
                    System.out.println("Inserisci il tipo di connessione delle cuffie:");
                    String tipoConnessione = scanner.nextLine();
                    carrello.add(new Cuffie(nome, marca, prezzo, iva, colore, tipoConnessione));
                    break;
                default:
                    System.out.println("Tipo di prodotto non riconosciuto.");

            }
        }
        BigDecimal prezzoTotale = BigDecimal.ZERO;
        System.out.println("Sintesi del carrello:");
        for (Prodotto prodotto : carrello) {
            System.out.println(prodotto.getDettagliProdotto());
            System.out.println("----------------------------------");
            prezzoTotale = prezzoTotale.add(prodotto.getPrezzoConIva());
        }
        System.out.println("Prezzo totale del carrello (compreso di IVA): " + prezzoTotale);
    }
}
