package v2;

public class Teste {
    public static void main(String[] args) {
        Patient patient = new Patient("Giovanny");
        Receptionist receptionist = new Receptionist();

        System.out.println("Serviços");
        receptionist.receivePatients(patient);
        System.out.println("---------------------------------");
    }
}
