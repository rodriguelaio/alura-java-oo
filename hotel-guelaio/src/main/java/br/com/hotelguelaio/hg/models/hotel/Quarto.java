package br.com.hotelguelaio.hg.models.hotel;

import br.com.hotelguelaio.hg.enums.Varanda;

public class Quarto {
    private Integer numero;
    private Varanda varanda;
    private Cama[] camas;

    public Quarto(Integer numero, Varanda varanda, Cama[] camas) {
        setNumero(numero);
        setVaranda(varanda);
        setCama(camas);
    }

    public Integer getNumero() {
        return numero;
    }

    public Boolean temVaranda() {
        return this.varanda.name().equals("SIM");
    }

    public Cama[] getCama() {
        return camas;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setVaranda(Varanda varanda) {
        this.varanda = varanda;
    }

    public void setCama(Cama[] camas) {
        this.camas = camas;
    }

    public Double getValorDoQuarto(){
        return getValorTotalDeCamas() + this.varanda.getValor() * 1.6;
    }

    public Double getValorTotalDeCamas(){
        Double valorTotalDeCamas = 0.0;
        for(Cama cama : this.camas){
            valorTotalDeCamas += cama.getValorDaCama();
        }
        return valorTotalDeCamas;
    }
}
