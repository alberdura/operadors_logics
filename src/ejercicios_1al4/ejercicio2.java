package ejercicios_1al4;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// Escriu un programa que demani 1 paraula, i digui si està entre alguna de les tres següents: 
		//“Arxiu”, “Buscar”, “Sortir”, en cas que no hi estigui, indicar que hi ha un error.
		
		Scanner teclado = new Scanner(System.in);
		String arx = "Arxiu";
		String bus = "Buscar";
		String sor = "Sortir";
		String escrito;
		
		System.out.println("Escribe Arxiu, Buscar o Sortir: ");
		escrito = teclado.nextLine();
		
		if (escrito == arx | escrito == bus | escrito == sor) {
			System.out.println("¡¡¡Bien hecho!!!");
			
		}
		else {
			System.out.println("¡¡¡Super mal, no has escrito lo que te he dicho!!!");
		}
		teclado.close();

	}

}
