import java.text.ParseException;

public class GerenciadorTarefas {
    public static void main(String[] args) throws ParseException {
        Context tarefa=new Context();
        tarefa.requisitarAtrasada();
        tarefa.requisitarConcluida();
        tarefa.requisitarPendente();
        tarefa.requisitarConcluida();
        tarefa.requisitarConcluida();

       }

}
