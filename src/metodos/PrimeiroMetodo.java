package metodos;

import java.util.Scanner;

public class PrimeiroMetodo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};

        imprimir("Escolha dentre os cursos abaixo: ");

        iterarExibirPosicoesDoVetorString(cursos);

        imprimirEContinuarMesmaLinha("O curso que você deseja é o: ");

        Integer posicaoCursoEscolhido = scanner.nextInt();

        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

        if (!posicaoValida) {
            posicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[]{"Cartão", "Boleto"};

        imprimir("Escolha dentre as formas de pagamentos abaixo: ");

        iterarExibirPosicoesDoVetorString(formasPagamento);

        imprimirEContinuarMesmaLinha("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

        posicaoValida = posicaoFormaPagamentoEscolhida >= 0
                && posicaoFormaPagamentoEscolhida < formasPagamento.length;

        if (!posicaoValida) {
            posicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }

    static void iterarExibirPosicoesDoVetorString(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] " + vetor[i]);
        }
    }

    static void imprimirTraco() {
        System.out.println("----------------------------------------------");
    }

    static void posicaoInvalida() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }

    static void imprimirEContinuarMesmaLinha(String texto) {
        System.out.print(texto);
    }

}


