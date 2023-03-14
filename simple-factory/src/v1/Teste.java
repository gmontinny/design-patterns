package v1;

public class Teste {
    public static void main(String[] args) {
        Telefone telefone = TelefoneFactory.getTelefone("iphone");
        if (telefone != null){
            telefone.call();
        }else {
            System.out.println("Não é Iphone");
        }
    }
}
