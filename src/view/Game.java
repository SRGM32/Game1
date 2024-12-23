package view;

import java.util.Scanner;

import model.calcular;

public class Game {

	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static calcular calc;

	public static void main(String[] args) {
		Game.jogar();

	}

	public static void jogar() {
		System.out.println("Informe o nível de dificuldade podendo ser 1, 2, 3 ou 4");
		int dificuldade = Game.teclado.nextInt();

		Game.calc = new calcular(dificuldade);

		System.out.println("Informe o resultado para a seguinte operação: ");

		// somar
		if (calc.getOperacao() == 0) {
			System.out.println(calc.getValor1() + " + " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.somar(resposta)) {
				// ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " ponto(s).");

			}
		}
		// diminuir
		else if (calc.getOperacao() == 1) {
			System.out.println(calc.getValor1() + " - " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.diminuir(resposta)) {
				// ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " ponto(s).");

			}
		}
		// multiplicar
		else if (calc.getOperacao() == 2) {
			System.out.println(calc.getValor1() + " * " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.multiplicar(resposta)) {
				// ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " ponto(s).");

			}
		} else {
			System.out.println("A operação " + calc.getOperacao() + " não é reconhecida.");
		}
		System.out.println("Deseja continuar? [1- sim, 0 - não]");
		int continuar = Game.teclado.nextInt();

		if (continuar == 1) {
			Game.jogar();
		} else {
			System.out.println("você fez " + Game.pontos + " ponto(s)");
			System.out.println("Até a próxima!");
			System.exit(0);
		}
	}
}
