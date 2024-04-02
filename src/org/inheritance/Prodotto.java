package org.inheritance;
import java.math.BigDecimal;
import java.util.Random;
public class Prodotto {
    private int code;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(String nome,String marca,BigDecimal prezzo,BigDecimal iva){
        this.code = generateCode();
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;

    }
    private int generateCode() {
        Random random = new Random();
        return random.nextInt(10000);
    }
    public int getCodice() {
        return code;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public BigDecimal getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }
    public BigDecimal getIva() {
        return iva;
    }
    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
    public BigDecimal getPrezzoConIva() {
        BigDecimal prezzoConIva = prezzo.add(prezzo.multiply(iva));
        return prezzoConIva;
    }
    public String getDettagliProdotto() {
        return String.format("Codice: %d\nNome: %s\nMarca: %s\nPrezzo: %.2f\nIVA: %.2f\nPrezzo con IVA: %.2f",
                code,nome , marca, prezzo, iva, getPrezzoConIva());
    }
}
