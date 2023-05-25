package com.examenfinal.daniel;

import java.time.LocalDate;
import java.util.Scanner;

import com.examenfinal.daniel.io.ReservasFile;
import com.examenfinal.daniel.modelos.Hotel;
import com.examenfinal.daniel.service.Buking;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Variables para usar en el menú
       int seleccion = 0;
       String nombreHotel = null;
       LocalDate fechaEntrada = null;
       LocalDate fechaSalida = null;
       int numHabitaciones = 0;
       int numPersonas = 0;
       String dni = null;
       String nacionalidad = null;
       Hotel h = null;
       int idReservaEliminar = 0;
       Scanner sc = new Scanner(System.in);
      

       ReservasFile.cargarCSV();
       
       do {
    	   System.out.println("***MENU***");
    	   System.out.println("1. Listar todos los hoteles");
    	   System.out.println("2. Listar todas las reservas");
    	   System.out.println("3. Mostrar reservas por país");
    	   System.out.println("4. Mostrar reservas activas");
    	   System.out.println("5. Mostrar importe reservas");
    	   System.out.println("6. Insertar reserva");
    	   System.out.println("7. Eliminar reserva");
    	   System.out.println("8. Salir");
    	   System.out.println("");
    	   System.out.print("Elige una opcion del menú: ");
    	   
    	   seleccion = Integer.parseInt(sc.nextLine());
    	   
    	   switch (seleccion) {
		case 1: {

			Buking.listarHoteles();
			System.out.println("\n");
			break;
		}
		case 2: {
			Buking.listarReservas();
			System.out.println("\n");
			break;
		}
		case 3: {
			Buking.reservasPorPais();
			System.out.println("\n");
			break;
		}
		case 4: {
			System.out.print("Introduce el nombre de un hotel: ");
			nombreHotel = sc.nextLine();
			Buking.reservasActivasPorHotel(nombreHotel);
			System.out.println("\n");
			break;
		}
		case 5: {
			
			System.out.println("\n");
			break;
		}
		case 6: {
			System.out.println("Introduce la fecha de entrada con formato yyyy-MM-dd: ");
			fechaEntrada=LocalDate.parse(sc.nextLine());
			System.out.println("Introduce la fecha de salida con formato yyyy-MM-dd: ");
			fechaSalida=LocalDate.parse(sc.nextLine());
			System.out.print("Introduce el numero de habitaciones: ");
			numHabitaciones = Integer.parseInt(sc.nextLine());
			System.out.print("Introduce el numero de personas: ");
			numPersonas = Integer.parseInt(sc.nextLine());
			System.out.print("Introduce el dni: ");
			dni = sc.nextLine();
			System.out.print("Introduce la nacionalidad: ");
			nacionalidad = sc.nextLine();
			System.out.print("Introduce el nombre del hotel a introducir en la reserva: ");
			nombreHotel = sc.nextLine();
			h = Buking.findHotelByNombre(nombreHotel);
			Buking.addReserva(fechaEntrada, fechaSalida, numHabitaciones, numPersonas, dni, nacionalidad, h);
			System.out.println("\n");
			break;
		}
		case 7: {
			System.out.print("Introduce el id de la reserva a eliminar: ");
			idReservaEliminar = Integer.parseInt(sc.nextLine());
			Buking.deleteReseva(idReservaEliminar);
			System.out.println("\n");
			break;
		}
		case 8: {
			ReservasFile.grabarCSV();
			System.out.println("\n");
			break;
		}
		default:
			System.out.println("Seleccion inesperada" + seleccion + ". Debe elegir una opcion del 1 al 8");
		}
    	   
       } while(seleccion != 8);
    }
}
