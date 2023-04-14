package T7E5;

import java.util.LinkedList;

public class TestOrdenacionListas {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		OrdenacionListas o1 = new OrdenacionListas();
		OrdenacionListas o2 = new OrdenacionListas();
		
		/*Ahora llamamos al método "OrdenaciónMezcla" y este método
		 * lo que hará será afectar a las 2 colas
		pasadas como parámetro para modificar el atributo estátitco "colaGeneral"*/
		
		
		new OrdenacionListas().OrdenacionMezcla(o1.cola, o2.cola);
		
		
		//Una vez ordenado el atributo estático lo recorremos y lo imprimimos
		
		for (Integer elementos : o1.colaGeneral) {
			
			sb.append(elementos + " ");
		}
		
		System.out.println(sb);
		
	}

}
