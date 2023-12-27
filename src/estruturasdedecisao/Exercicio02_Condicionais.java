package estruturasdedecisao;

import java.util.Scanner;

public class Exercicio02_Condicionais {

    public static void main(String[] args) {
        /*
        Pense em uma empresa fictícia que todo o mês de Janeiro premia seus funcionários com um bônus, caso a meta seja alcançada.
        Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa para o ano que passou.
        Depois, receba o parâmetro referente ao faturamento real da empresa no ultimo ano.
        Por último, receba a média salarial do funcionário(a) para o ano anterior (não precisa fazer cálculo de média salarial,
        já que estamos trabalhando com um algoritmo fictício - na hora de informar esse parâmetro,
        invente um valor qualquer para representar essa média salarial).
        Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual,
        então os funcionários ganharam um bônus que será igual a média salarial deles no último ano.
        Caso o faturamento seja menor que a meta, mas, seja maior ou igual a 80% do valor da meta,
        então eles receberão também 80% de sua média salarial.
        No final, mostre de quanto será o prêmio desse funcionário(a).
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a meta de faturamento anual da empresa no último ano: ");
        Double metaFaturamentoAnual = s.nextDouble();

        System.out.println("Digite o faturamento real da empresa no último ano: ");
        Double faturamentoReal = s.nextDouble();

        System.out.println("Digite a média salarial do funcionário no último ano: ");
        Double mediaSalarialFuncionario = s.nextDouble();

        Double oitentaPorcentoMeta = (metaFaturamentoAnual * 80) / 100;

        Boolean faturouPeloMenosOitentaPorcento = faturamentoReal >= oitentaPorcentoMeta;

        if (faturamentoReal >= metaFaturamentoAnual) {
            System.out.println("Os funcionários vão ganhar bônus de " + mediaSalarialFuncionario);

        } else if (faturouPeloMenosOitentaPorcento) {
            Double oitentaPorcentoDaMediaSalarial = (metaFaturamentoAnual * 80) / 100;
            System.out.println("Você vai ganhar um bônus de 80%! Ele vai ser de: " + oitentaPorcentoDaMediaSalarial);

        } else {
            System.out.println("Infelizmente esse ano não vai ter bônus!");

        }

        s.close();
    }
}
