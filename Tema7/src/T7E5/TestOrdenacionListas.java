package T7E5;


public class TestOrdenacionListas {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		OrdenacionListas o1 = new OrdenacionListas();
		OrdenacionListas o2 = new OrdenacionListas();
		
		/*Ahora llamamos al método "OrdenaciónMezcla" creando una clase con un paramétro cualquiera solo para usar este método*/
		/*Este método lo que hará será afectar a las 2 colas
		pasadas como parámetro para modificar el atributo estátitco "colaGeneral"*/
		
		
		new OrdenacionListas(1).OrdenacionMezcla(o1.cola, o2.cola);
		
		
		//Una vez ordenado el atributo estático lo recorremos y lo imprimimos
		
		for (Integer elementos : OrdenacionListas.colaGeneral) {
			
			sb.append(elementos + " ");
		}
		
		System.out.println(sb);
		
	}

}
