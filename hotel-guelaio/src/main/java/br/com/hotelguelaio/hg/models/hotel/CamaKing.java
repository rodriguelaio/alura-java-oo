package br.com.hotelguelaio.hg.models.hotel;

public class CamaKing extends Cama {
    public CamaKing(Double altura, Double largura, Double comprimento) {
        super(altura, largura, comprimento);
    }

    @Override
    public Double getValorDaCama() {
        return super.getValorDaCama() * 5;
    }
}
