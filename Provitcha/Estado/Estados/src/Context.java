public class Context {
    private Estado estado = new Pendente(this);

    public Estado getState() {
        return estado;
    }

    void setEstado(Estado estado) {
        this.estado = estado;
        System.out.println(getState());
    }

    public void requisitarConcluida(){
        estado.concluida();
    } 
    
    public void requisitarAtrasada(){
        estado.atrasada();
    }
    
    public void requisitarPendente(){
        estado.pendente();
    }

}
