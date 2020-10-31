package br.com.hotelguelaio.hg.models.staff;

import br.com.hotelguelaio.hg.interfaces.UsuarioAutenticavel;
import br.com.hotelguelaio.hg.interfaces.UsuarioDeReservas;
import br.com.hotelguelaio.hg.models.Autenticador;
import br.com.hotelguelaio.hg.models.Endereco;

public class Recepcionista extends Funcionario implements UsuarioAutenticavel, UsuarioDeReservas {

    Autenticador autenticador;

    public Recepcionista(String nome, String cpf, double salario, Endereco endereco) {
        super(nome, cpf, salario, endereco);
        autenticador = new Autenticador();
    }

    public void setSenha(int senha) {
        autenticador.setSenha(senha);
    }

    public boolean autenticar(int senha) {
        return autenticador.autenticar(senha);
    }

}
