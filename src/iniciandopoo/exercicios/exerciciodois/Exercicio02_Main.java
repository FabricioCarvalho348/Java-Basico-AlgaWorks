package iniciandopoo.exercicios.exerciciodois;

public class Exercicio02_Main {

    public static void main(String[] args) {
        /*
        Faça exatamente como no exercício passado,
        só que agora torne o método, que verifica a necessidade de repor estoque,
        como um método de instância.
        Lembre-se de que ele não precisará mais receber parâmetros,
        pois, usará as próprias variáveis de instância da classe Produto.
         */

        Exercicio02_Produto produto02 = new Exercicio02_Produto();

        produto02.nome2 = "Doritos";
        produto02.quantidadeEstoque2 = 10;

        System.out.println("Necessário repor estoque do produto " + produto02.nome2 + "? " + produto02.verificaEstoque());
    }

}
