package iniciandopoo.primeiraclasse;

public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Celular";
        produto.quantidade = 2;
        produto.precoUnitario = 2.000;

        exibirQuantidadeEmEstoque(produto);
    }

    static void exibirQuantidadeEmEstoque(Produto produto) {
        System.out.println("Quantidade em estoque do produto " + produto.nome + " é de " + produto.quantidade + "unidades");
    }
}
