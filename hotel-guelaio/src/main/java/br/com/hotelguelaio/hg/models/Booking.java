package br.com.hotelguelaio.hg.models;

import br.com.hotelguelaio.hg.interfaces.UsuarioDeReservas;
import br.com.hotelguelaio.hg.models.hotel.Quarto;

import java.util.Date;

public class Booking {

    private UsuarioDeReservas usuarioDeReservas;
//    private Reserva reserva;

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
        return new Reserva(cliente, quarto, dataInicio, dataFim);
    }
}
