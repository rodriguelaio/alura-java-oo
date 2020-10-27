package br.com.hotelguelaio.models;

public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Cliente(String nome, String cpf, Endereco endereco){
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
}
