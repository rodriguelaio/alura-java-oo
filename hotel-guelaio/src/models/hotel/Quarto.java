package models.hotel;

import enums.Varanda;

public class Quarto {
    private int numero;
    private Varanda varanda;
    private Cama[] cama;

    public Quarto(int numero, Varanda varanda, Cama[] cama) {
        setNumero(numero);
        setVaranda(varanda);
        setCama(cama);
    }

    public int getNumero() {
        return numero;
    }

    public boolean temVaranda() {
        return this.varanda.name().equals("SIM");
    }

    public Cama[] getCama() {
        return cama;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setVaranda(Varanda varanda) {
        this.varanda = varanda;
    }

    public void setCama(Cama[] cama) {
        this.cama = cama;
    }
}
