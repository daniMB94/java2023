package Tema3;

public class EjemploCadenas {

	public static void main(String[] args) {

		String cadena1 = "Hola mundo"; //Esta forma habitualmente
		String cadena2 = new String("Hola mundo cruel mundo");
		String cadena3 = ""; //cadena nula
		String cadena4 = "DAW";
		
		System.out.println("Hola mundo"); //Java crea un String sin que nos demos cuenta (Objeto de tipo String)
		
		System.out.println(cadena1.length()); //devuelve la longitud de cadena1
		System.out.println(cadena1.startsWith("Ho")); //devuelve verdadero si empieza por "Ho"
		
		System.out.println(cadena1.indexOf("mundo")); //devuelve la posicion de una subcadena en una cadena. Si no aparece devuelve -1
		System.out.println(cadena2.indexOf("mundo",6)); //Igual que lo anterior pero empieza a buscar a partir de la posicion fijada (6)
		
		cadena4 = cadena4 + cadena1; //las cadenas no cambian de tamaño. En este caso cadena4 crea un objeto formado por 3 objetos. No es eficiente
		cadena3 = cadena3.concat(cadena1).concat(cadena3); //+ y concat hacen lo mismo, unir cadenas
		System.out.println(cadena4);
		System.out.println(cadena3);
		
		System.out.println(cadena3.substring(0, 3)); //genera subcadenas
		
		System.out.println(String.valueOf(10.5f)); //convierte un string a int, double, etc
		//de numero a string se usa String.valurOf(numero)
		
		String cadena5 = "149.95";
		double precio = Double.parseDouble(cadena5);
		System.out.println(cadena5 + 1);
		//Para pasar de String a número se usa Integer.parseInt(str), etc
		
		String cadena6 = "149.95";
		if(cadena5.equals(cadena6)) { //las comparaciones de cadenas se deben hacer con equals en vez de con == aunque ambas funcionan
			System.out.println("Son iguales");
		}
		
		String cadena7 = "Elefante";
		String cadena8 = "Camello";
		System.out.println(cadena7.compareTo(cadena8)); //devuelve la distancia (alfabéica) del primer caracter de la primera cadena con respecto al primer caracter de la segunda cadena
		
		
	}

}
