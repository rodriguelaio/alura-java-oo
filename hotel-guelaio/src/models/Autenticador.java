package models;

import interfaces.UsuarioAutenticavel;

public class Autenticador implements UsuarioAutenticavel {

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(int senha) {
        return this.senha == senha;
    }
}
