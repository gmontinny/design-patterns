package v1;

public class IElectronicProductFactory implements ElectronicProductFactory{
    @Override
    public Telefone getTelefone() {
        return new IPhone();
    }

    @Override
    public Computador getComputador() {
        return new IComputador();
    }
}
