package v1;

public class Teste {
    public static void main(String[] args) {
        String site = "www.gmontinny.com";

        MenuComponent index = new MenuItem("SITE", site);


        MenuComponent programmingManual = new MenuCatalog("MENU", 2);
        programmingManual.add(new MenuItem("URL", site + "/category/design-patterns"));
        programmingManual.add(new MenuItem("Spring Cloud", site + "/category/spring-cloud"));

        MenuComponent topic = new MenuItem("Topico", site + "/topic");

        MenuComponent main = new MenuCatalog("MENU", 1);
        main.add(index);
        main.add(programmingManual);
        main.add(topic);

        main.print();
    }
}
