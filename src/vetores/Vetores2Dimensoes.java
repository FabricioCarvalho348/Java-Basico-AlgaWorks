package vetores;

public class Vetores2Dimensoes {

    public static void main(String[] args) {

        Double faturamentoDia = 1000.0;

        Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
        Double[] faturamentoFevereiro = new Double[]{1500.0, 2000.0, 1700.0};

        Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};

        System.out.println("Faturamento do dida 1 de Janeiro: " + faturamentoAnual[0][0]);
        System.out.println("Faturamento do dia 3 de Fevereiro: " + faturamentoAnual[1][2]);

        for (int i = 0; i < faturamentoAnual.length; i++) {
            System.out.println("Mês: " + (i + 1));

            Double[] mes = faturamentoAnual[i];
            for (int j = 0; j < mes.length; j++) {
                Double dia = mes[j];
                // OUTRA FORMA DE FAZER (O RESULTADO É O MESMO):
//            Double dia = faturamentoAnual[i][j];
                System.out.println("Dia: " + (j + 1)  + ": " + dia);
            }
        }

    }
}
