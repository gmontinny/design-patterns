package v1;

public class Teste {
    public static void main(String[] args) {
        Patient patient = new Patient("Giovanny");
        System.out.println("Serviços");
        new RegisterService().operate(patient);
        new OutpatientService().operate(patient);
        new SettleAccountService().operate(patient);
        new TakeMedicineService().operate(patient);
        System.out.println("---------------------------------");
    }
}
