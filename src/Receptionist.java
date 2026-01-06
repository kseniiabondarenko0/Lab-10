public class Receptionist extends Staff{

    public Receptionist() {
        super("Receptionist");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is helping the patient at the reception desk");
    }
}
