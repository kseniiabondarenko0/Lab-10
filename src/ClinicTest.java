
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


        System.out.println("\n Patient Treatment");
        patient1.receiveTreatment();
        patient2.receiveTreatment();


        System.out.println("\nUnique Subclass Methods");
        doc1.prescribeMedicine("Lisinopril");
        nurse1.checkVitals(patient1);
        nurse1.checkVitals(patient2);
        doc1.prescribeMedicine("Ibuprofen");
        }
    }
