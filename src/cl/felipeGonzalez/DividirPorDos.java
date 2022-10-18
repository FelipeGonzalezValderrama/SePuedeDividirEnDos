package cl.felipeGonzalez;

import java.util.Scanner;

public class DividirPorDos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("escriba su numero para verificar si es divisible en 2: ");
		int num = sc.nextInt();
		System.out.println("el resultado es: "+num/2);

		if (num % 2 == 0) {
			System.out.println("el numero: "+ num + " SI es divisible por 2");
			
			}else {
				System.out.println("el numero: "+num+ " NO es divisible por 2");

		}

	}

}
