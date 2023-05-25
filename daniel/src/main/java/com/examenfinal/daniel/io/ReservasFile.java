package com.examenfinal.daniel.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.examenfinal.daniel.modelos.Hotel;
import com.examenfinal.daniel.modelos.Reserva;
import com.examenfinal.daniel.service.Buking;

public class ReservasFile {

	/**
	 * Lee los ficheros CSV e instancia tantos objetos de tipo Hotel y Reserva como lineas tenga cada fichero respectivamente
	 */
	public static void cargarCSV() {

		Buking bk = new Buking();

		Path rutaReservas = Paths.get("src/main/java/com/examenfinal/daniel/io/reservas.csv");
		Path rutaHoteles = Paths.get("src/main/java/com/examenfinal/daniel/io/hoteles.csv");

		try {
			List<String> listadoReservas = Files.readAllLines(rutaReservas);
			List<String> listadoHoteles = Files.readAllLines(rutaHoteles);

			// Aniadimos los hoteles del CSV a un ArrayList para luego hacer un .setHoteles
			// de la clase buking
			ArrayList hoteles = (ArrayList) listadoHoteles.stream().map(linea -> {
				String[] atributos = linea.split(",");
				return new Hotel(atributos[0], atributos[1], atributos[2], atributos[3],Integer.parseInt(atributos[4]),
						Double.parseDouble(atributos[5]),Integer.parseInt(atributos[6]));

			}).collect(Collectors.toList());

			// Aniadimos las reservas del CSV a un HashSet para luego hacer un .setReservas
			// de la clase buking

			bk.setHoteles(hoteles);

			HashSet reservas = (HashSet) listadoReservas.stream().map(linea -> {
				String[] atributos = linea.split(",");
				return new Reserva(LocalDate.parse(atributos[0]), LocalDate.parse(atributos[1]),
						Integer.parseInt(atributos[2]), Integer.parseInt(atributos[3]), atributos[4], atributos[5],
						Buking.findHotelById(Integer.parseInt(atributos[6])));

			}).collect(Collectors.toSet());
			

			bk.setReservas(reservas);

		} catch (IOException e) {

			e.printStackTrace();
		}


	}
	
	public static void grabarCSV()	{

		Path uri = Paths.get("src/main/java/com/examenfinal/daniel/io/reservas.csv");
		
		List<String> listadoAtributos = (List<String>) Buking.getReservas().stream().map( re -> re.getFechaEntrada() + "," +
		re.getFechaSalida() + "," + re.getCantidadHabitaciones() + "," + re.getNumPersonasPorHabitacion() + "," + re.getDni()
		+ "," + re.getNacionalidad()+ "," + re.getHotel().getId()).collect(Collectors.toList());
		
		try {
			Files.write(uri, listadoAtributos, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
