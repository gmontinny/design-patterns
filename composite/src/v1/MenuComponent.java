package v1;

public abstract  class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Error 1");
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Error 2");
    }

    public String getUrl(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Error 3");
    }

    public abstract String getName(MenuComponent menuComponent);

    public abstract void print();
}
