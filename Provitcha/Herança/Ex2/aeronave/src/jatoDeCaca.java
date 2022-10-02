public class jatoDeCaca extends Aeronave {
    private String armamento;

    public jatoDeCaca(){}

    public jatoDeCaca(String armamento, int ocupantes, float cargo ){
        super(ocupantes, cargo);
        this.armamento = armamento;
    }

    public String getArmamento() {
        return armamento;
    }

    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }

    @Override
    public String toString() {
        return "jatoDeCaca [armamento=" + armamento + "]";
    }

    
}
