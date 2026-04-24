import java.util.Stack;

public class ManutencaoProduto {

    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();

        String[] produto = {"p1", "p2", "p3", "p4", "p5"};
        String defeituosa = "p3";

        int i = produto.length - 1;

        // 1) Retirar e empilhar até achar a defeituosa
        while (!produto[i].equals(defeituosa)) {
            pilha.push(produto[i]);
            i--;
        }

        // 2) Remover peça defeituosa
        System.out.println("Removendo: " + produto[i]);

        // 3) Inserir nova peça
        produto[i] = "p3_nova";

        // 4) Recolocar peças da pilha
        i++;
        while (!pilha.isEmpty()) {
            produto[i] = pilha.pop();
            i++;
        }

        // Resultado final
        System.out.println("Produto final:");
        for (String p : produto) {
            System.out.print(p + " ");
        }
    }
}