package operadoresaritmeticos;

public class OperadoresIncrementoDecremento {

    public static void main(String[] args) {
        Integer numero = 10;
        System.out.println("Número antes: " + numero);

        numero++;
        System.out.println("Número depois: " + numero);


        // A POSIÇÃO AONDE COLOCA O INCREMENTO IMPORTA!
        Integer numero01 = 10;
//        Integer numero02 = ++numero01;
        Integer numero03 = numero01++;
        System.out.println("Número: " + numero + ", " + "Número 02: " + numero01 + ", Número 03: " + numero03);

        Integer numero04 = 10;
        --numero04;
        System.out.println("Número 04: " + numero04);
    }
}
