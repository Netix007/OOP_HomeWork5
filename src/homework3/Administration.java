package homework3;

public interface Administration {
    void addModerator(String name);
    void addAdmin(String name);
    void addUser(String name);
    void delUserById(Long id);
}
