package v1;

public class Teste {
    public static void main(String[] args) {
        TelefoneFactory telefoneFactory = new IPhoneFactory();
        Telefone telefone = telefoneFactory.getTelefone();
        telefone.call();
    }
}
