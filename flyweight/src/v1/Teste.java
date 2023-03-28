package v1;

import java.util.Random;

public class Teste {
    private static final String[] BRAND = {"YOUNGOR", "FIRS", "ROMON", "Hodo"};

    private static final String[] SIZE = {"S", "M", "L", "XL", "XXL"};

    private static final String[] COMPONENT = {"A", "B", "C"};

    private static final String[] PRICE = { "￥99", "￥129", "￥149", "￥199" };

    public static String getRandom(String[] strs) {
        return strs[new Random().nextInt(strs.length)];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Camisa Camisa = (Camisa) RoupaFactory.getShirt(getRandom(BRAND));
            Camisa.setSize(getRandom(SIZE));
            Camisa.setComponent(getRandom(COMPONENT));
            Camisa.setPrice(getRandom(PRICE));
            Camisa.info();
        }
    }
}
