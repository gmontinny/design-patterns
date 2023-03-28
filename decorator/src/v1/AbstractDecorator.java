package v1;

public abstract class AbstractDecorator extends AbstractMilkyTea{
    private AbstractMilkyTea abstractMilkyTea;

    public AbstractDecorator(AbstractMilkyTea abstractMilkyTea) {
        this.abstractMilkyTea = abstractMilkyTea;
    }

    @Override
    protected String desc() {
        return this.abstractMilkyTea.desc();
    }

    @Override
    protected int price() {
        return this.abstractMilkyTea.price();
    }
}
