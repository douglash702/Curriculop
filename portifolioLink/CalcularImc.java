package portifolioLink;

import java.util.Scanner;

public class CalcularImc {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double peso = 0;
		double altura = 0;
		boolean continuar = true;
		System.out.println("Digitie seu peso/ exemplo = 60: ");
		peso = entrada.nextDouble();
		System.out.println("Digite sua Altura/ exemplo = 1,72: ");
		altura = entrada.nextDouble();

		double imc = peso / Math.pow(altura, 2);
		System.out.println("O seu imc é " + imc);

		entrada.close();

	}
}
