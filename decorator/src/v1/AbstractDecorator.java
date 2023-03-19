package v1;

public abstract class AbstractDecorator extends AbstractMilkyTea {
    private final AbstractMilkyTea abstractMilkyTea;

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
