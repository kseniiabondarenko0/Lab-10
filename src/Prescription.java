import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Prescription {
    private static int prescriptionCounter = 1;
    private int prescriptionId;
    private Doctor prescribingDoctor;
    private Patient patient;
    private List<Treatment> treatments;
    private LocalDateTime dateIssued;

    public Prescription(Doctor doctor, Patient patient) {
        this.prescriptionId = prescriptionCounter++;
        this.prescribingDoctor = doctor;
        this.patient = patient;
        this.treatments = new ArrayList<>();
        this.dateIssued = LocalDateTime.now();
    }

    public void addTreatment(Treatment treatment) {
        treatments.add(treatment);
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }


    public Doctor getPrescribingDoctor() {
        return prescribingDoctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public LocalDateTime getDateIssued() {
        return dateIssued;
    }

    @Override
    public String toString() {
        return "Prescription #" + prescriptionId + " for " + patient.getName() +
                " by Dr. " + prescribingDoctor.getName();
    }
}


