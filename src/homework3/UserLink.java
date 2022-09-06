package homework3;

public class UserLink {
    private static long userId;
    public People people;
    public long id;

    public UserLink(People people) {
        this.people = people;
        this.id = userId;
        userId++;
    }

    public long getUserId() {
        return id;
    }

    public People getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return "UserLink{" +
                id + " people=" + people +
                '}';
    }
}
