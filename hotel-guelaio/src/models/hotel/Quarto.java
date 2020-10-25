package models.hotel;

public class Quarto {
    private int numero;
    private boolean varanda;
    private Cama[] cama;

    public Quarto(int numero, boolean varanda, Cama[] cama) {
        setNumero(numero);
        setVaranda(varanda);
        setCama(cama);
    }

    public int getNumero() {
        return numero;
    }

    public boolean isVaranda() {
        return varanda;
    }

    public Cama[] getCama() {
        return cama;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setVaranda(boolean varanda) {
        this.varanda = varanda;
    }

    public void setCama(Cama[] cama) {
        this.cama = cama;
    }
}
