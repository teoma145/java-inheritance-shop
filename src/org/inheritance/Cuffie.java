package org.inheritance;
import java.math.BigDecimal;
public class Cuffie extends Prodotto{
    private String colore;
    private String tipoConnessione;
    public Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, String tipoConnessione) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.tipoConnessione = tipoConnessione;
    }
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
    public String getTipoConnessione() {
        return tipoConnessione;
    }

    public void setTipoConnessione(String tipoConnessione) {
        this.tipoConnessione = tipoConnessione;
    }
    @Override
    public String getDettagliProdotto() {
        String tipoProdotto = "Cuffie";
        return String.format("Tipo di Prodotto: %s\n", tipoProdotto) +
                super.getDettagliProdotto() +
                String.format("\nColore: %s\nTipo di connessione: %s", colore, tipoConnessione);
    }
}
