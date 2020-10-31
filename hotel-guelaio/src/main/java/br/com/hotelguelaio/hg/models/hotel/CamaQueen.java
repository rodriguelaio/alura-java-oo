package br.com.hotelguelaio.hg.models.hotel;

public class CamaQueen extends Cama {
    public CamaQueen(double altura, double largura, double comprimento) {
        super(altura, largura, comprimento);
    }

    @Override
    public double getValorDaCama() {
        return super.getValorDaCama() * 3.5;
    }
}
