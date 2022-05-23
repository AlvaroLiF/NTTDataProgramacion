package nttdata.javat1.game;

import java.util.Scanner;

/**
 * Clase Stage
 * 
 * @author Alvaro L
 *
 */

public class Stage {

	/**
	 * Método que permite escoger un escenario
	 */

	protected static void chooseStage() {
		// Variables
		String stage = null;
		int numS;
		// Inicialización del scanner
		Scanner sc = new Scanner(System.in);
		// Lógica para escoger el escenario
		do {
			System.out.println("Selecciona el mapa donde jugar");
			System.out.println("1 - Las ruinas de Burún");
			System.out.println("2 - El desierto de Namib");
			System.out.println("3 - La orilla del río Loggon");
			System.out.println("4 - El acantilado de Kaku");
			numS = sc.nextInt();
			switch (numS) {
			case 1:
				stage = "Las ruinas de Burún";
				break;
			case 2:
				stage = "El desierto de Namib";
				break;
			case 3:
				stage = "La orilla del río Loggon";
				break;
			case 4:
				stage = "El acantilado de Kaku";
				break;
			default:
				System.out.println("Escoge un mapa para continuar");
			}
		} while (!(numS >= 1 && numS <= 4));
		// Imprime el escenario escogido por consola
		System.out.println();
		System.out.println("Has escogido " + stage);
		System.out.println();
	}

}
