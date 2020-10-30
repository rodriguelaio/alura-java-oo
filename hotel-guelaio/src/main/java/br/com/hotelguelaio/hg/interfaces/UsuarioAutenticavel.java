package br.com.hotelguelaio.hg.interfaces;
//É implicita a utilizacao de ABSTRACT na interface ja que ela segue o conceito
//de uma clase abstrata
public interface UsuarioAutenticavel {
    //Tambem não existe a necessidade de se definir o modificador de acesso (ou visibilidade)
    //PUBLIC, pois, dentro de uma interface, todos os metodos ja são PUBLIC e ABSTRACT
    void setSenha(Integer senha);

    Boolean autenticar(Integer senha);

}
