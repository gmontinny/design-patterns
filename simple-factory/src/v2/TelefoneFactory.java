package v2;

public class TelefoneFactory {
    public static Telefone getTelefone(Class clazz){
        try {
            return (Telefone) Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
