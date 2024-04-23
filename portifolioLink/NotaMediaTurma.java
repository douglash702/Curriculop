package portifolioLink;

import java.util.Scanner;

public class NotaMediaTurma {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int alunos = 0;
		double notas = 0;
		double total = 0;
		String conceito = "";
		while (notas != -1) {
			System.out.println("Digite a nota do aluno/ou menos -1 para sair");
			notas = entrada.nextDouble();
			if (notas <= 10 && notas >= 0) {
				total += notas;
				alunos++;

			} else {

				System.out.println("Nota invalida");
			}

		}
		double media = total / alunos;
		System.out.println("A media da turma é " + media);

		if (media >= 9 && media <= 10) {
			conceito = "A";

		} else if (media >= 7.0) {
			conceito = "B";

		} else if (media >= 5.0) {
			conceito = "C";

		} else if (media >= 3.0) {
			conceito = "D";

		} else {
			conceito = "E";

		}

		System.out.println("O conceito da turma é: " + conceito);
		entrada.close();

	}
}
