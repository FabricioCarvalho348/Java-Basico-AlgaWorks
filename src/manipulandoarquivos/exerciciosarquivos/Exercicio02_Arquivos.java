package manipulandoarquivos.exerciciosarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio02_Arquivos {

    public static void main(String[] args) throws IOException {

        /*
        Crie um programa que imprima, no console, a lista de tarefas que você criou com o algoritmo da aula passada.
         */
        Path arquivo02 = Paths.get("C:/tempES/ws-cursos-java/APRENDENDO/algoritmos/Algoritmos/JavaCompleto/src/manipulandoarquivos/exerciciosarquivos/exercicio01e02.txt");

        List<String> linhas = Files.readAllLines(arquivo02);

        for (int i = 0; i < linhas.size(); i++) {
            String nome = linhas.get(i);
            System.out.println("Lista " + i + ": " + nome);
        }

    }
}
