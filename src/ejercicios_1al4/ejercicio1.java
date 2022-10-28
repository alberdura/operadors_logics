package ejercicios_1al4;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// Escriu un programa que demani 2 números i digui si els dos són parells, o un o els dos són senars.
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Introduce el primer numero: ");
		num1 = teclado.nextInt();
		System.out.print("Introduce el segundo numero: ");
		num2 = teclado.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println("El numero 1 es par");
		}
		if (num1 % 2 != 0) {
			System.out.println("El numero 1 es impar");
		}
		if (num2 % 2 == 0) {
			System.out.println("El numero 2 es par");
		}
		if (num2 % 2 != 0) {
			System.out.println("El numero 2 es impar");
			
		}
		teclado.close();
	}

}
