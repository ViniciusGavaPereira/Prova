public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(){}

    public PessoaFisica(String cpf, String nome){
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String i) {
        this.cpf = i;
    }

    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + cpf + "]";
    }


    
}
