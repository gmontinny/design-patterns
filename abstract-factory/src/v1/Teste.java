package v1;

public class Teste {
    public static void main(String[] args) {
        ElectronicProductFactory factory = new IElectronicProductFactory();
        Computador computador = factory.getComputador();
        computador.produce();
    }
}
