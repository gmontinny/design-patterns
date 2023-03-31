package v2;

public class Teste {
    public static void main(String[] args) {
        String site = "www.gmontinny.com";

        MenuComponent index = new MenuItem("SITE", site);


        MenuCatalog programmingManual = new MenuCatalog("MENU", 2);
        programmingManual.add(new MenuItem("URL", site + "/category/design-patterns"));
        programmingManual.add(new MenuItem("Spring Cloud", site + "/category/spring-cloud"));

        MenuComponent topic = new MenuItem("TOPIC", site + "/topic");

        MenuCatalog main = new MenuCatalog("MENU", 1);
        main.add(index);
        main.add(programmingManual);
        main.add(topic);

        main.print();
    }
}
