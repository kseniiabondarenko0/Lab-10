public class Nurse extends Staff{

    public Nurse() {
        super("Nurse");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is assisting with patient care and monitoring");
    }

    public void checkVitals(Patient patient){
        System.out.println(getName() + " is checking vitals for patient " + patient.getName());
    }

}
