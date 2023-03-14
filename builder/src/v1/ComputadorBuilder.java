package v1;

public abstract class ComputadorBuilder {
    public abstract void buyCpu(String cpu);
    public abstract void buyMainboard(String mainboard);
    public abstract void buyMemory(String memory);
    public abstract void buyHardDisk(String hardDisk);
    public abstract void buyGpu(String gpu);
    public abstract void buyCrate(String crate);
    public abstract void buyPowerSupply(String powerSupply);
    public abstract void buyMonitor(String monitor);

    public abstract Computador assembleComputer();
}
