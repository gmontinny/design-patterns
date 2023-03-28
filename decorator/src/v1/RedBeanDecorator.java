package v1;

public class RedBeanDecorator extends AbstractDecorator{
    public RedBeanDecorator(AbstractMilkyTea abstractMilkyTea) {
        super(abstractMilkyTea);
    }

    @Override
    protected String desc() {
        return super.desc() + " Red";
    }

    @Override
    protected int price() {
        return super.price() + 2;
    }
}
