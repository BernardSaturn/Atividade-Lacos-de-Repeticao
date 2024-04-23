package lacosdedepeticao;

import java.util.Scanner;

public class AtividadeDoWhile {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int total = 0;
        
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero > 0) {
                total += numero;
            }
            
        } while (numero != 0);
        
        System.out.println("A soma dos números positivos é: " + total);
        
        scanner.close();
    }
}
