package v1;

public abstract class AbstractCook {
    protected final void cook() {
        this.pourOil();
        this.addEgg();
        this.addTomato();
        this.pourSeasoning();
        this.stirFry();
        if (needChoppedGreenOnion()) {
            this.addChoppedGreenOnion();
        }
    }


    final void pourOil() {
        System.out.println("pourOil");
    }

    final void addEgg() {
        System.out.println("addEgg");
    }

    final void addTomato() {
        System.out.println("addTomato");
    }

    final void stirFry() {
        System.out.println("stirFry");
    }

    final void addChoppedGreenOnion() {
        System.out.println("addChoppedGreenOnion");
    }

    protected boolean needChoppedGreenOnion() {
        return false;
    }

    abstract void pourSeasoning();
}
