import java.util.LinkedList;
import java.util.Queue;

public class FilaSuporte {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // 1) Adicionar 4 clientes
        fila.add("Cliente A");
        fila.add("Cliente B");
        fila.add("Cliente C");
        fila.add("Cliente D");

        // 2) Exibir o próximo cliente (sem remover)
        System.out.println("Próximo cliente: " + fila.peek());

        // 3) Remover os dois primeiros clientes
        System.out.println("Atendimento concluído para: " + fila.poll());
        System.out.println("Atendimento concluído para: " + fila.poll());

        // 4) Exibir quantos restam
        System.out.println("Clientes restantes: " + fila.size());

        // 5) Adicionar novo cliente
        fila.add("Cliente E");

        // Exibir fila final
        System.out.println("Fila final: " + fila);
    }
}