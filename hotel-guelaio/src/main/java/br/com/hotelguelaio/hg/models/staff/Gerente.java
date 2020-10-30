package br.com.hotelguelaio.hg.models.staff;

import br.com.hotelguelaio.hg.interfaces.UsuarioAutenticavel;
import br.com.hotelguelaio.hg.models.Autenticador;
import br.com.hotelguelaio.hg.models.Endereco;

public class Gerente extends Funcionario implements UsuarioAutenticavel {

    Autenticador autenticador;

    public Gerente (String nome, String cpf, Double salario, Endereco endereco){
        super(nome, cpf, salario, endereco);
        autenticador = new Autenticador();
    }

    @Override
    public Double getBonificacao() {
        return super.getSalario() * 0.1;
    }

    public void setSenha(Integer senha) {
        autenticador.setSenha(senha);
    }

    public Boolean autenticar(Integer senha) {
        return autenticador.autenticar(senha);
    }

    @Override
    public String toString(){
        Double salarioTotal = this.getSalario() + this.getBonificacao();
        return super.toString().replace("NOVOSALARIO", String.valueOf(salarioTotal));
    }

}
