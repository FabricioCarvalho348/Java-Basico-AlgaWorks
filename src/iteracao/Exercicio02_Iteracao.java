package iteracao;

public class Exercicio02_Iteracao {

    public static void main(String[] args) {
        /*
        Faça o mesmo que você fez para o exercício 1,
        mas agora faça utilizando o laço "while".
         */

        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

//        for (int i = 0; i < numeros.length; i++) {
//            if(i % 3 == 0) {
//                System.out.println("Números divisiveis por 3: " + i);
//            }
//        }

        int i = 0;
        while (i < numeros.length) {
            i++;
            if (i % 3 == 0) {
                System.out.println("Números divisiveis por 3: " + i);
            }
        }
    }
}


