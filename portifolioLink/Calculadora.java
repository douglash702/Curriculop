package portifolioLink;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {

			System.out.println("Digite a operação");
			System.out.println("1. Soma");
			System.out.println("2. Subtração");
			System.out.println("3. Multiplicação");
			System.out.println("4. Divisão");
			int opcao = entrada.nextInt();
			if (opcao >= 1 && opcao <= 4) {
				System.out.println("Digite um numero: ");
				double num1 = entrada.nextDouble();
				System.out.println("Digite um numero: ");
				double num2 = entrada.nextDouble();

				switch (opcao) {
				case 1:
					System.out.println("Resultado:  " + soma(num1, num2));
					break;
				case 2:
					System.out.println("Resultado: " + subtracao(num1, num2));
					break;
				case 3:
					System.out.println("Resultado: " + multiplicacao(num1, num2));
					break;
				case 4:
					System.out.println("Resultado: " + divisao(num1, num2));
					break;

				}

			} else if (opcao == 5) {
				continuar = false;
			} else {
				System.out.println("Opção inválida");
			}
		}
		entrada.close();
		System.out.println("Calculadora encerrada.");
	}

	public static double soma(double a, double b) {
		return a + b;
	}

	public static double subtracao(double a, double b) {
		return a - b;
	}

	public static double multiplicacao(double a, double b) {
		return a * b;
	}

	public static double divisao(double a, double b) {
		if (b != 0) {
			return a / b;
		} else {
			System.out.println("Não e possivel dividir por zero. Tente novamente.");
			return Double.NaN;
		}
	}

}
