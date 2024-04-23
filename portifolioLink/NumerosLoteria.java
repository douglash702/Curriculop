package portifolioLink;

import java.util.Arrays;
import java.util.Random;

public class NumerosLoteria {
	public static void main(String[] args) {

		int quantidadeN = 6;
		int[] NumerosLoteria = gerarNumerosLoteria(quantidadeN);
		System.out.println("Numeros da loteria: " + Arrays.toString(NumerosLoteria));
		System.out.println("Boa Sorte");

	}

	public static int[] gerarNumerosLoteria(int quantidadeN) {

		int[] numeros = new int[quantidadeN];
		Random aleatorio = new Random();

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = aleatorio.nextInt(60) + 1; // gerar numero de 1 a 60

		}
		return numeros;

	}
}
