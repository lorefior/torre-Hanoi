package torrehanoi;

import java.util.*;


public class TorreHanoi {
	
	public static int contador=0 ;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		System.out.println("Numero de discos: ");
		n = entrada.nextInt();
		contador = Hanoi(n, 1, 2, 3); // 1:origen 2:aux 3:destino
		System.out.println("Ganaste!!");
		System.out.println("Cantidad de pasos: " + contador);

	}

//Método Torres de Hanoi Recursivo
	public static int Hanoi(int n, int origen, int aux, int destino) 
	{
		
		if (n == 1) {
			System.out.println("mover disco de columna " + origen + " a " + destino);
		} else {
			Hanoi(n - 1, origen, destino, aux);
			System.out.println("mover disco de columna " + origen + " a " + destino);
			////
			Hanoi(n - 1, aux, origen, destino);

		}
		
		contador++;
		
		return contador;
		
	}

}