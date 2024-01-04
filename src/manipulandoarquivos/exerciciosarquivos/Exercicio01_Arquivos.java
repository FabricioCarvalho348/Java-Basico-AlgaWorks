package manipulandoarquivos.exerciciosarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01_Arquivos {

    public static void main(String[] args) throws IOException {
        /*
        Crie um programa que vai receber, através do console, uma lista de atividades que vai ajudar o usuário a planejar suas tarefas para o dia seguinte.
        Depois que o usuário informar, uma a uma, suas tarefas, as mesmas serão salvas em um arquivo de texto - cada tarefa vai ocupar uma linha desse arquivo.
        Para receber cada tarefa do usuário, use o laço while. Enquanto o usuário não digitar um "x" no console, continue pedindo que ele informe as atividades.
         */

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listaTarefas = new ArrayList<String>();

        String tarefa;
        int i = 0;
        while (true) { // Deixei o true como condição do laço, pois, o que vai pará-lo é o fato do usuário digitar o "x" no console.
            System.out.print("Tarefa " + i + ": ");
            tarefa = scanner.nextLine();

            if ("x".equals(tarefa)) {
                break; // Essa é a única maneira de parar esse laço.
            }

            listaTarefas.add(tarefa);
            i++;
        }

        escreverNoArquivo("C:/tempES/ws-cursos-java/APRENDENDO/algoritmos/Algoritmos/JavaCompleto/src/manipulandoarquivos/exerciciosarquivos/exercicio01e02.txt", listaTarefas);
        scanner.close();

        System.out.println("Fim...");
    }

    static void escreverNoArquivo(String arquivo, ArrayList<String> listaTarefas) throws IOException {
        Path path = Paths.get(arquivo);
        Files.write(path, listaTarefas);
    }
}
