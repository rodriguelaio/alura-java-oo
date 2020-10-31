package br.com.hotelguelaio.hg.models.hotel;

public class CamaKing extends Cama {
    public CamaKing(double altura, double largura, double comprimento) {
        super(altura, largura, comprimento);
    }

    @Override
    public double getValorDaCama() {
        return super.getValorDaCama() * 5;
    }
}
