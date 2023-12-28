package vetores;

import java.util.Scanner;

public class VetoresUmaDimensao {

    public static void main(String[] args) {
        String[] sorvete = new String[] {"Morango", "Chocolate", "Baunilha"};

        System.out.println("Escolha o sabor: ");

        for (int i = 0; i < sorvete.length; i++) {
            System.out.println("[" + i + "]" + sorvete[i]);
        }

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o número referente ao sabor: ");
        Integer sabor = s.nextInt();

        System.out.println("O sabor escolhido foi: " + sorvete[sabor]);

        s.close();

        System.out.println("\n");

        // Alteração de valores no Array
        String[] sorvete2 = new String[] {"Morango", "Chocolate", "Baunilha"};

        sorvete2[1] = "Framboesa";

        for (int i = 0; i < sorvete2.length; i++) {
            System.out.println(sorvete2[i]);
        }

        System.out.println("\n");

        String[] sorvete3 = new String[3];
        sorvete3[0] = "Morango";
        sorvete3[1] = "Morango";
        sorvete3[2] = "Morango";

        for (int i = 0; i < sorvete3.length; i++) {
            System.out.println(sorvete3[i]);
        }

    }
}
