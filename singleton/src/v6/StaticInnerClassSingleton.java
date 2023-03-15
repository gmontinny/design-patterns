package v6;

public class StaticInnerClassSingleton {
    private static class SingletonHolder {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {}

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

}
