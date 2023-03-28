package v2;

public class TypeCDockStation implements SDInterface{
    private final TypeCInterface typeCInterface;

    public TypeCDockStation(TypeCInterface typeCInterface) {
        this.typeCInterface = typeCInterface;
    }

    public void sdRead() {
        System.out.println("SDRead...");
        System.out.println("Type");
        typeCInterface.typeCRead();
    }
}
