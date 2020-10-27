package br.com.hotelguelaio.hg.main;

import br.com.hotelguelaio.hg.enums.Varanda;
import br.com.hotelguelaio.hg.models.Booking;
import br.com.hotelguelaio.hg.models.Cliente;
import br.com.hotelguelaio.hg.models.Endereco;
import br.com.hotelguelaio.hg.models.hotel.Cama;
import br.com.hotelguelaio.hg.models.hotel.CamaCasal;
import br.com.hotelguelaio.hg.models.hotel.CamaSolteiro;
import br.com.hotelguelaio.hg.models.hotel.Quarto;
import br.com.hotelguelaio.hg.models.staff.Recepcionista;

import java.util.Date;

public class TestarHotel {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Rodrigo", "666",
                new Endereco("Av. Guelaio", 666, "wow",
                        "BH", "MG", "123321"));

        Recepcionista recepcionista = new Recepcionista("Amanda", "123321123", 3500.0,
                new Endereco("Av. Vacaiado", 777, "flau",
                        "LUZ", "MG", "666"), 123456);

        System.out.println("O salario da " + recepcionista.getNome() + " é " + recepcionista.getSalario());
        System.out.println("A bonificação da " + recepcionista.getNome() + " é " + recepcionista.getBonificacao());

        CamaCasal camaCasal = new CamaCasal(32, 132, 189);
        CamaSolteiro camaSolteiro = new CamaSolteiro(28, 88, 189);

        Quarto quarto = new Quarto(666, Varanda.SIM, new Cama[]{camaCasal, camaSolteiro});

        Booking booking = new Booking(recepcionista);

        booking.criarReserva(cliente, quarto, new Date(), new Date());
    }
}
