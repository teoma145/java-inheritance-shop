package org.inheritance;
import java.math.BigDecimal;
public class Smartphone extends Prodotto{
    private int IMEI;
    private  int memoria;
    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int IMEI,int memoria) {
        super(nome, marca, prezzo, iva);
        this.IMEI = IMEI;
        this.memoria = memoria;
    }
    public int getIMEI() {
        return IMEI;
    }
    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }
    public int getMemoria(){
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    @Override
    public String getDettagliProdotto() {
        String tipoProdotto = "SmartPhone";
        return String.format("Tipo di Prodotto: %s\n", tipoProdotto) +
                super.getDettagliProdotto() +
                String.format("\nIMEI: %d\nMemoria: %d", IMEI, memoria);
    }
}
