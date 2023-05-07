package practica2ejer4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import practica2ejer4.Pais.Continente;

public class TestCiudades {

	public static void main(String[] args) {

		/*tring nombre, Continente continente, double superficie, String capital) {
		*/
		
		Pais Espania = new Pais ("España", Continente.EUROPA, 505990, 47615034, "Madrid");
		Pais Filipinas = new Pais ("Filipinas", Continente.ASIA, 300000, 109180816, "Manila");
		Pais Rusia = new Pais ("Rusia", Continente.ASIA, 17098242, 141722208, "Moscú");
		Pais Turquia = new Pais ("Turquia", Continente.ASIA, 783356, 82017512, "Estambul");
		Pais Egipto = new Pais ("Egipto", Continente.AFRICA, 1002450, 104124440, "El Cairo");
		Pais Australia = new Pais ("Australia", Continente.OCEANIA, 7692024, 25727200, "Canberra");
		Pais Brasil = new Pais ("Brasil", Continente.AMERICA, 505990, 211715968, "Brasilia");
		Pais Canada = new Pais ("Canada", Continente.AMERICA, 9984670, 38067903, "Ottawa");
		Pais Mexico = new Pais ("México", Continente.AMERICA, 1964375, 128649568, "Ciudad de México");
		Pais Sudafrica = new Pais ("Sudafrica", Continente.AFRICA, 1221037, 60041994, "Ciudad del Cabo");
		
		Ciudad Almeria = new Ciudad("Almeria", Espania);
		Ciudad Madrid = new Ciudad("Madrid", Espania);
		Ciudad Barcelona = new Ciudad("Barcelona", Espania);
		
		Ciudad Manila = new Ciudad("Manila", Filipinas);
		Ciudad DavaoCity = new Ciudad("Davao City", Filipinas);
		Ciudad Cebú = new Ciudad("Cebú", Filipinas);
		
		Ciudad Moscu = new Ciudad("Moscú", Rusia);
		Ciudad SanPetersburgo = new Ciudad("San Petersburgo", Rusia);
		Ciudad Novosibirsk = new Ciudad("Novosibirsk", Rusia);
		
		Ciudad Estambul = new Ciudad("Estambul", Turquia);
		Ciudad Ankara = new Ciudad("Ankara", Turquia);
		Ciudad Esmirna = new Ciudad("Esmirna", Turquia);
		
		Ciudad ElCairo = new Ciudad("El Cairo", Egipto);
		Ciudad Alejandria = new Ciudad("Alejandría", Egipto);
		Ciudad Giza = new Ciudad("Giza", Egipto);
		
		Ciudad Sidney = new Ciudad("Sidney", Australia);
		Ciudad Melbourne = new Ciudad("Melbourne", Australia);
		Ciudad Brisbane = new Ciudad("Brisbane", Australia);
		
		Ciudad SaoPaulo = new Ciudad("Sao Paulo", Brasil);
		Ciudad RioDeJaneiro = new Ciudad("Rio de Janeiro", Brasil);
		Ciudad Brasilia = new Ciudad("Brasilia", Brasil);
		
		Ciudad Toronto = new Ciudad("Toronto", Canada);
		Ciudad Montreal = new Ciudad("Montreal", Canada);
		Ciudad Vancouver = new Ciudad("Vancouver", Canada);
		
		Ciudad CiudadMexico = new Ciudad("Ciudad de Mexico", Mexico);
		Ciudad Guadalajara = new Ciudad("Guadalajara", Mexico);
		Ciudad Monterrey = new Ciudad("Monterrey", Mexico);
		
		Ciudad Johannesburgo = new Ciudad("Johannesburgo", Sudafrica);
		Ciudad CiudadCabo = new Ciudad("Ciudad del Cabo", Sudafrica);
		Ciudad Pretoria = new Ciudad("Pretoria", Sudafrica);
		
		Espania.addCiudad(Barcelona);
		Espania.addCiudad(Madrid);
		Espania.addCiudad(Almeria);
		
		Filipinas.addCiudad(Manila);
		Filipinas.addCiudad(DavaoCity);
		Filipinas.addCiudad(Cebú);
		
		Rusia.addCiudad(Moscu);
		Rusia.addCiudad(SanPetersburgo);
		Rusia.addCiudad(Novosibirsk);
		
		Turquia.addCiudad(Estambul);
		Turquia.addCiudad(Ankara);
		Turquia.addCiudad(Esmirna);
		
		Egipto.addCiudad(ElCairo);
		Egipto.addCiudad(Alejandria);
		Egipto.addCiudad(Giza);
		
		Australia.addCiudad(Sidney);
		Australia.addCiudad(Melbourne);
		Australia.addCiudad(Brisbane);
		
		Brasil.addCiudad(SaoPaulo);
		Brasil.addCiudad(RioDeJaneiro);
		Brasil.addCiudad(Brasilia);
		
		Canada.addCiudad(Toronto);
		Canada.addCiudad(Montreal);
		Canada.addCiudad(Vancouver);
		
		Mexico.addCiudad(CiudadMexico);
		Mexico.addCiudad(Guadalajara);
		Mexico.addCiudad(Monterrey);
		
		Sudafrica.addCiudad(Johannesburgo);
		Sudafrica.addCiudad(CiudadCabo);
		Sudafrica.addCiudad(Pretoria);
		
		ArrayList<Pais> paises = new ArrayList<>();

		paises.add(Mexico);
		paises.add(Egipto);
		paises.add(Espania);
		paises.add(Sudafrica);
		paises.add(Canada);
		paises.add(Brasil);
		paises.add(Australia);
		paises.add(Turquia);
		paises.add(Filipinas);
		paises.add(Rusia);
		
		System.out.println("Menor superficie");
		
		paises.stream()
			.sorted()
			.limit(1)
			.forEach(c -> System.out.println(c.getNombre() + " - " + c.getSuperficie()));
		
		System.out.println("------------------");
		System.out.println("Muestra los países ordenados por población (descendente). Muestra país y población");
		
		paises.stream()
			.sorted(new Comparator<Pais>() {

				@Override
				public int compare(Pais o1, Pais o2) {
					return o2.getPoblacionInt().compareTo(o1.getPoblacionInt());
				}
				
			})
			.forEach(c -> System.out.println(c.getNombre() + " - " + c.getPoblacion()));
		
		System.out.println("------------------");
		System.out.println("Muestra los 5 países con mayor superficie, nombre y superficie");
		
		paises.stream()
			.sorted(Comparator.reverseOrder())
			.limit(5)
			.forEach(c -> System.out.println(c.getNombre() + " - " + c.getSuperficie() + "km2"));
		
		System.out.println("------------------");
		System.out.println("Muestra los países de América del Norte y del Sur ordenados de menor a mayor población");
		
		paises.stream()
			.filter(c -> c.getContinente().equals(Continente.AMERICA))
			.sorted(new Comparator<Pais>() {

				@Override
				public int compare(Pais o1, Pais o2) {
					return o1.getPoblacionInt().compareTo(o2.getPoblacionInt());
				}
				
			})
			.forEach(c -> System.out.println(c.getNombre() + " - " + c.getContinente() + " - " + c.getPoblacion()));
		
		System.out.println("------------------");
		System.out.println("Muestra las capitales de todos los países ordenadas alfabéticamente.");
		paises.stream()
			.map(c -> c.getCapital())
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
		System.out.println("------------------");
		System.out.println("Muestra cada continente, y seguido por ‘:’ los países de ese continente");
		

		
		
	}

}
