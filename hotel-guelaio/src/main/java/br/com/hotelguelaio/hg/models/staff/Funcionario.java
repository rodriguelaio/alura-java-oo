package br.com.hotelguelaio.hg.models.staff;

import br.com.hotelguelaio.hg.models.Endereco;

public abstract class Funcionario { //Classes abstratas não pode ser instanciada, somente herdadas

    private String nome;
    private String cpf;
    private Double salario;
    private Endereco endereco;
    private static Integer totalFuncionarios;

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

    public Double getSalario() {
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

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Double getBonificacao() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", bonificacao=" + this.getBonificacao() + //Ele pega a bonificacao da classe filha
                ", endereco=" + endereco +
                '}';
    }


}
