package metodos;

import java.util.Scanner;

public class Exercicio01_Metodos {

    public static void main(String[] args) {
    /*
    Crie um programa que peça dois números do usuário e também qual a operação ele deseja fazer - adição ou subtração.
    Para cada operação, você deve construir um método que realize a mesma, ou seja, teremos um método para adição,
    que vai receber dois números como parâmetros e retornar o resultado da soma entre eles, e outro método para subtração.
    Fique a vontade para implementar multiplicação e divisão também.
    */
        Scanner s = new Scanner(System.in);

        String[] vetorOperacao = new String[]{"Sair", "Adição", "Subtração", "Multiplicação", "Divisão"};

        imprimirTraco();
        imprimir("Digite um número: ");
        Double numeroUm = s.nextDouble();
        imprimir("Digite um segundo número: ");
        Double numeroDois = s.nextDouble();

        imprimir("Digite qual operação quer realizar com os dois números: ");
        menuOperacao(vetorOperacao);
        Integer posicaoOperacaoEscolhida = receberNumeroDoUsuario("A operação que você deseja é: ", s);


        if ((verificarPosicaoEscolhidaPeloUsuario(posicaoOperacaoEscolhida, vetorOperacao))) {
            realizarOperacao(posicaoOperacaoEscolhida, numeroUm, numeroDois);
        }
    }

    static void menuOperacao(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] " + vetor[i]);
        }
    }

    static void adicao(Double numero1, Double numero2) {
        Double resultadoSoma = numero1 + numero2;
        System.out.println("A soma do número " + numero1 + ", com o número " + numero2 + " é igual a: " + resultadoSoma);
    }

    static void subtracao(Double numero1, Double numero2) {
        Double resultadoSubtracao = numero1 - numero2;
        System.out.println("A subtração do número " + numero1 + ", com o número " + numero2 + " é igual a: " + resultadoSubtracao);
    }

    static void multiplicacao(Double numero1, Double numero2) {
        Double resultadoMultiplicacao = numero1 * numero2;
        System.out.println("A multiplicação do número " + numero1 + ", com o número " + numero2 + " é igual a: " + resultadoMultiplicacao);
    }

    static void divisao(Double numero1, Double numero2) {
        Double resultadoDivisao = numero1 / numero2;
        System.out.println("A divisão do número " + numero1 + ", com o número " + numero2 + " é igual a: " + resultadoDivisao);
    }

    static void imprimirTraco() {
        System.out.println("--------------------------------");
    }

    static Integer receberNumeroDoUsuario(String texto, Scanner s) {
        imprimirEContinuarMesmaLinha(texto);
        return s.nextInt();
    }

    static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
        return posicao >= 0 && posicao < vetor.length;
    }

    static void posicaoInvalida() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }

    static Double realizarOperacao(Integer operacao, Double numeroUm, Double numeroDois) {
        Double resultado = null;

        switch (operacao) {
            case 0:
                break;
            case 1:
                adicao(numeroUm, numeroDois);
                break;
            case 2:
                subtracao(numeroUm, numeroDois);
                break;
            case 3:
                multiplicacao(numeroUm, numeroDois);
                break;
            case 4:
                divisao(numeroUm, numeroDois);
                break;
            default:
                posicaoInvalida();
        }

        return resultado;
    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }

    static void imprimirEContinuarMesmaLinha(String texto) {
        System.out.print(texto);
    }
}
