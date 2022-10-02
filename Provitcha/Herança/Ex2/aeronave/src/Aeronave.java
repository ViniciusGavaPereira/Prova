public class Aeronave {
    private int ocupantes;

    private float cargo;

    public Aeronave(){}

    public Aeronave(int ocupantes, float Cargo){
        this.ocupantes = ocupantes;
        this.cargo = Cargo;
    }

    public int getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(int Ocupantes) {
        ocupantes = Ocupantes;
    }

    public float getCargo() {
        return cargo;
    }

    public void setCargo(float Cargo) {
        cargo = Cargo;
    }

    @Override
    public String toString() {
        return "Aeronave [Ocupantes=" + ocupantes + ", Cargo=" + cargo + "]";
    }

    
}
