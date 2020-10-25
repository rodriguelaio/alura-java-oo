package models;

import interfaces.UsuarioDeReservas;
import models.hotel.Quarto;

import java.util.Date;

public class Booking {

    private UsuarioDeReservas usuarioDeReservas;
    private Reserva reserva;

    public Booking(UsuarioDeReservas usuarioDeReservas) {
        setUsuarioDeReservas(usuarioDeReservas);
    }

    public UsuarioDeReservas getUsuarioDeReservas() {
        return usuarioDeReservas;
    }

    public void setUsuarioDeReservas(UsuarioDeReservas usuarioDeReservas) {
        this.usuarioDeReservas = usuarioDeReservas;
    }

    public Reserva criarReserva(Cliente cliente, Quarto quarto, Date dataInicio, Date dataFim) {
        return this.reserva = new Reserva(cliente, quarto, dataInicio, dataFim);
    }
}
