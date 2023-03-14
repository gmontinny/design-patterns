package v1;

public class Teste {
    public static void main(String[] args) {
        ComputadorBuilder computadorBuilder = new ComputadorAtualBuilder();
        Enterprise enterprise = new Enterprise();

        enterprise.setComputadorBuilder(computadorBuilder);

        Computador computador = enterprise.assembleComputer("intel i7 8700k",
                "B360M-M.2",
                "GAMER 8GB DDR4 2400",
                "Barracuda 1TB 7200 64MB",
                "TiGame750Ti U-Twin-2GD5",
                "z30",
                "WD600K",
                "C27F390FHC");

        System.out.println(computador);
    }
}
