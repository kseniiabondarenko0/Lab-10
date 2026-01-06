import java.util.List;

public class Doctor extends Staff{

    private int id;
    private String name;
    private List<Appointment> appointments;

    public Doctor() {
        super("Doctor");
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }


    public Prescription createPrescription(Patient patient) {
        return new Prescription(this, patient);
    }

    public void addAppointment(Appointment appointment) throws Exception {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).overlaps(appointment)) {
                throw new Exception("Doctor" + getName() + " already has an appointment at this time!");
            }
        }
        appointments.add(appointment);
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + "is checking medical conditions" );
    }

    public void prescribeMedicine(String medicine){
        System.out.println(getName() + " prescribed " + medicine);
    }
}
