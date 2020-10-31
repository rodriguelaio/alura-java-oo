package br.com.hotelguelaio.hg.enums;

public enum Varanda {

	SIM(190.0), NAO(0.0);

	double valor;

	public double getValor() {
		return valor;
	}

	Varanda(double valor){
		setValor(valor);
	}

	void setValor(double valor){
		this.valor = valor;
	}
}
