package br.com.hotelguelaio.interfaces;

public interface UsuarioAutenticavel {

    void setSenha(int senha);

    boolean autenticar(int senha);

}
