import java.util.LinkedHashMap;

public class Exercicio3_3 {
    public static void main(String[] args) {

        // Criando o LinkedHashMap
        LinkedHashMap<String, Integer> filmes = new LinkedHashMap<>();

        // Adicionando filmes e anos
        filmes.put("Interestelar", 2014);
        filmes.put("Matrix", 1999);
        filmes.put("A Origem", 2010);

        // Mostrando os dados
        filmes.forEach((filme, ano) -> {
            System.out.println(filme + " -> " + ano);
        });
    }
}