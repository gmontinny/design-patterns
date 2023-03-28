package v1;

public class PearlDecorator extends AbstractDecorator {
    public PearlDecorator(AbstractMilkyTea abstractMilkyTea) {
        super(abstractMilkyTea);
    }

    @Override
    protected String desc() {
        return super.desc() + " Granulado";
    }

    @Override
    protected int price() {
        return super.price() + 2;
    }
}
