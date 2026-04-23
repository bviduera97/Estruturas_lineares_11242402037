public class ListaCaracteres {

    private char[] lista;
    private int tamanho;

    // construtor
    public ListaCaracteres(int capacidade) {
        lista = new char[capacidade];
        tamanho = 0;
    }

    // adicionar no final
    public void adicionar(char c) {
        if (tamanho < lista.length) {
            lista[tamanho] = c;
            tamanho++;
        } else {
            System.out.println("Erro: lista cheia!");
        }
    }

    // remover do final
    public void remover() {
        if (tamanho > 0) {
            tamanho--;
        } else {
            System.out.println("Erro: lista vazia!");
        }
    }

    // concatenar
    public String concatenar() {
        String resultado = "";
        for (int i = 0; i < tamanho; i++) {
            resultado += lista[i];
        }
        return resultado;
    }

    // verificar palíndromo
    public boolean ehPalindromo() {
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio < fim) {
            if (lista[inicio] != lista[fim]) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }

    // codificar (somar +1 em cada caractere)
    public String codificar() {
        String resultado = "";
        for (int i = 0; i < tamanho; i++) {
            char novo = (char) (lista[i] + 1);
            resultado += novo;
        }
        return resultado;
    }

    // mostrar lista (extra pra teste)
    public void mostrar() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }

    // main para testar
    public static void main(String[] args) {
        ListaCaracteres lista = new ListaCaracteres(10);

        lista.adicionar('o');
        lista.adicionar('v');
        lista.adicionar('o');

        lista.mostrar();

        System.out.println("Concatenado: " + lista.concatenar());
        System.out.println("É palíndromo? " + lista.ehPalindromo());
        System.out.println("Codificado: " + lista.codificar());

        lista.remover();
        lista.mostrar();
    }
}