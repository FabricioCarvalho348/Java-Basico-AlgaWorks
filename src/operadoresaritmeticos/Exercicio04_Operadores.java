package operadoresaritmeticos;

import java.util.Scanner;

public class Exercicio04_Operadores {

    public static void main(String[] args) {
        /*
        Crie um programa que receba a idade de uma pessoa e a quantidade de tempo
        que essa pessoa contribuiu com a previdência,
        depois verifique se ela pode aposentar ou não.
        Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos
         e ter contribuído com, pelo menos, 25 anos.
         Se ela passar nessas duas condições,
         então mostre pra ela uma mensagem dizendo que ela pode aposentar.
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        Integer idade = s.nextInt();

        System.out.println("Digite quanto tempo você contribuiu para sua aposentadoria: ");
        Integer tempoContribuicao = s.nextInt();

        if(idade >= 55 && tempoContribuicao >= 25) {
            System.out.println("Você pode se aposentar!");
        } else {
            System.out.println("Você não tem os requisitos minimos para se aposentar.");
        }
    }
}
