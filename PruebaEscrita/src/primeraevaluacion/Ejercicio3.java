package primeraevaluacion;

import java.util.Arrays;

public class Ejercicio3 {
	//METODOS
	//a)
	public static void rellenar(int vector[], int valor) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = 100;
		}
	}
	
	//b)
	public static void ordenar(int vector[]) {
		int aux;
		
		for(int i = vector.length; i > 0; i--)	{
			for(int j = 0; j < i - 1; j++) {
				if(vector[j] > vector[j+1]) {
					
					aux = vector[j+1];
					vector[j+1] = vector[j];
					vector[j] = aux;
				}
			}
		}
	}
	
	//c)
	public static String pintar(int vector[]) {
		String vectorPintado = "";
		for(int i = 0; i < vector.length; i++){
			vectorPintado = vectorPintado + " " + vector[i];
		}
		return vectorPintado;
	}

	public static void main(String[] args) {

		//TAREAS
		//a)
		int vector[] = new int[50];
		//b)
		Arrays.fill(vector, 100);
		//c)
		Arrays.toString(vector);
		//d)
		Arrays.sort(vector);
		//e)
		Arrays.toString(vector);
		//f)
		int vectorCopiado[] = new int[50];
		vectorCopiado = Arrays.copyOf(vector, vector.length);
		//g)
		Arrays.toString(vectorCopiado);
		
		int vectorFuncion[] = new int[50];

		//METODOS
		rellenar(vectorFuncion, 100);
		ordenar(vectorFuncion);
		pintar(vectorFuncion);
		
		
	}

}
