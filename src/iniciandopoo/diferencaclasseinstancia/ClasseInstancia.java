package iniciandopoo.diferencaclasseinstancia;

public class ClasseInstancia {

    public static void main(String[] args) {

        System.out.println("Quantidade minima estoque: " + ProdutoInstancia.quantidadeMinimaEstoque);

        // UMA INSTÂNCIA DE PRODUTO
        ProdutoInstancia produto = new ProdutoInstancia();
        ProdutoInstancia.quantidadeMinimaEstoque = 10;
        produto.nome = "Caneca";

        System.out.println("Quantidae minima estoque: " + ProdutoInstancia.quantidadeMinimaEstoque);

        // SEGUNDA INSTÂNCIA DE PRODUTO
        ProdutoInstancia produto2 = new ProdutoInstancia();
        produto2.nome = "Carteira";

        System.out.println("Produto 1: " + produto.nome);
        System.out.println("Produto 2: " + produto2.nome);

        Impressao.informacao("Produto 1: " + produto.nome);
        Impressao.informacao("Produto 2: " + produto2.nome);
    }
}
