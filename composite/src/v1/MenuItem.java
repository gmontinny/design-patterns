package v1;

public class MenuItem extends MenuComponent{
    private String name;

    private String url;

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String getName(MenuComponent menuComponent) {
        return this.name;
    }

    @Override
    public String getUrl(MenuComponent menuComponent) {
        return this.url;
    }

    @Override
    public void print() {
        System.out.println(String.format("%s, Resultado: %s", name, url));
    }
}
