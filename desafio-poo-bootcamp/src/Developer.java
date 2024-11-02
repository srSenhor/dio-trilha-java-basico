import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Developer {

    private Set<Content> subscribedContent;
    private Set<Content> finishedContent;
    private String nickname;
    private double xp;

    public Developer(String nickname) {
        this.nickname = nickname;
        this.xp = 0.0d;
        subscribedContent = new LinkedHashSet<>();
        finishedContent = new LinkedHashSet<>();
    }

    public void subscribeOnBootcamp(Bootcamp bootcamp) {
        bootcamp.subscribeOn(this);
        this.subscribedContent.addAll(bootcamp.getContents());
    }

    private double calculateTotalXP() {
        return this.finishedContent.stream().mapToDouble(Content::calculateXP).sum();
    }

    public double getCurrentXP() {
        return this.xp = calculateTotalXP();
    }

    public void progress() {

        Optional<Content> first = this.subscribedContent.stream().findFirst();

        if (!first.isPresent()) {
            System.err.println("No subscribed contents available");
            return;
        }

        subscribedContent.remove(first.get());
        finishedContent.add(first.get());

    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getFinishedContent() {
        return finishedContent;
    }

    public void setFinishedContent(Set<Content> finishedContent) {
        this.finishedContent = finishedContent;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void showProfile() {
        System.out.printf("==========--- %s's profile ---==========\n", this.nickname);
        System.out.printf("|> XP: %.2f\n", this.getCurrentXP());
        System.out.println("|> Subscribed Contents:");
        subscribedContent.stream().forEach((content) -> {
            System.out.println("\t<> " + content.toString());
        });
        System.out.println("|> Finished Contents:");
        finishedContent.stream().forEach((content) -> {
            System.out.println("\t<> " + content.toString());
        });
        System.out.println("=================------=================\n");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((subscribedContent == null) ? 0 : subscribedContent.hashCode());
        result = prime * result + ((finishedContent == null) ? 0 : finishedContent.hashCode());
        result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
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
        Developer other = (Developer) obj;
        if (subscribedContent == null) {
            if (other.subscribedContent != null)
                return false;
        } else if (!subscribedContent.equals(other.subscribedContent))
            return false;
        if (finishedContent == null) {
            if (other.finishedContent != null)
                return false;
        } else if (!finishedContent.equals(other.finishedContent))
            return false;
        if (nickname == null) {
            if (other.nickname != null)
                return false;
        } else if (!nickname.equals(other.nickname))
            return false;
        return true;
    }

}
