package br.com.hotelguelaio.hg.models;

import java.io.Serializable;

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String cpf;
    private transient Endereco endereco; //Não faz parte da serialização e não será enviado no stream de dados

    public Cliente(String nome, String cpf, Endereco endereco) {
        setNome(nome);
        setCpf(cpf);
        setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
