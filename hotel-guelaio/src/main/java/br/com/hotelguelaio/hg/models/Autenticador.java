package br.com.hotelguelaio.hg.models;

import br.com.hotelguelaio.hg.interfaces.UsuarioAutenticavel;
//Conceito chamado de COMPOSICAO onde se utiliza de uma classe somente
//para colocar a regra de negocio que outra(s) classe(s) utilizara(ao)
public class Autenticador implements UsuarioAutenticavel {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }
}
