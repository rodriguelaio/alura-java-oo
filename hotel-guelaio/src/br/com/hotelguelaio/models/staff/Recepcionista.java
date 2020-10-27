package br.com.hotelguelaio.models.staff;

import br.com.hotelguelaio.interfaces.UsuarioAutenticavel;
import br.com.hotelguelaio.interfaces.UsuarioDeReservas;
import br.com.hotelguelaio.models.Autenticador;
import br.com.hotelguelaio.models.Endereco;

public class Recepcionista extends Funcionario implements UsuarioAutenticavel, UsuarioDeReservas {

    Autenticador autenticador;

    public Recepcionista(String nome, String cpf, double salario, Endereco endereco, int senha) {
        super(nome, cpf, salario, endereco);
        autenticador = new Autenticador();
        setSenha(senha);
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
