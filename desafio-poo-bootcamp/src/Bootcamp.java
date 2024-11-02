import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String title;
    private String description;
    private Set<Developer> subscribedDevelopers;
    private Set<Content> contents;
    private final LocalDate START_DATE;
    private final LocalDate END_DATE;

    public Bootcamp(String title, String description, int timeInDays) {

        this.title = title;
        this.description = description;
        this.START_DATE = LocalDate.now();
        this.END_DATE = this.START_DATE.plusDays(timeInDays);
        this.subscribedDevelopers = new HashSet<>();
        this.contents = new LinkedHashSet<>();

    }

    public void addContent(Content content) {

        if (content == null ) throw new RuntimeException("Cannot add null content");

        if (!contents.add(content)) System.err.println("Content is already on bootcamp");

    }

    public void subscribeOn(Developer dev) {

        if (dev == null ) throw new RuntimeException("Cannot subscribe with a null developer");

        if (!subscribedDevelopers.add(dev)) System.err.println("Dev is already subscribed on bootcamp");

    }

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

    public Set<Developer> getSubscribedDevelopers() {
        return subscribedDevelopers;
    }

    public void setSubscribedDevelopers(Set<Developer> subscribedDevelopers) {
        this.subscribedDevelopers = subscribedDevelopers;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    public LocalDate getStarDate() {
        return START_DATE;
    }

    public LocalDate getEndDate() {
        return END_DATE;
    }

    public void getInfo() {
        System.out.printf("==========--- %s ---==========\n", this.title);
        System.out.printf("|> Description: %s\n", this.description);
        System.out.printf("|> Started on: %s\n", this.START_DATE);
        System.out.printf("|> Ends in: %s\n", this.END_DATE);
        System.out.println("|> Contents:");
        contents.stream().forEach((content) -> {
            System.out.println("\t<> " + content.toString());
        });
        System.out.println("|> Subscribed devs:");
        subscribedDevelopers.stream().forEach((dev) -> {
            System.out.println("\t<> " + dev.getNickname());
        });
        System.out.println("=================------=================\n\n");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((subscribedDevelopers == null) ? 0 : subscribedDevelopers.hashCode());
        result = prime * result + ((contents == null) ? 0 : contents.hashCode());
        result = prime * result + ((START_DATE == null) ? 0 : START_DATE.hashCode());
        result = prime * result + ((END_DATE == null) ? 0 : END_DATE.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (subscribedDevelopers == null) {
            if (other.subscribedDevelopers != null)
                return false;
        } else if (!subscribedDevelopers.equals(other.subscribedDevelopers))
            return false;
        if (contents == null) {
            if (other.contents != null)
                return false;
        } else if (!contents.equals(other.contents))
            return false;
        if (START_DATE == null) {
            if (other.START_DATE != null)
                return false;
        } else if (!START_DATE.equals(other.START_DATE))
            return false;
        if (END_DATE == null) {
            if (other.END_DATE != null)
                return false;
        } else if (!END_DATE.equals(other.END_DATE))
            return false;
        return true;
    }    

}
