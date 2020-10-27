package br.com.hotelguelaio.hg.models.staff;

import br.com.hotelguelaio.hg.interfaces.UsuarioAutenticavel;
import br.com.hotelguelaio.hg.models.Autenticador;
import br.com.hotelguelaio.hg.models.Endereco;

public class Gerente extends Funcionario implements UsuarioAutenticavel {

    Autenticador autenticador;

    public Gerente (String nome, String cpf, double salario, Endereco endereco){
        super(nome, cpf, salario, endereco);
        autenticador = new Autenticador();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.1;
    }

    @Override
    public void setSenha(int senha) {
        autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticar(int senha) {
        return autenticador.autenticar(senha);
    }
}
