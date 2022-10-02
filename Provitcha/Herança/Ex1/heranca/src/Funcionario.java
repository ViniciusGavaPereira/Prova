public class Funcionario extends PessoaFisica {
    private int matricula;

    public Funcionario(){

    }

    public Funcionario(int matricula, String nome, String cpf) {
        super(cpf, nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario [matricula=" + matricula + "]";
    }

    

}
