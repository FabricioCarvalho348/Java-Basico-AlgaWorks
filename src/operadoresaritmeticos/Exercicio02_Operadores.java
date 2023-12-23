package operadoresaritmeticos;

import java.util.Scanner;

public class Exercicio02_Operadores {

    public static void main(String[] args) {
        /*
        Crie um programa que receba o valor de um produto e exiba o valor final da compra.
        Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00.
        Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
         */
        Scanner s = new Scanner(System.in);
        Double frete = 15.0;

        System.out.println("Digite o valor do produto: ");
        Double valorProduto = s.nextDouble();

        if(valorProduto < 100) {
            System.out.println("Valor do produto com R$15.00 de frete: "+ (valorProduto + frete));
        } else {
            System.out.println("Valor do produto (frete grátis pois é acima de R$100.00) " + valorProduto);
        }
        s.close();
    }
}
