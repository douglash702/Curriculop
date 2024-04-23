package portifolioLink;

import java.util.Scanner;

public class JogoAdvinnhar {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numerosA = (int) (Math.random() * 101);
		int tentativas = 10;

		System.out.println("Bem vindo ao jogo de Advinhar o numero");
		System.out.println("Digite um palpite de 1 a 100: ");
		while (tentativas > 0) {
			System.out.println("Digite um numero: ");
			int palpite = entrada.nextInt();

			if (palpite == numerosA) {
				System.out.println("Parabens vocé acertou!!!");
				break;

			} else if (palpite > numerosA) {
				System.out.println("E um numero menor");
				System.out.println("Tentativas restantes " + tentativas);
			} else {
				System.out.println("E um numero maior");
				System.out.println("Tentativas restantes " + tentativas);
			}
			tentativas--;
		}
		if (tentativas == 0) {
			System.out.println("O numeros de tentativas acabou ");
			System.out.println("A resposta correta era " + numerosA);

		}
		entrada.close();
		System.out.println("Fim!!!");

	}

}
