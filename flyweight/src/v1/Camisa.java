package v1;

public class Camisa implements Roupas {
    private String brand;

    private String size;

    private String component;

    private String price;

    public Camisa(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void info() {
        System.out.println(String.format("Resultado: {marca: %s, tamanho: %s, componente: %s, preco: %s}", brand, size, component, price));
    }
}
