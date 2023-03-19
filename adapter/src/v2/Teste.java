package v2;

public class Teste {
    public static void main(String[] args) {
        TypeCInterface typeCInterface = new TypeCInterface();
        SDInterface sdInterface = new TypeCDockStation(typeCInterface);
        sdInterface.sdRead();
    }
}
