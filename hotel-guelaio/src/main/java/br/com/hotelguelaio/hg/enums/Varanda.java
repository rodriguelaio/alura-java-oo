package br.com.hotelguelaio.hg.enums;

public enum Varanda {

	SIM(190.0), NAO(0.0);

	Double valor;

	public Double getValor() {
		return valor;
	}

	Varanda(Double valor){
		setValor(valor);
	}

	void setValor(Double valor){
		this.valor = valor;
	}
}
