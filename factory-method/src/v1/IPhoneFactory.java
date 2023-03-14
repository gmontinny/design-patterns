package v1;

public class IPhoneFactory implements TelefoneFactory{
    @Override
    public Telefone getTelefone() {
        return new IPhone();
    }
}
