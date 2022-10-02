
public class Pendente implements Estado {
    
    private final String nome = "Pendente";
    private Context tarefa;

    public Pendente(Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        tarefa.setEstado(new Atrasada(tarefa));
    }

    @Override
    public void concluida() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Já está pendente");
    }

    @Override
    public String toString() {
        return "Novo estado da tarefa: " + nome;
    }

}
