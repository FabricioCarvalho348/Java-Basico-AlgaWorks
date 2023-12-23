package operadoresaritmeticos;

import java.util.Scanner;

public class Exercicio01_Operadores {
    public static void main(String[] args) {
        /*
        Você vai receber o primeiro número,
        depois vai receber qual é a operação
         e, por último, o segundo número.
         Para os números que você vai receber pelo console,
          pode utilizar a mesma funcionalidade que já utilizamos aqui
           no curso - o *Scanner*. Para receber a operação
            você pode receber também um número
             que vai indicar a mesma.
             Por exemplo, o número 1 será adição,
              o 2 subtração, o 3 multiplicação e o 4 divisão.
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Double primeiroNumero = s.nextDouble();

        System.out.println("Qual operação quer realizar?\n1. Adição\n2. Subtração\n3. Multiplicação\n4. Divisão");
        Integer operacao = s.nextInt();

        System.out.println("Digite o segundo número: ");
        Double segundoNumero = s.nextDouble();

        Double resultado = null;

        if(operacao.equals(1)) {
            resultado = primeiroNumero + segundoNumero;

        }

        if(operacao.equals(2)) {
            resultado = primeiroNumero - segundoNumero;
        }

        if(operacao.equals(3)) {
            resultado = primeiroNumero * segundoNumero;
        }

        if(operacao.equals(4)) {
            resultado = primeiroNumero / segundoNumero;
        }

        System.out.println("Resultado " + resultado);

        s.close();
    }
}
