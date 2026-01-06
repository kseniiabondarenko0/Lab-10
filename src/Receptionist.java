import java.time.LocalDateTime;

public class Receptionist extends Staff{

    public Receptionist() {
        super("Receptionist");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is helping the patient at the reception desk");
    }

    public Appointment createAppointment(Patient patient, Doctor doctor, LocalDateTime dateTime, String reason) {
        return new Appointment(patient, doctor, dateTime, reason);
    }
}


