package br.com.hotelguelaio.hg.models.staff;

import br.com.hotelguelaio.hg.models.Endereco;

public class Cozinheiro extends Funcionario {
    public Cozinheiro(String nome, String cpf, double salario, Endereco endereco) {
        super(nome, cpf, salario, endereco);
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.08;
    }

}
