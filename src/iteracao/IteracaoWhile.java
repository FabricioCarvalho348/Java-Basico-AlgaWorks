package iteracao;

public class IteracaoWhile {

    public static void main(String[] args) {
        int i = 0;

        while(i < 10) {
            if(i == 5) {
                System.out.println("Vai parar!");
                break;
            }
            System.out.println(i + ": Um texto qualquer.");
            i++;
        }

        int cont = 0;
        while(cont < 10) {
            if(cont == 5) {
                System.out.println("Vai continuar!");
                cont++;
                continue;
            }
            System.out.println(i + ": Um texto qualquer.");
            cont++;
        }

    }
}
