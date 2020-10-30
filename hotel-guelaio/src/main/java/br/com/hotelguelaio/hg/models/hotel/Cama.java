package br.com.hotelguelaio.hg.models.hotel;

public abstract class Cama {
    private Double altura;
    private Double largura;
    private Double comprimento;

    public Cama(Double altura, Double largura, Double comprimento) {
        setAltura(altura);
        setLargura(largura);
        setComprimento(comprimento);
    }

    public Double getAltura() {
        return altura;
    }

    public Double getLargura() {
        return largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getValorDaCama() {
        return 100.0;
    }
}
