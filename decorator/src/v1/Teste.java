package v1;

public class Teste {
    public static void main(String[] args) {
        AbstractMilkyTea abstractMilkyTea = new MilkyTea();
        abstractMilkyTea = new SugarDecorator(abstractMilkyTea);
        abstractMilkyTea = new PearlDecorator(abstractMilkyTea);

        System.out.println(abstractMilkyTea.desc() + " Preco:" + abstractMilkyTea.price());
        abstractMilkyTea = new MilkyTea();
        abstractMilkyTea = new RedBeanDecorator(abstractMilkyTea);
        abstractMilkyTea = new PearlDecorator(abstractMilkyTea);
        System.out.println(abstractMilkyTea.desc() + " Preco:" + abstractMilkyTea.price());

    }
}
