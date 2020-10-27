package br.com.hotelguelaio.hg.interfaces;

public interface UsuarioAutenticavel {

    void setSenha(int senha);

    boolean autenticar(int senha);

}
