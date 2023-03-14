package v1;

public class MiElectronicProductFactory implements ElectronicProductFactory{
    @Override
    public Telefone getTelefone() {
        return new MiPhone();
    }

    @Override
    public Computador getComputador() {
        return new MiComputador();
    }
}
