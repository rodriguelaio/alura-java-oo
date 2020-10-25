package models.staff;

import interfaces.UsuarioAutenticavel;
import interfaces.UsuarioDeReservas;
import models.Autenticador;
import models.Endereco;

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
