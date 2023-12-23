package operadoresaritmeticos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        Boolean carrinhoMaiorQue100 = true;
        Boolean periodoDePromocao = true;
        Boolean jaFezCompraNaLoja = false;

//        Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
//        Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
//        Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
//        Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
        Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja);

        if(aplicarDesconto) {
            System.out.println("Sim! Aplique o desconto.");
        } else {
            System.out.println("Não aplique o desconto");
        }

    }
}
