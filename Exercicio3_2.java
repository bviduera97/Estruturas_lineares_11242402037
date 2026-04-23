import java.util.TreeMap;

public class Exercicio3_2 {
    public static void main(String[] args) {

        // Criando o TreeMap
        TreeMap<String, Integer> cidades = new TreeMap<>();

        // Adicionando cidades e populações
        cidades.put("São Paulo", 11451999);
        cidades.put("Rio de Janeiro", 6211223);
        cidades.put("Belo Horizonte", 2315560);

        // Mostrando os dados
        cidades.forEach((cidade, populacao) -> {
            System.out.println(cidade + " -> " + populacao);
        });
    }
}