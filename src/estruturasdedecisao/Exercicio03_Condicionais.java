package estruturasdedecisao;

import java.util.Scanner;

public class Exercicio03_Condicionais {

    public static void main(String[] args) {
        /*
        Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7).
        Dependendo do número informado você deve imprimir o nome desse dia.
        Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um dia da semana: ");
        Integer diaSemana = s.nextInt();

        String dia;

        switch (diaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default: dia = "DIA INVÁLIDO";
        }

        System.out.println("O dia digitado foi: " + dia);

        s.close();
    }
}
