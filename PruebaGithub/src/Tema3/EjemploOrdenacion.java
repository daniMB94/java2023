package Tema3;

import java.util.Arrays;

public class EjemploOrdenacion {

	public static void burbuja(int numeros[]) {
		
		int aux;
		
		for(int i = numeros.length; i > 0; i--)	{
			for(int j = 0; j < i - 1; j++) {
				if(numeros[j] > numeros[j+1]) {
					//Intercambiar
					aux = numeros[j+1];
					numeros[j+1] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		//IMPORTANTE: los arrays se pasan por referrencia en Java automáticamente
		
		
		//Declaración del array
		int nums[] = new int[20];
		
		//Rellenar con números aleatorios
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}
		
		//Fill
		//Arrays.fill(nums, 10);
		
		//Pintar array
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
		//Ordenar
		burbuja(nums);
		
		//Ordenar con Java
		//Arrays.sort(nums); ES EL ORDENDOR DE JAVA
		
		System.out.println();
		
		//Pintar array
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	}

}
