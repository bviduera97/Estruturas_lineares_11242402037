import java.util.ArrayList;

public class TreinoArrayList {
    public static void main(String[] args) {

        // DECLARAÇÃO
        ArrayList<String> tarefas = new ArrayList<>();

        // ADIÇÃO SIMPLES
        tarefas.add("Estudar Java");
        tarefas.add("Fazer café");
        tarefas.add("Limpar quarto");

        // INSERÇÃO COM PRIORIDADE
        tarefas.add(0, "Ligar para o médico");

        // SUBSTITUIÇÃO
        int indice = tarefas.indexOf("Limpar quarto");
        if (indice != -1) {
            tarefas.set(indice, "Organizar mesa");
        }

        // SAÍDA DE DADOS
        System.out.println("Lista completa: " + tarefas);
        System.out.println("Tamanho da lista: " + tarefas.size());

        // BUSCA E VERIFICAÇÃO
        if (tarefas.contains("Estudar Java")) {
            int pos = tarefas.indexOf("Estudar Java");
            System.out.println("A tarefa 'Estudar Java' está no índice: " + pos);
        }

        // REMOÇÃO POR ÍNDICE
        tarefas.remove(0);

        // REMOÇÃO POR OBJETO
        tarefas.remove("Fazer café");

        // FINALIZAÇÃO
        tarefas.clear();
        System.out.println("Lista está vazia? " + tarefas.isEmpty());
    }
}