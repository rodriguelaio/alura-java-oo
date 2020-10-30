package br.com.hotelguelaio.hg.models.hotel;

import br.com.hotelguelaio.hg.enums.Varanda;

public class Quarto {
    private Integer numero;
    private Varanda varanda;
    private Cama[] cama;

    public Quarto(Integer numero, Varanda varanda, Cama[] cama) {
        setNumero(numero);
        setVaranda(varanda);
        setCama(cama);
    }

    public Integer getNumero() {
        return numero;
    }

    public Boolean temVaranda() {
        return this.varanda.name().equals("SIM");
    }

    public Cama[] getCama() {
        return cama;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setVaranda(Varanda varanda) {
        this.varanda = varanda;
    }

    public void setCama(Cama[] cama) {
        this.cama = cama;
    }
}
