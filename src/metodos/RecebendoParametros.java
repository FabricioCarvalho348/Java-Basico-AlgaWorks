package metodos;

public class RecebendoParametros {

    public static void main(String[] args) {

        imprimir("***********************");
        imprimir("João");

        String texto = "***********************";
        imprimir(texto);
    }

    static void imprimirTraco() {
        System.out.println("------------------------------");
    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }
}
