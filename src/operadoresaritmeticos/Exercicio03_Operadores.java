package operadoresaritmeticos;

import java.util.Scanner;

public class Exercicio03_Operadores {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor da conta de luz: ");
        Double contaLuz = s.nextDouble();

        System.out.println("Digite o valor da conta de água: ");
        Double contaAgua = s.nextDouble();

        System.out.println("Digite o valor da conta de telefone: ");
        Double contaTelefone = s.nextDouble();

        System.out.println("Digite o valor da escola do seu filho: ");
        Double escolaFilho = s.nextDouble();

        System.out.println("Digite o valor da fatura do cartão: ");
        Double faturaCartao = s.nextDouble();

        System.out.println("Digite o valor gasto no supermercado: ");
        Double gastoSupermercado = s.nextDouble();

        Double gastoMensal = contaLuz + contaAgua + contaTelefone + escolaFilho + faturaCartao + gastoSupermercado;
        System.out.println("O gasto total do mês foi: " + gastoMensal);

        s.close();
    }
}
