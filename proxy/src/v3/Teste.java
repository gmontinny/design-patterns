package v3;

public class Teste {
    public static void main(String[] args) {
        Station station = (Station) new StationDynamicProxy(new ZhuJiStation("Giovanny", "1", "100")).bind();
        station.buy();
    }
}
