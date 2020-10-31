package br.com.hotelguelaio.hg.models.hotel;

public class CamaCasal extends Cama {
    public CamaCasal(double altura, double largura, double comprimento) {
        super(altura, largura, comprimento);
    }

    @Override
    public double getValorDaCama() {
        return super.getValorDaCama() * 2.5;
    }
}
