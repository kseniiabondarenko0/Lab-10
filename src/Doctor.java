public class Doctor extends Staff{

    private int id;
    private String name;

    public Doctor() {
        super("Doctor");
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    @Override
    public void performDuties() {
        System.out.println(getName() + "is checking medical conditions" );
    }

    public void prescribeMedicine(String medicine){
        System.out.println(getName() + " prescribed " + medicine);
    }
}
