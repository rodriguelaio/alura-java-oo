package br.com.hotelguelaio.hg.models.hotel;

public class CamaQueen extends Cama {
    public CamaQueen(Double altura, Double largura, Double comprimento) {
        super(altura, largura, comprimento);
    }

    @Override
    public Double getValorDaCama() {
        return super.getValorDaCama() * 3.5;
    }
}
