package br.com.hotelguelaio.hg.models.hotel;

public class CamaCasal extends Cama {
    public CamaCasal(Double altura, Double largura, Double comprimento) {
        super(altura, largura, comprimento);
    }

    @Override
    public Double getValorDaCama() {
        return super.getValorDaCama() * 2.5;
    }
}
