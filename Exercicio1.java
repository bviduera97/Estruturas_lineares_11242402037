import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        int soma = 0;

        // Lendo os 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        // Somando posições pares (0,2,4,6,8)
        for (int i = 0; i < 10; i += 2) {
            soma += vetor[i];
        }

        System.out.println("Soma das posições pares: " + soma);

        sc.close();
    }
}