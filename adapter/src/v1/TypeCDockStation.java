package v1;

public class TypeCDockStation extends TypeCInterface implements SDInterface{
    public void sdRead() {
        System.out.println("SDRead...");
        System.out.println("Type");
        super.typeCRead();
    }
}
