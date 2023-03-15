package v10;

public enum EnumSingleton {
    INSTANCE {
        @Override
        public void method() {
            System.out.println("Teste de Sigleton");
        }
    };

    public abstract void method();
}
