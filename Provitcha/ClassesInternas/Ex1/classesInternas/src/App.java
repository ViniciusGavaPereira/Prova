public class App {
    public static void main(String[] args) throws Exception {
        Carro c=FabricaVW.factoryMethod(Lista.values()[0]);
        System.out.println(c);
   
    }
}
