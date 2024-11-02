public class Course extends Content {

    private Rate rate;
    private int workload;

    public Course(String title, String desc, int workload) {
        super(title, desc);
        this.rate = Rate.NOT_EVALUATED;
        this.workload = workload;
    }

    public void evaluate(Rate rate) {
        this.rate = rate;
    }

    @Override
    protected double calculateXP() {
        return DEFAULT_XP * workload;
    }

    public Rate getRate() {
        return rate;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course\t[title=" + getTitle() 
                    + ", description=" + getDescription()
                    + ", rate=" + rate 
                    + ", workload=" + workload 
                + "h ]";
    }
    
    

}
