package practica3ejer2;

import java.io.File;
import java.io.IOException;
import java.lang.StackWalker.Option;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtils {
	
	//Creamos un atributo publico y estático para poder acceder a el en los métodos
	public static Path ruta = Paths.get("C:/Users/dani_/OneDrive/Documentos/11PRUEBA");

	public static void main(String[] args) throws IOException {
		
		
		
		String aBuscar = ".txt";
		String aEliminar = "JAVA";
		
		FileUtils.rutasContains(aBuscar);
		FileUtils.tamanioDirectorio();
		FileUtils.aEliminar(aEliminar);

		
	}
	
	public static void tamanioDirectorio() throws IOException {
		
		long size = Files.walk(ruta)
                .filter(c -> c.toFile().isFile())
                .mapToLong(dir -> dir.toFile().length())
                .sum();
        System.out.println("El tamaño del directorio es: " + size + " bytes");
		


	}
	
	public static void rutasContains(String aBuscar) {
		
		try {
			Files.find(ruta, 5, (path, attr) -> path.toString().endsWith(aBuscar))
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void aEliminar(String aEliminar) {
		
		Path uri = Paths.get(ruta.toString() + aEliminar);
     
        try {
            if(Files.deleteIfExists(uri))
            	 System.out.println("El archivo " + aEliminar + " ha sido eliminado.");
            else
            	System.out.println("No se ha eliminado ningún archivo");
           
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el archivo " + aEliminar);
        }		
		
		
	}
	
}
