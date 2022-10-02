public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        PessoaFisica João = new PessoaFisica();

        João.setNome("João");
        João.setCpf("5072701856");
        João.toString();
        System.out.println("Nome: " + João.getNome() + "CPF: " + João.getCpf());
    }
}
