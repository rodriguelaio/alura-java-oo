package br.com.hotelguelaio.hg.exceptions;

public class PeriodoException extends RuntimeException {

	public PeriodoException() { //Construtor da classe filha não pode fazer nada antes de chamar o construtur da...
		super("Já existe reserva deste quarto para este período"); //...super classe. Como a classe filha não existe,...
	}                                         //...não tem nem atributos e nem pode chamar metodos ou criar variaveis

	public PeriodoException(String mensagem) {
		super(mensagem);
	}
}
