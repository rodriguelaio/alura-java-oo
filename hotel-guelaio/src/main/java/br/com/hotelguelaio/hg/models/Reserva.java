package br.com.hotelguelaio.hg.models;

import br.com.hotelguelaio.hg.models.hotel.Quarto;

import java.util.Date;

public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private Double valor;
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

    public Double getValor() {
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

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente +
                ", quarto=" + quarto +
                ", valor=" + valor +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                '}';
    }
}
