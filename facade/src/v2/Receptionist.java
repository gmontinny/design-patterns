package v2;

public class Receptionist {
    private RegisterService registerService = new RegisterService();
    private OutpatientService outpatientService = new OutpatientService();
    private SettleAccountService settleAccountService = new SettleAccountService();
    private TakeMedicineService takeMedicineService = new TakeMedicineService();


    public void receivePatients(Patient patient) {
        System.out.println("Listando");
        registerService.operate(patient);
        outpatientService.operate(patient);
        settleAccountService.operate(patient);
        takeMedicineService.operate(patient);
    }
}
