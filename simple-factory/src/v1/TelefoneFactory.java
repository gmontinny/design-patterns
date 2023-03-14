package v1;

public class TelefoneFactory {
    public static Telefone getTelefone(String tipo){
        if("iphone".equalsIgnoreCase(tipo)){
            return new IPhone();
        } else if ("miphone".equalsIgnoreCase(tipo)) {
            return new MiPhone();
        }
        return null;
    }
}
