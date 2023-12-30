package metodos;

import java.util.Scanner;

public class Exercicio02_Metodos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número que você deseja que mostre a tabuada dele: ");
        Integer numero = s.nextInt();
        imprimirTabuada(numero, 0);

        s.close();
    }

    static void imprimirTabuada(Integer numero, Integer i) {
        if (i++ <= 10) {
            Integer resultado = numero * i;
            System.out.println(numero + " x " + (i - 1) + " = " + resultado);
            imprimirTabuada(numero, i);
        }
    }
}
