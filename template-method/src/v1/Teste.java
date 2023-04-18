package v1;

public class Teste {
    public static void main(String[] args) {

        System.out.println("---Teste 1---");
        AbstractCook meCook = new MeCook();
        meCook.cook();
        System.out.println("---Fim---");

        System.out.println("---Teste 2---");
        AbstractCook girlFriendCook = new GirlFriendCook();
        girlFriendCook.cook();
        System.out.println("---Fim---");
    }
}
