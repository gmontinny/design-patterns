package v3;

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if (instance == null) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }
}
