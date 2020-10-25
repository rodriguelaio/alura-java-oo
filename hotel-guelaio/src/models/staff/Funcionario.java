package models.staff;

import models.Endereco;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private Endereco endereco;
    private static int totalFuncionarios;

    public static void setTotalFuncionarios() {
        Funcionario.totalFuncionarios++;
    }

    public Funcionario (String nome, String cpf, double salario, Endereco endereco){
        setNome(nome);
        setCpf(cpf);
        setSalario(salario);
        setEndereco(endereco);
        setTotalFuncionarios();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
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

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getBonificacao() {
        return getSalario() * 0.05;
    }

}
