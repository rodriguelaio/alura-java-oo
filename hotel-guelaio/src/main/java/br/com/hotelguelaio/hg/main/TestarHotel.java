package br.com.hotelguelaio.hg.main;

import java.util.Date;
import br.com.hotelguelaio.hg.enums.*;
import br.com.hotelguelaio.hg.models.*;
import br.com.hotelguelaio.hg.models.hotel.*;
import br.com.hotelguelaio.hg.models.staff.*;

public class TestarHotel {
    public static void main(String[] args) {

        String teste = String.format("%06d - %d - %s - %s", 10, 10.99, "rodrigones", "dona rosinha");
        System.out.println(teste);

        Gerente gerente = new Gerente("Demonio", "123321123", 100.0,
                new Endereco("Av. Vacaiado", 777, "flau",
                        "LUZ", "MG", "666"));
        System.out.println(gerente.toString());

        Cliente cliente = new Cliente("Rodrigo", "666",
                new Endereco("Av. Guelaio", 666, "wow",
                        "BH", "MG", "123321"));

        Recepcionista recepcionista = new Recepcionista("Amanda", "123321123", 3500.0,
                new Endereco("Av. Vacaiado", 777, "flau",
                        "LUZ", "MG", "666"));

        System.out.println("O salario da " + recepcionista.getNome() + " é " + recepcionista.getSalario());
        System.out.println("A bonificação da " + recepcionista.getNome() + " é " + recepcionista.getBonificacao());

        CamaCasal camaCasal = new CamaCasal(32.0, 132.0, 189.0);
        CamaSolteiro camaSolteiro = new CamaSolteiro(28.0, 88.0, 189.0);

        Quarto quarto = new Quarto(666, Varanda.SIM, new Cama[]{camaCasal, camaSolteiro});

        Booking booking = new Booking(recepcionista);

        booking.criarReserva(cliente, quarto, new Date(), new Date());
    }
}
