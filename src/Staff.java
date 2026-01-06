public abstract class Staff extends Person{
    private String role;

    public Staff(String role) {
        this.role=role;
    }

    public String getRole() {
        return role;
    }
    public abstract void performDuties();


}
