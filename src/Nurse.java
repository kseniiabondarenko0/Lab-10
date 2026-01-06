import java.time.LocalDateTime;

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

    public Appointment createAppointment(Patient patient, Doctor doctor, LocalDateTime dateTime, String reason) {
        return new Appointment(patient, doctor, dateTime, reason);
    }

}
