package metodos;

import java.util.Scanner;

public class MetodosComRetornos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};

        imprimir("Escolha dentre os cursos abaixo: ");

        iterarExibirPosicoesDoVetorString(cursos);

        Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", scanner);

        Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);

        if (!posicaoValida) {
            posicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[]{"Cartão", "Boleto"};

        imprimir("Escolha dentre as formas de pagamentos abaixo: ");

        iterarExibirPosicoesDoVetorString(formasPagamento);

        Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", scanner);

        posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);

        if (!posicaoValida) {
            posicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }

    // MÉTODOS CRIADOS

    // Métodos com retornos e parametros
    static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
        imprimirEContinuarMesmaLinha(texto);
        Integer numero = scanner.nextInt();

        return numero;
    }

    static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
        Boolean valida = posicao >= 0 && posicao < vetor.length;
        return valida;
    }

    // método com parametro
    static void iterarExibirPosicoesDoVetorString(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] " + vetor[i]);
        }
    }


    // MÉTODOS SEM RETORNOS NEM PARAMETROS
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

