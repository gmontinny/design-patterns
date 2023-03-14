package v1;

public class MiPhoneFactory implements TelefoneFactory{
    @Override
    public Telefone getTelefone() {
        return new MiPhone();
    }
}
