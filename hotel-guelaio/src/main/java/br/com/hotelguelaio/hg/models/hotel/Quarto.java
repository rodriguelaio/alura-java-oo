package br.com.hotelguelaio.hg.models.hotel;

import br.com.hotelguelaio.hg.enums.Varanda;

public class Quarto {

    private static final double VALOR_BASE_QUARTO = 1.6;

    private int numero;
    private Varanda varanda;
    private Cama[] camas;

    public Quarto(int numero, Varanda varanda, Cama[] camas) {
        setNumero(numero);
        setVaranda(varanda);
        setCama(camas);
    }

    public int getNumero() {
        return numero;
    }

    public boolean temVaranda() {
        return this.varanda.name().equals("SIM");
    }

    public Cama[] getCama() {
        return camas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setVaranda(Varanda varanda) {
        this.varanda = varanda;
    }

    public void setCama(Cama[] camas) {
        this.camas = camas;
    }

    public double getValorDoQuarto(){
        return getValorTotalDeCamas() + this.varanda.getValor() * VALOR_BASE_QUARTO;
    }

    public double getValorTotalDeCamas() {
        double valorTotalDeCamas = 0.0;
        for(Cama cama : this.camas){
            valorTotalDeCamas += cama.getValorDaCama();
        }
        return valorTotalDeCamas;
    }
}
