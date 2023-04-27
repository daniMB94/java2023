package practica2ejer2;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class TestPeliculas {

	public static void main(String[] args) {
		
		Genero Horror = new Genero("horror");
		Genero Scifi = new Genero("sci-fi");
		Genero Comedia = new Genero("comedia");
		Genero Thriller = new Genero("thriller");
		Genero Drama = new Genero("drama");
		Genero Accion = new Genero("accion");
		
		Director RidleyScott = new Director("Ridley Scott");
		Director FFCoppola = new Director("F.F. Coppola");
		Director CNolan = new Director("C. Nolan");
		Director MartinScorsese = new Director("Martin Scorsese");
		Director QuentinTarantino = new Director("Quentin Tarantino");
		
		Pelicula PullFiction = new Pelicula("Pull Fiction", 1994);
		Pelicula ReservoirDogs = new Pelicula("Reservoir Dogs", 1992);
		Pelicula Gladiator = new Pelicula("Gladiator", 2000);
		Pelicula BladeRunner = new Pelicula("Blade Runner", 1982);
		Pelicula Alien = new Pelicula("Alien", 1979);
		Pelicula ApocalypseNow = new Pelicula("Apocalypse Now", 1979);
		Pelicula ElPadrino = new Pelicula("El Padrino", 1972);
		Pelicula Tenet = new Pelicula("Tenet", 2020);
		Pelicula Origen = new Pelicula("Origen", 2010);
		Pelicula Casino = new Pelicula("Casino", 1995);
		Pelicula Goodfellas = new Pelicula("Goodfellas", 1990);
		Pelicula ElLoboDeWallStreet = new Pelicula("El Lobo De Wall Street", 2013);
		
		QuentinTarantino.addPelicula(PullFiction);
		QuentinTarantino.addPelicula(ReservoirDogs);
		RidleyScott.addPelicula(Gladiator);
		RidleyScott.addPelicula(BladeRunner);
		RidleyScott.addPelicula(Alien);
		FFCoppola.addPelicula(ApocalypseNow);
		FFCoppola.addPelicula(ElPadrino);
		CNolan.addPelicula(Tenet);
		CNolan.addPelicula(Origen);
		MartinScorsese.addPelicula(Goodfellas);
		MartinScorsese.addPelicula(Casino);
		MartinScorsese.addPelicula(ElLoboDeWallStreet);
		
		PullFiction.addGenero(Drama);
		ReservoirDogs.addGenero(Drama);
		Gladiator.addGenero(Accion);
		BladeRunner.addGenero(Thriller);
		Alien.addGenero(Horror);
		ApocalypseNow.addGenero(Drama);
		ElPadrino.addGenero(Drama);
		Tenet.addGenero(Accion);
		Origen.addGenero(Scifi);
		Casino.addGenero(Thriller);
		Goodfellas.addGenero(Drama);
		ElLoboDeWallStreet.addGenero(Comedia);
		
		PullFiction.addDirector(QuentinTarantino);
		ReservoirDogs.addDirector(QuentinTarantino);
		Gladiator.addDirector(RidleyScott);
		BladeRunner.addDirector(RidleyScott);
		Alien.addDirector(RidleyScott);
		ApocalypseNow.addDirector(FFCoppola);
		ElPadrino.addDirector(FFCoppola);
		Tenet.addDirector(CNolan);
		Origen.addDirector(CNolan);
		Casino.addDirector(MartinScorsese);
		Goodfellas.addDirector(MartinScorsese);
		ElLoboDeWallStreet.addDirector(MartinScorsese);
		
		
		ArrayList<Pelicula> peliculas = new ArrayList<>();
		
		peliculas.add(ElLoboDeWallStreet);
		peliculas.add(Alien);
		peliculas.add(ApocalypseNow);
		peliculas.add(BladeRunner);
		peliculas.add(Casino);
		peliculas.add(ElPadrino);
		peliculas.add(Gladiator);
		peliculas.add(Goodfellas);
		peliculas.add(Origen);
		peliculas.add(PullFiction);
		peliculas.add(ReservoirDogs);
		peliculas.add(Tenet);
		
		System.out.println("pelisOrdenadasPorAño(): muestra todas las películas ordenadas por año.");
		
		peliculas.stream()
			.sorted((x,y) -> x.getAnioInteger().compareTo(y.getAnioInteger()))
			.forEach(System.out::println);

		System.out.println("scifi2000(): muestra las películas de ciencia ficción posteriores al año 2000");
		
		peliculas.stream()
			.filter(c -> c.getGeneros().contains(Scifi))
			.filter(c -> c.getAnio() > 2000)
			.forEach(System.out::println);

		System.out.println("tituloMasLargo(): muestra la película cuyo título es más largo");
		
		String tituloLargo = peliculas.stream()
								.max((x,y) -> x.getTitulo().length()-y.getTitulo().length())
								.get()
								.getTitulo();
		System.out.println(tituloLargo);
		
		System.out.println("directoresMayúsculas(): muestra los nombres de los directores ordenados y en mayúsculas");
		
		peliculas.stream()
			.flatMap(c -> c.getDirectores().stream())
			.distinct()
			.map(c -> c.getNombre())
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);

		System.out.println("numPelis(): muestra el director y al lado el número de películas de cada director. Hay que usar \r\n"
				+ "collect");
		
		Map<String, Integer> directorNPeliculas = peliculas.stream()
															.flatMap(c -> c.getDirectores().stream())
															.distinct()
															.collect(Collectors.toMap(c -> c.getNombre(), c -> c.getPeliculas().size()));
		
		directorNPeliculas.forEach((k, v) -> System.out.println("Director: " + k + " -> N. Peliculas: " + v));
		
		System.out.println("dramaYMafia(): muestra todas las películas de drama y mafia. Usa dos Predicate");

		System.out.println("Filmografías(): muestra las películas de cada director ordenadas por año. Que aparezca nombre \r\n"
				+ "de director y debajo sus películas ordenadas por año.");
		
		peliculas.stream()
			.flatMap(c -> c.getDirectores().stream())
			.distinct()
			.sorted((x, y) -> x.getPeliculas().)
			.forEach(c -> {
				System.out.println(c.getNombre());
				c.getPeliculas().forEach(p -> System.out.println(p.getTitulo() + " " + p.getAnio()));
			});
	}
}
