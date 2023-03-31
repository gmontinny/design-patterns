package v1;

import java.util.HashMap;
import java.util.Map;

public class RoupaFactory {
    private static final Map<String, Roupas> CLOTHES_MAP = new HashMap<String, Roupas>();
    public static Roupas getShirt(String brand) {
        Camisa shirt = (Camisa) CLOTHES_MAP.get(brand);

        if (shirt == null) {
            shirt = new Camisa(brand);
            CLOTHES_MAP.put(brand, shirt);
            System.out.println("Clothes: " + brand);
        }

        return shirt;
    }
}
