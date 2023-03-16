package P1_4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class FechaUtils {

	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {

		LocalDateTime ahora = LocalDateTime.now();

		Period diferencia = Period.between(ahora.toLocalDate(), fechaHasta.toLocalDate());

		Duration diff = Duration.between(fechaHasta, ahora);

		System.out.println("Faltan " + diferencia.getYears() + " años, " + diferencia.getMonths() + " meses, "
				+ diferencia.getDays() + " dias, " + diff.toHours() + " horas y " + diff.toSeconds() + " segundos");
	}

	public static String diaCumple(LocalDate fechaCumple, int anio) {

		fechaCumple.withYear(anio).getDayOfWeek();

		return fechaCumple.toString();

	}

	public static int numYears(LocalDate fechaCumple) {
		Period edad = Period.between(fechaCumple, LocalDate.now());
		return edad.getYears();
	}

	public static void zodiaco(LocalDate fecha) {
		enum SignosZodiaco {
			ARIES, TAURO, GEMINIS, CANCER, LEO, VIRGO, LIBRA, ESCORPIO, SAGITARIO, CAPRICORNIO, ACUARIO, PISCIS
		}
		;

		
		int selector = 0;

		LocalDate ariesI = LocalDate.of(2023, 3, 21);
		LocalDate ariesF = LocalDate.of(2023, 4, 20);
		LocalDate tauroI = LocalDate.of(2023, 4, 21);
		LocalDate tauroF = LocalDate.of(2023, 5, 20);
		LocalDate geminisI = LocalDate.of(2023, 5, 21);
		LocalDate geminisF = LocalDate.of(2023, 6, 20);
		LocalDate cancerI = LocalDate.of(2023, 6, 21);
		LocalDate cancerF = LocalDate.of(2023, 7, 22);
		LocalDate leoI = LocalDate.of(2023, 7, 23);
		LocalDate leoF = LocalDate.of(2023, 8, 22);
		LocalDate virgoI = LocalDate.of(2023, 8, 23);
		LocalDate virgoF = LocalDate.of(2023, 9, 22);
		LocalDate libraI = LocalDate.of(2023, 9, 23);
		LocalDate libraF = LocalDate.of(2023, 10, 22);
		LocalDate escorpioI = LocalDate.of(2023, 10, 23);
		LocalDate escorpioF = LocalDate.of(2023, 11, 21);
		LocalDate sagitarioI = LocalDate.of(2023, 11, 22);
		LocalDate sagitarioF = LocalDate.of(2023, 12, 21);
		LocalDate capricornioI = LocalDate.of(2023, 12, 22);
		LocalDate capricornioF = LocalDate.of(2023, 1, 19);
		LocalDate acuarioI = LocalDate.of(2023, 1, 20);
		LocalDate acuarioF = LocalDate.of(2023, 2, 18);
		LocalDate piscisI = LocalDate.of(2023, 2, 19);
		LocalDate piscisF = LocalDate.of(2023, 3, 20);

		if (fecha.isAfter(ariesI) && fecha.isBefore(ariesF)) {

			SignosZodiaco aries = SignosZodiaco.ARIES;
			System.out.println(aries);
		} else if (fecha.isAfter(tauroI) && fecha.isBefore(tauroF)) {
			SignosZodiaco tauro = SignosZodiaco.TAURO;
			System.out.println(tauro);
		} else if (fecha.isAfter(geminisI) && fecha.isBefore(geminisF)) {
			SignosZodiaco geminis = SignosZodiaco.GEMINIS;
			System.out.println(geminis);
		} else if (fecha.isAfter(cancerI) && fecha.isBefore(cancerF)) {
			SignosZodiaco cancer = SignosZodiaco.CANCER;
			System.out.println(cancer);
		} else if (fecha.isAfter(leoI) && fecha.isBefore(leoF)) {
			SignosZodiaco leo = SignosZodiaco.LEO;
			System.out.println(leo);
		} else if (fecha.isAfter(virgoI) && fecha.isBefore(virgoF)) {
			SignosZodiaco virgo = SignosZodiaco.VIRGO;
			System.out.println(virgo);
		} else if (fecha.isAfter(libraI) && fecha.isBefore(libraF)) {
			SignosZodiaco libra = SignosZodiaco.LIBRA;
			System.out.println(libra);
		} else if (fecha.isAfter(escorpioI) && fecha.isBefore(escorpioF)) {
			SignosZodiaco escorpio = SignosZodiaco.ESCORPIO;
			System.out.println(escorpio);
		} else if (fecha.isAfter(sagitarioI) && fecha.isBefore(sagitarioF)) {
			SignosZodiaco sagitario = SignosZodiaco.SAGITARIO;
			System.out.println(sagitario);
		} else if (fecha.isAfter(capricornioI) && fecha.isBefore(capricornioF)) {
			SignosZodiaco capricornio = SignosZodiaco.CAPRICORNIO;
			System.out.println(capricornio);
		} else if (fecha.isAfter(acuarioI) && fecha.isBefore(acuarioF)) {
			SignosZodiaco acuario = SignosZodiaco.ACUARIO;
			System.out.println(acuario);
		} else {
			SignosZodiaco piscis = SignosZodiaco.PISCIS;
			System.out.println(piscis);
		}
		
	}

	public static void main(String[] args) {
		LocalDate nuevo = LocalDate.of(2023, 2, 28);
		
	}

}
