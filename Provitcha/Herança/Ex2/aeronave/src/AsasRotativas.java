public class AsasRotativas extends Aeronave{
    private boolean rotorCalda;

    public AsasRotativas(){

    }
    
    public AsasRotativas(boolean rotorCalda, float cargo, int ocupantes){
        super(ocupantes, cargo);
        this.rotorCalda = rotorCalda;
    }

    public boolean isRotorCalda() {
        return rotorCalda;
    }

    public void setRotorCalda(boolean rotorCalda) {
        this.rotorCalda = rotorCalda;
    }

    @Override
    public String toString() {
        return "AsasRotativas [rotorCalda=" + rotorCalda + "]";
    }

    


}
