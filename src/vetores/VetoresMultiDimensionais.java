package vetores;

public class VetoresMultiDimensionais {

    public static void main(String[] args) {
        Double[] faturamentoJaneiro = new Double[]{1500.0, 2000.0, 1700.0};
        Double[] faturamentoFevereiro = new Double[]{1500.0, 2000.0, 1700.0};

        Double[][] faturamentoAnual = new Double[][]{faturamentoJaneiro, faturamentoFevereiro};

        // ARRAYS DE MAIS DE UMA DIMENSÃO PRECISAM DE ARRAYS DE UMA DIMENSÃO A MENOS PARA EXISTIREM!

        Double[][][] faturamentoQuinquenal = new Double[][][]{faturamentoAnual};

        Double[][][][] faturamentoQuinquenal = new Double[][][][]{faturamentoAnual};

    }
}

