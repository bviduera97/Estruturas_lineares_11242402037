import java.util.HashMap;
import java.util.Map;

public class Exercicio3 {
    public static void main(String[] args) {

        // Criando o Map
        Map<String, String> paises = new HashMap<>();

        // Adicionando países e capitais
        paises.put("Brasil", "Brasília");
        paises.put("França", "Paris");
        paises.put("Japão", "Tóquio");

        // Mostrando com forEach
        paises.forEach((pais, capital) -> {
            System.out.println(pais + " -> " + capital);
        });
    }
}