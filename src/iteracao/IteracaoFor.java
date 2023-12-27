package iteracao;

public class IteracaoFor {

    public static void main(String[] args) {
        // for padrão
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ": Uma frase qualquer.");
        }


        // percorrendo um array
        Double[] carrinhoDeCompras = new Double[]{50.0, 50.0, 50.0};
        Double total = 0.0;

        for(int i = 0; i < carrinhoDeCompras.length; i++) {
            System.out.println("Iteração: " + i + ", Total: " + total);
            total = total + carrinhoDeCompras[i];
        }

        System.out.println("Total: " + total);


        // Utilizando break
        for (int i = 0; i < 10; i++) {
            if(i == 5) {
                System.out.println("Vai parar!");
                break;
            }
            System.out.println("Iteração: " + i);
        }

        // Utilizando continue
        for (int i = 0; i < 10; i++) {
            if(i == 5) {
                System.out.println("Vai parar!");
                continue;
            }
            System.out.println("Iteração: " + i);
        }

        Integer[] produtos = new Integer[]{100, 225, 300};

        for (int i = 0; i < produtos.length; i++) {
            Integer produto = produtos[i];
            System.out.println("Produto de código: " + produto);

            if(produto.equals(225)) {
                System.out.println("Produto encontrado!");
                break;
            }
        }

    }
}
