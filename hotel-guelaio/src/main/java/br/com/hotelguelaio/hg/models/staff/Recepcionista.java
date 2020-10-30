package br.com.hotelguelaio.hg.models.staff;

import br.com.hotelguelaio.hg.interfaces.UsuarioAutenticavel;
import br.com.hotelguelaio.hg.interfaces.UsuarioDeReservas;
import br.com.hotelguelaio.hg.models.Autenticador;
import br.com.hotelguelaio.hg.models.Endereco;

public class Recepcionista extends Funcionario implements UsuarioAutenticavel, UsuarioDeReservas {

    Autenticador autenticador;

    public Recepcionista(String nome, String cpf, Double salario, Endereco endereco) {
        super(nome, cpf, salario, endereco);
        autenticador = new Autenticador();
    }

    public void setSenha(Integer senha) {
        autenticador.setSenha(senha);
    }

    public Boolean autenticar(Integer senha) {
        return autenticador.autenticar(senha);
    }

}
