import java.time.LocalDate;

public class Mentorship extends Content {

    private LocalDate date;

    public Mentorship(String title, String desc) {
        super(title, desc);
        this.date = LocalDate.now();
    }

    @Override
    protected double calculateXP() {
        return Content.DEFAULT_XP + 20.0d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship\t[title=" + getTitle() 
                + ", description=" + getDescription()
                + ", [date=" + date + "]";
    }

    
}
