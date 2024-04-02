package org.inheritance;
import java.math.BigDecimal;
public class Televisori extends Prodotto{
    private String dimensione;
    private boolean smart;
    public Televisori(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String dimensione, boolean smart) {
        super(nome, marca, prezzo, iva);
        this.dimensione = dimensione;
        this.smart = smart;
    }
    public String getDimensione() {
        return dimensione;
    }
    public void setDimensione(String dimensione) {
        this.dimensione = dimensione;
    }
    public boolean isSmart() {
        return smart;
    }
    public void setSmart(boolean smart) {
        this.smart = smart;
    }
    @Override
    public String getDettagliProdotto() {
        String tipoProdotto = "Televisore";
        String smartStatus = smart ? "Smart" : "Non Smart";
        return String.format("Tipo di Prodotto: %s\n", tipoProdotto) +
                super.getDettagliProdotto() +
                String.format("\nDimensione: %s\nSmart: %s", dimensione, smartStatus);
    }
}
