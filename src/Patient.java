public class Patient extends Person implements Treatable{

    private String condition;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }



    @Override
    public void receiveTreatment() {
        System.out.println("Treatment received to: " +  getName() + " for " + condition);
    }


}
