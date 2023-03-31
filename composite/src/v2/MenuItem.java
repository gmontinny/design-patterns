package v2;

public class MenuItem extends MenuComponent {
    private String name;

    private String url;

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getUrl(MenuComponent menuComponent) {
        return this.url;
    }

    @Override
    public String getName(MenuComponent menuComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(String.format("%s, Resultado: %s", name, url));
    }
}
