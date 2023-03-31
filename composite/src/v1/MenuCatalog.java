package v1;

import java.util.ArrayList;
import java.util.List;

public class MenuCatalog extends MenuComponent{
    private String name;

    private Integer level;


    private List<MenuComponent> menuItems = new ArrayList<MenuComponent>();

    public MenuCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuItems.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuItems.remove(menuComponent);
    }

    @Override
    public String getName(MenuComponent menuComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (MenuComponent menuComponent : menuItems) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("*");
                }
            }
            menuComponent.print();
        }
    }
}
