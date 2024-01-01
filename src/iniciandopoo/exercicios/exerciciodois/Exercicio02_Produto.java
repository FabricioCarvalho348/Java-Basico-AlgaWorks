package iniciandopoo.exercicios.exerciciodois;

public class Exercicio02_Produto {

    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;
    String nome2;
    Integer quantidadeEstoque2;

    Boolean verificaEstoque() {
        return quantidadeEstoque2 < Exercicio02_Produto.QUANTIDADE_MINIMA_ESTOQUE;
    }
}
