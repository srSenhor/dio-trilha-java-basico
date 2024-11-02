public abstract class Content {

    protected static final double DEFAULT_XP = 10.0d;
    private String title;
    private String description;

    public Content(String title, String desc) {
        this.title = title;
        this.description = desc;
    }

    protected abstract double calculateXP();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Content [title=" + title + ", description=" + description + "]";
    }

}
