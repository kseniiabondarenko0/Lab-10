import java.time.LocalDateTime;

public class ClinicTest {
    public static void main(String[] args) {

        System.out.println("MEDICAL CLINIC SYSTEM\n");


        Doctor doc1 = new Doctor();
        doc1.setId(4563);
        doc1.setName("David Sonko");
        doc1.setAge(45);


        Nurse nurse1 = new Nurse();
        nurse1.setName("Sarah Johnson");
        nurse1.setAge(32);


        Receptionist receptionist1 = new Receptionist();
        receptionist1.setName("Mike Brown");
        receptionist1.setAge(28);


        Patient patient1 = new Patient();
        patient1.setName("John Doe");
        patient1.setAge(55);
        patient1.setCondition("hypertension");


        Patient patient2 = new Patient();
        patient2.setName("Jane Wilson");
        patient2.setAge(38);
        patient2.setCondition("flu");


        System.out.println(" Introductions ");
        doc1.introduce();
        nurse1.introduce();
        receptionist1.introduce();
        patient1.introduce();
        patient2.introduce();


        System.out.println("\n Staff Performing Duties");
        doc1.performDuties();
        nurse1.performDuties();
        receptionist1.performDuties();





        System.out.println("\nUnique Subclass Methods");
        doc1.prescribeMedicine("Lisinopril");
        nurse1.checkVitals(patient1);
        nurse1.checkVitals(patient2);
        doc1.prescribeMedicine("Ibuprofen");


        System.out.println("\n Create Appointments");
        LocalDateTime date1 = LocalDateTime.of(2026, 1, 8, 10, 0);
        LocalDateTime date2 = LocalDateTime.of(2026, 1, 8, 14, 0);
        LocalDateTime date3 = LocalDateTime.of(2026, 1, 8, 10, 0);
        LocalDateTime date4 = LocalDateTime.of(2026, 1, 8, 10, 30);

        Appointment apt1 = receptionist1.createAppointment(patient1, doc1, date1, "check Up");
        patient1.addAppointment(apt1);

        Appointment apt2 = nurse1.createAppointment(patient2, doc1, date2, "Flu symptoms");
        patient2.addAppointment(apt2);


        System.out.println("\nAppointments for " + patient1.getName() + " ");
        System.out.println(patient1.getAppointments());

        System.out.println("\n Calendar for Dr. " + doc1.getName() + " ");
        System.out.println(doc1.getAppointments());


        System.out.println("Create Prescriptions");

        Prescription prescription1 = doc1.createPrescription(patient1);
        patient1.addPrescription(prescription1);
        System.out.println("+" + prescription1);

        Prescription prescription2 = doc1.createPrescription(patient2);
        prescription2.addTreatment(new Treatment("Ibuprom", "Pain relief") {
        });
        prescription2.addTreatment(new Treatment("Azithromycin", "Antibiotics") {
        });
        patient2.addPrescription(prescription2);
        System.out.println("+" + prescription2);

        System.out.println("\n Prescriptions for " + patient1.getName() + " ");
        displayPrescriptions(patient1.getPrescriptions());

        System.out.println("\n Patient Treatment");
        patient1.receiveTreatment();
        patient2.receiveTreatment();


    }

    private static void addAppointment(Appointment appointment) {
        try {
            appointment.getDoctor().addAppointment(appointment);
            appointment.getPatient().addAppointment(appointment);
            System.out.println("✓ Appointment added: " + appointment);
        } catch (Exception e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
    }

    private static void displayAppointments(java.util.List<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            appointments.forEach(System.out::println);
        }
    }

    private static void displayPrescriptions(java.util.List<Prescription> prescriptions) {
        if (prescriptions.isEmpty()) {
            System.out.println("No prescriptions.");
        } else {
            for (Prescription p : prescriptions) {
                System.out.println(p);
                for (Treatment t : p.getTreatments()) {
                    System.out.println("  - Treatment: " + t.getName() + " - " + t.getDescription());
                }
            }
        }

    }
}
