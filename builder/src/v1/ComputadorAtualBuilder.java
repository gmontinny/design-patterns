package v1;

public class ComputadorAtualBuilder extends ComputadorBuilder{

    private Computador computador = new Computador();

    @Override
    public void buyCpu(String cpu) {
        computador.setCpu(cpu);
    }

    @Override
    public void buyMainboard(String mainboard) {
        computador.setMainboard(mainboard);
    }

    @Override
    public void buyMemory(String memory) {
        computador.setMemory(memory);
    }

    @Override
    public void buyHardDisk(String hardDisk) {
        computador.setHardDisk(hardDisk);
    }

    @Override
    public void buyGpu(String gpu) {
        computador.setGpu(gpu);
    }

    @Override
    public void buyCrate(String crate) {
        computador.setCrate(crate);
    }

    @Override
    public void buyPowerSupply(String powerSupply) {
        computador.setPowerSupply(powerSupply);
    }

    @Override
    public void buyMonitor(String monitor) {
        computador.setMonitor(monitor);
    }

    @Override
    public Computador assembleComputer() {
        return computador;
    }
}
