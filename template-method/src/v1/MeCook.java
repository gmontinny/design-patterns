package v1;

public class MeCook extends AbstractCook{
    @Override
    void pourSeasoning() {
        System.out.println("Exemplo 1");
        System.out.println("Exemplo 2");
    }

    @Override
    protected boolean needChoppedGreenOnion() {
        return true;
    }
}
