package T7E1;

public class TestT7E1 {
	
	public static void main(String[] args) {
		
		Proceso p1 = new Proceso("3827", "navegador", 0.1, 500, 2);
		Proceso p2 = new Proceso("3227", "notas", 0.01, 200, 4);
		Proceso p3 = new Proceso("5827", "word", 0.2, 900, 3);
		Proceso p4 = new Proceso("3946", "eclipse", 0.5, 1800, 1);
		
		ColaList<Proceso> procesos = new ColaList<>();
		procesos.meter(p1);
		procesos.meter(p2);
		procesos.meter(p3);
		procesos.meter(p4);
		
		//Pintamos los procesos de la cola
		System.out.println(procesos);
		
		//Ahora eliminamos el primer elemento de la cola y volvemos a pintar
		procesos.poll();
		System.out.println(procesos);
		
		//Finalmente visualizamos el primer elemento de la cola
		System.out.println(procesos.peek());
	}

}
