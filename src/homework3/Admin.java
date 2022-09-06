package homework3;

public class Admin extends People implements Administration, ModeratorInterface{

    public Admin(String nickName) {
        super(nickName);
    }

    @Override
    public void addModerator(String name) {
        DataBase.addUserLink(new UserLink(new Moderator(name)));
    }

    @Override
    public void addAdmin(String name) {
        DataBase.addUserLink(new UserLink(new Admin(name)));
    }

    @Override
    public void addUser(String name) {
        DataBase.addUserLink(new UserLink(new User(name)));
    }

    @Override
    public void delUserById(Long id) {
        DataBase.delUserById(id);
    }

}
