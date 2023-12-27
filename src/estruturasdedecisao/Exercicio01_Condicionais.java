package estruturasdedecisao;

import java.util.Scanner;

public class Exercicio01_Condicionais {

    public static void main(String[] args) {
        /*
        Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova.
        Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
        A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150.
        Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja,
        se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.

        No final mostre para o candidato se ele conseguiu ou não.
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a sua nota de português: ");
        Integer notaPortugues = s.nextInt();

        System.out.println("Digite sua nota de matemática: ");
        Integer notaMatematica = s.nextInt();

        if((notaPortugues & notaMatematica) >= 60) {
            if((notaPortugues + notaMatematica) >= 150) {
                System.out.println("Parabéns, Você está classificado!");
            }
        } else{
            System.out.println("Infelizmente, você está desclassificado!");
        }
    }
}
