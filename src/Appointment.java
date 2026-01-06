import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
    private static int appointmentCounter = 5000;
    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime dateTime;
    private String reason;

    public Appointment(Patient patient, Doctor doctor, LocalDateTime dateTime, String reason) {
        this.appointmentId = appointmentCounter++;
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
        this.reason = reason;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public boolean overlaps(Appointment other) {
        LocalDateTime thisEnd = this.dateTime.plusHours(1);
        LocalDateTime otherEnd = other.dateTime.plusHours(1);
        return !this.dateTime.isAfter(otherEnd) && !thisEnd.isBefore(other.dateTime);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return "Appointment #"+ appointmentId + " - " + patient.getName() + " with Dr. " + doctor.getName() + " on " + dateTime.format(formatter) +
                " (" + reason + ")";
    }
}
