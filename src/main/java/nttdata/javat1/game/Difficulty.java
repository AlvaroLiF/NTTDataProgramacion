package nttdata.javat1.game;

import java.util.Scanner;

/**
 * Clase Difficulty
 * 
 * @author Alvaro L
 *
 */

public class Difficulty {

	// Variable static con el multiplicador de score asocidado a la dificultad
	static int multiplier;

	/**
	 * Getter que devuelve el multiplicador asociado a la dificultad
	 * 
	 * @return multiplier
	 */
	public static int getMultiplier() {
		return multiplier;

	}

	/**
	 * Método que permite escoger la dificultad
	 */
	protected static void chooseDifficulty() {
		// Variables
		String difficulty = null;
		int numS;
		// Inicialización del scanner
		Scanner sc = new Scanner(System.in);
		// Lógica para escoger la dificultad
		do {
			System.out.println("Selecciona la dificultad");
			System.out.println("1 - Fácil");
			System.out.println("2 - Medio");
			System.out.println("3 - Difícil");
			System.out.println("4 - Experto");
			System.out.println("5 - Extremo");
			numS = sc.nextInt();
			switch (numS) {
			case 1:
				difficulty = "Dificultad : Fácil";
				multiplier = 2;
				break;
			case 2:
				difficulty = "Dificultad : Medio";
				multiplier = 4;
				break;
			case 3:
				difficulty = "Dificultad : Difícil";
				multiplier = 6;
				break;
			case 4:
				difficulty = "Dificultad : Experto";
				multiplier = 8;
				break;
			case 5:
				difficulty = "Dificultad : Extremo";
				multiplier = 10;
				break;
			default:
				System.out.println("Escoge el nivel de dificultad");
			}
		} while (!(numS >= 1 && numS <= 5));
		// Imprime la dificultad escogida por consola
		System.out.println();
		System.out.println(difficulty);
		System.out.println();
	}

}
