package vetores;

import java.util.Scanner;

public class Exercicio01_Vetores {

    public static void main(String[] args) {
        /*
        Crie um sistema onde o usuário vai cadastrar,
         utilizando o console, as 5 tarefas mais importantes
         do dia dele. Armazene cada uma dessas tarefas
         em um vetor e, no final,
         imprima as tarefas novamente.
         */
        Scanner s = new Scanner(System.in);

        String[] listaTarefas = new String[5];

        System.out.println("Digite as 5 tarefas mais importantes do seu dia: ");

        for (int i = 0; i < 5; i++){
            System.out.println("Digite a tarefa " + (i + 1) + ":");
            listaTarefas[i] = s.nextLine();
        }

        System.out.println("Sua lista das 5 tarefas: ");
        for(String str : listaTarefas) {
            System.out.println(str);
        }

        s.close();
    }
}
