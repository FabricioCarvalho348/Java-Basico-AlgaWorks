package iniciandopoo.metodoinstancia;

public class MetodoInstancia {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Fabricio";
        cliente.ultimoNome = "Carvalho";
        cliente.telefone = "99999999999";
        cliente.email = "fabricioccarvalho348@gmail.com";

        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
    }
}
