package par_impar;

import java.util.Scanner;

public class par_impar {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int n;
		boolean condicion;

		do {

			System.out.println("introduce un numero par entre 1000 y 2000");
			n = teclado.nextInt();

			condicion=par(n);

		} while (condicion != false);
	}

	public static boolean par(int n) {

		boolean comprobador = true;

		if (n <= 2000 && n >= 1000 && n % 2 == 0) {
			System.out.println("correcto");
			comprobador = true;
		}

		else {

			System.out.println("incorrecto");
			comprobador = false;
		}
		return comprobador;
	}

}
