package v1;

public class SugarDecorator extends AbstractDecorator{
    public SugarDecorator(AbstractMilkyTea abstractMilkyTea) {
        super(abstractMilkyTea);
    }

    @Override
    protected String desc() {
        return super.desc() + " Acucar";
    }

    @Override
    protected int price() {
        return super.price() + 1;
    }
}
