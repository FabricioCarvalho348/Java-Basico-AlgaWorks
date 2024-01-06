package algoritmosavancados;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercicio_Lista {

    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:/tempES/ws-cursos-java/APRENDENDO/algoritmos/Algoritmos/JavaCompleto/src/algoritmosavancados/textos/nomes.txt");
        List<String> nomes = Files.readAllLines(arquivo);

        ListaAlunos listaAlunos = new ListaAlunos();

        for (String nome : nomes) {
            Aluno aluno = new Aluno();
            aluno.nome = nome;

            listaAlunos.adicionar(aluno);
        }

        listaAlunos.ordenar();

        List<String> nomesOrdenados = new ArrayList<String>();
        for (int i = 0; i < listaAlunos.tamanho(); i++) {
            Aluno aluno = listaAlunos.obter(i);
            nomesOrdenados.add(aluno.nome);
        }

        Path novoArquivo = Paths.get("C:/tempES/ws-cursos-java/APRENDENDO/algoritmos/Algoritmos/JavaCompleto/src/algoritmosavancados/textos/nomesOrdenados.txt");
        Files.write(novoArquivo, nomesOrdenados);
    }
}
