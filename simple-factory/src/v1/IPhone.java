package v1;

public class IPhone implements Telefone{
    @Override
    public void call() {
        System.out.println("Chamada de IPhone");
    }
}
