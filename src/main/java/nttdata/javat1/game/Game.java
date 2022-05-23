package nttdata.javat1.game;

import java.util.*;

/**
 * Clase Game
 * 
 * @author Alvaro L
 *
 */
public class Game {

	/**
	 * 
	 * Método launchAndStart
	 * 
	 */

	public static void launchAndStart() {

		// Se invocan las otras clases, a la clase del juego
		Stage.chooseStage();
		Difficulty.chooseDifficulty();
		Ball.chooseBall();
		Random ran = new Random();

		// Variable final con el número de tiradas en una misma partida
		final int MAXGAMEATTEMPTS = Ball.gameAttempts;
		// Lógica del juego
		for (int numberGame = 1; numberGame <= MAXGAMEATTEMPTS; numberGame++) {
			// Variables
			int ball = 0;
			int rebounds = 0;
			int hole;
			int score = 0;
			hole = ran.nextInt(1000);
			while (ball != hole) {
				ball = ran.nextInt(1000);
				rebounds++;
				if (ball >= 175 && ball <= 243) {
					score = rebounds * 3;
				} else if (ball >= 542 && ball <= 627) {
					score = rebounds * 2;
				} else {
					score = rebounds * 1;
				}
			}
			// Imprime los scores de las partidas en consola
			System.out.println("SCORE " + numberGame);
			System.out.println("-------");
			System.out.println(score * Difficulty.getMultiplier());
			System.out.println();
		}
	}
}
