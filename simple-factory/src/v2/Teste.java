package v2;

public class Teste {
    public static void main(String[] args) {
        Telefone telefone = TelefoneFactory.getTelefone(IPhone.class);
        if (telefone != null){
            telefone.call();
        }else {
            System.out.println("Não é Iphone");
        }
    }
}
