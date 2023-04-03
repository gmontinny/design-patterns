package v1;

public abstract class Pen {

    private String name;

    public Pen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void draw();
}
