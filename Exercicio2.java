import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            int numero;

            while (true) {
                System.out.print("Digite um número para a posição " + i + ": ");
                numero = sc.nextInt();

                // Verifica regra
                if (i % 2 == 0 && numero % 2 == 0) {
                    break; // posição par com número par
                } else if (i % 2 != 0 && numero % 2 != 0) {
                    break; // posição ímpar com número ímpar
                } else {
                    System.out.println("Erro! Número inválido para essa posição.");
                }
            }

            vetor[i] = numero;
        }

        System.out.println("Vetor preenchido corretamente!");

        sc.close();
    }
}