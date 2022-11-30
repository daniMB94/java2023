package Tema3;

public class EjemploStringBuffer {

	public static void main(String[] args) {

		StringBuffer strb = new StringBuffer();
		StringBuffer strb1 = new StringBuffer();
		
		for(int i = 0; i < 20; i++) {
			strb.append("Hola "); //el .append añade al buffer lo que hay dentro
		}
		
		String resultado = strb.toString();
		
		System.out.println(resultado);
		
		for(int i = 0; i < 20; i++) { //Esta es la manera correcta de ir añadiendo String a un objeto
			strb1.append(i);
			strb1.append(" ");
		}
		
		String numeros = strb1.toString();
		System.out.println(numeros);
		
		String cadena = "";
		for(int i = 0; i< 20; i++) { //Esto va creando objetos String y no es eficiente desde el punto de vista de la memoria
			cadena = cadena + String.valueOf(i);
			cadena = cadena + " ";
		}
		
		System.out.println(cadena);
;	}

}
