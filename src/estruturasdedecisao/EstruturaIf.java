package estruturasdedecisao;

public class EstruturaIf {

    public static void main(String[] args) {
        Double emprestimo = 4000.0;
        Double movimentacaoMedia = 2000.0;

        // Se movimenta na conta pelo menos metade do valor do empréstimo solicitado
//        Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;

        // Tempo de conta
        Boolean aContaTemTempoSuficienteDeAbertura = true;

        // Nome Limpo
        Boolean temNomeLimpo = true;

//        Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor
//                && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;

        if(((movimentacaoMedia * 2) >= emprestimo)
                && aContaTemTempoSuficienteDeAbertura && temNomeLimpo) {
            System.out.println("Sim! Pode liberar empréstimo.");
        } else {
            System.out.println("Não pode liberar o empréstimo.");
        }
    }
}
