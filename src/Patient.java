import java.util.ArrayList;
import java.util.List;

public class Patient extends Person implements Treatable{

    private String condition;
    private List<Prescription> prescriptions;
    private List<Appointment> appointments;

    public String getCondition() {
        return condition;
    }

    public Patient() {
        this.prescriptions = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }
    public String getCondition(String condition) {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }


    @Override
    public void receiveTreatment() {
        System.out.println("Treatment received to: " +  getName() + " for " + condition);
    }


}
