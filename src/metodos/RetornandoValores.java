package metodos;

public class RetornandoValores {

    public static void main(String[] args) {
        Integer numeroQualquer = numeroAleatorio();
        System.out.println(numeroQualquer + "\n");

        // 50 --- 100%
        // x --- 20%

        // 50 * 20 = x * 100

        // x = (50 * 20) / 100

        Double[] premissaInicial = new Double[] { 50.0, 100.0};
        Double proporcao = 20.0;

        Double resultado = regraDeTres(premissaInicial, proporcao);

        System.out.println(resultado);
    }

    static Integer numeroAleatorio() {
        Integer numero = 1;

        return numero;
    }

    static Double regraDeTres(Double[] premissa, Double proporcao) {
        return (premissa[0] * proporcao) / premissa[1];
    }
}
