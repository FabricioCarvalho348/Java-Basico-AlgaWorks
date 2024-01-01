package iniciandopoo.encapsulamento;

public class Encapsulamento {

    public static void main(String[] args) {
//        Estudante estudante = new Estudante();
//
//        estudante.nome = "Fabricio Carvalho";
//        estudante.telefone = "99999999999";
//
//        System.out.println("Nome aluno: " + estudante.nome);

        Estudante estudante = new Estudante();

        estudante.setNome("Fabricio Carvalho");
        estudante.setTelefone("9999999999");

        System.out.println("Nome estudante: " + estudante.getNome());

        System.out.println("Primeiro nome: " + estudante.getPrimeiroNome());
        System.out.println("Último nome: " + estudante.getUltimoNome());

    }
}
