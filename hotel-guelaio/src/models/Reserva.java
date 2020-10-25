package models;

import models.hotel.Quarto;

import java.util.Date;

public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private double valor;
    private Date dataInicio;
    private Date dataFim;

    public Reserva(Cliente cliente, Quarto quarto, Date dataInicio, Date dataFim) {
        setCliente(cliente);
        setQuarto(quarto);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public double getValor() {
        return valor;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
