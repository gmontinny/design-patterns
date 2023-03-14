package v1;

public class Enterprise {
    private ComputadorBuilder computadorBuilder;

    public void setComputadorBuilder(ComputadorBuilder computadorBuilder){
        this.computadorBuilder = computadorBuilder;
    }

    public Computador assembleComputer(String cpu, String mainboard,
                                       String memory, String hardDisk,
                                       String gpu, String crate,
                                       String powerSupply, String monitor){

        computadorBuilder.buyCpu(cpu);
        computadorBuilder.buyMainboard(mainboard);
        computadorBuilder.buyMemory(memory);
        computadorBuilder.buyHardDisk(hardDisk);
        computadorBuilder.buyGpu(gpu);
        computadorBuilder.buyCrate(crate);
        computadorBuilder.buyPowerSupply(powerSupply);
        computadorBuilder.buyMonitor(monitor);

        return computadorBuilder.assembleComputer();

    }


}
