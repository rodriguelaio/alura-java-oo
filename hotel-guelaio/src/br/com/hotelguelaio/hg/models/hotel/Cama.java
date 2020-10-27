package br.com.hotelguelaio.hg.models.hotel;

public abstract class Cama {
    private double altura;
    private double largura;
    private double comprimento;

    public Cama(double altura, double largura, double comprimento) {
        setAltura(altura);
        setLargura(largura);
        setComprimento(comprimento);
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}
