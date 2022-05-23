package nttdata.javat1.game;

import java.util.Scanner;

/**
 * Clase Ball
 * 
 * @author Alvaro L
 *
 */

public class Ball {

	// Variable static con las tiradas por partida
	static int gameAttempts;

	/**
	 * Getter que devuelve las tiradas por partida
	 * 
	 * @return gameAttempts
	 */

	public static int getGameAttempts() {
		return gameAttempts;
	}

	/**
	 * Método que permite escoger la bola
	 */
	protected static void chooseBall() {
		// Variables
		String ball = null;
		String space = "-----------------------------";
		int numS;
		// Inicialización del scanner
		Scanner sc = new Scanner(System.in);
		// Lógica para escoger la bola
		do {
			System.out.println("Selecciona la bola a utilizar");
			System.out.println();
			System.out.println("1 - Bola de la fortuna");
			System.out.println(space);
			System.out.println("Esta bola te concede 5 tiradas en el juego");
			System.out.println();
			System.out.println("2 - Bola de plata mercurial");
			System.out.println(space);
			System.out.println("Esta bola te concede 3 tiradas en el juego");
			System.out.println();
			System.out.println("3 - Bola del 8 mística");
			System.out.println(space);
			System.out.println("Esta bola te concede 2 tiradas en el juego");
			System.out.println();
			System.out.println("4 - Bola de la plenitud");
			System.out.println(space);
			System.out.println("Esta bola te concede 1 tiradas en el juego");
			System.out.println();
			numS = sc.nextInt();
			switch (numS) {
			case 1:
				ball = "Bola de la fortuna";
				gameAttempts = 5;
				break;
			case 2:
				ball = "Bola de plata mercurial";
				gameAttempts = 3;
				break;
			case 3:
				ball = "Bola del 8 mística";
				gameAttempts = 2;
				break;
			case 4:
				ball = "Bola de la plenitud";
				gameAttempts = 1;
				break;
			default:
				System.out.println("Escoge un mapa para continuar");
			}
		} while (!(numS >= 1 && numS <= 4));
		// Imprime la bola escogida por consola
		System.out.println();
		System.out.println("Has escogido la " + ball);
		System.out.println();
	}

}
