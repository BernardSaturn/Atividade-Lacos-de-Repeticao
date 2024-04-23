package lacosdedepeticao;

import java.util.Scanner;

public class AtividadeFor {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int par = 0;
		int impar = 0;

		for (int num = 1; num <= 10; num++) {
			System.out.print("Digite o " + num + "º número: ");
			int leia = scanner.nextInt();

			if (leia % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.println("\nTotal de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);

		scanner.close();
	}
}
